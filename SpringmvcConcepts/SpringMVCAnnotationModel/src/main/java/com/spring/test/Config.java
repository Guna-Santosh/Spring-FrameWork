package com.spring.test;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = {"com.spring.test","com.spring.dao","com.spring.controller"})
@Configuration
public class Config 
{
	@Bean
	public DispatcherServlet dispatcher() 
	{
		DispatcherServlet on=new DispatcherServlet();
		on.setContextAttribute("Anontation");
		
		return on;
		
	}
	
	@Bean
	public InternalResourceViewResolver resolverob() 
	{
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}
	@Bean  
	public DataSource dataSourceOB() 
	{
		DriverManagerDataSource driverManager =new DriverManagerDataSource();
		driverManager.setDriverClassName("org.postgresql.Driver");
		driverManager.setUrl("jdbc:postgresql://10.11.12.51:5460/training");
		driverManager.setUsername("training");
		driverManager.setPassword("training");		
		return driverManager;
	}

	@Bean
	public JdbcTemplate template() 
	{
		return new JdbcTemplate(dataSourceOB());
	}
	
	@Bean
	public void name5() 
	{
		
	}
	
	
}
