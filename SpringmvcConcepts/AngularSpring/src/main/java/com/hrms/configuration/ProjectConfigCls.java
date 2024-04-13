package com.hrms.configuration;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@ComponentScan(basePackages = { "com" })
@EnableWebMvc
public class ProjectConfigCls 
{	
//	 @Bean public ViewResolver resolverob() { 
//	 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//	 resolver.setPrefix("/WEB-INF/");
//	 resolver.setSuffix("/");
//	 return resolver; 
//	 }
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
	    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	    multipartResolver.setMaxUploadSize(100000);
	    return multipartResolver;
	}
	
//	@Bean
//	public StandardServletMultipartResolver multipartResolver() {
//	    return new StandardServletMultipartResolver();
//	}

	@Bean
	public DataSource dataSourceOB() {
		DriverManagerDataSource driverManager = new DriverManagerDataSource();
		driverManager.setDriverClassName("org.postgresql.Driver");
		driverManager.setUrl("jdbc:postgresql://10.11.12.82:5460/training");
		driverManager.setUsername("training");
		driverManager.setPassword("training");
		return driverManager;
	}

	@Bean
	public JdbcTemplate template() {
		return new JdbcTemplate(dataSourceOB());
	}
	@Bean
	public NamedParameterJdbcTemplate namedtemplate() {
		return new NamedParameterJdbcTemplate(dataSourceOB());
	}

}
