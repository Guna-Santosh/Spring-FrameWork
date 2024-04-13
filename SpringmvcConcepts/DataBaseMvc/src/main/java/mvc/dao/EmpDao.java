package mvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import mvc.beans.EmpData;

public class EmpDao 
{
	public void save(EmpData bean) 
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://10.11.12.51:5460/training");
		ds.setUsername("training");
		ds.setPassword("training");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(ds);
		
		int update = jdbcTemplate.update("insert into boss values(?,?,?,?)",
											bean.getId(),  bean.getName(),
											bean.getAge(), bean.getAddress()
										);
		System.out.println("rows = " + update);
	}

}
