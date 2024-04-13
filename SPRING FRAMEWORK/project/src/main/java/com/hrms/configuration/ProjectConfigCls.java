package com.hrms.configuration;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan(basePackages = { "com.hrms" })
public class ProjectConfigCls 
{	
	 @Bean public ViewResolver resolverob() { 
	 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	 resolver.setPrefix("/WEB-INF/view/");
	 resolver.setSuffix(".jsp");
	 return resolver; 
	 }
	 

//	@Bean
//	public DataSource dataSourceOB() {
//		DriverManagerDataSource driverManager = new DriverManagerDataSource();
//		driverManager.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//		driverManager.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
//		driverManager.setUsername("gunasantosh");
//		driverManager.setPassword("chinni2722");
//		return driverManager;
//	}
//
//	@Bean
//	public JdbcTemplate template() {
//		return new JdbcTemplate(dataSourceOB());
//	}

}
