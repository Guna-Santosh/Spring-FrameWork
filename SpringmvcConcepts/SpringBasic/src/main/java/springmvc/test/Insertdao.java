package springmvc.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Insertdao {
	
	private JdbcTemplate template;
	
	public void insert(EmpData empob) {

		int update = template.update("insert into boss(id,name,age,address) values(?,?,?,?)", empob.getId(),
				empob.getName(), empob.getAge(), empob.getAddress());
		System.out.println("rows = " + update);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.template = jdbcTemplate;
	}

}
