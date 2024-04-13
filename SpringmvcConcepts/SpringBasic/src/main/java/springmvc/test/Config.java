package springmvc.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

@ComponentScan(basePackages = {"springmvc.dao", "springmvc.test"})
public class Config
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Bean
	public DataSource dsob()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("org.postgresql.Driver");
		dmds.setUrl("jdbc:postgresql://10.11.12.51:5460/training");
		dmds.setUsername("training");
		dmds.setPassword("training");
	return dmds;
	} 
	
	  @Bean
	  public JdbcTemplate jdbcTemplate() {
	    JdbcTemplate jdbcTemplate = new JdbcTemplate();
	    jdbcTemplate.setDataSource(dsob());
	    return jdbcTemplate;
	  }

	
	
}
