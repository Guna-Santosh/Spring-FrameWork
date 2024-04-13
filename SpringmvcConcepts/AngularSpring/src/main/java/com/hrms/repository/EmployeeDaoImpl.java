package com.hrms.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrms.beancomponents.CandidateData;
import com.hrms.beancomponents.Interview_Maintain;
import com.hrms.beancomponents.MaintenanceVacancies;
import com.hrms.beancomponents.Users;


@Repository
@SuppressWarnings({ "unchecked", "rawtypes" })
public class EmployeeDaoImpl {

	@Autowired	private JdbcTemplate template;
	@Autowired  private NamedParameterJdbcTemplate namedtemplate;
	@Autowired  private MaintenanceVacancies maintenance;
	@Autowired  private Users user;

// Scrren -1 Data Base Insert Query
	public void insert(CandidateData emp) 
	{
//namedparameter
		String mail="";
		String qry="select * from users ";
		List<Users>  obj=namedtemplate.query(qry, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				user.setMailid(rs.getString(1));
				
				return user;
			}
		});
		for(Users beanmail :obj)
		mail=beanmail.getMailid();
		System.out.println("Your mailId is: "+mail);
		String userMailId=user.getMailid();
		
		
		
		 String sql="insert into user_details values (:id,:mail_id,:first_name,:last_name,:phone_no,:qualification,:resume)";
		 MapSqlParameterSource ok=new MapSqlParameterSource();
		
		 ok.addValue("id",new Random().nextInt(10000));
		 ok.addValue("mail_id", userMailId);
		 ok.addValue("first_name", emp.getFirstname());
		 ok.addValue("last_name", emp.getLastname());
		 ok.addValue("phone_no", emp.getPhoneno());
		 ok.addValue("qualification", emp.getQualification());
		 
//		 ok.addValue("resume", emp.getResume());
		 ok.addValue("resume", emp.getResume(), Types.BINARY);
//		 		 namedtemplate.update(sql, ok);
		 
		
	}
	
// Scrren -2 Data Base Insert Query
	public void interview(Interview_Maintain interview) 
	{
//namedparameter
		 String sql="insert into interview_maintain values (:id,:domain,:experience,:slot,:date_time)";
		 MapSqlParameterSource ok=new MapSqlParameterSource();
		 ok.addValue("id",new Random().nextInt(10000));
		 ok.addValue("domain", interview.getDomain());
		 ok.addValue("experience", interview.getExperince());
		 ok.addValue("slot",interview.getSlot());
		 ok.addValue("date_time", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new java.util.Date()));
		 namedtemplate.update(sql, ok);
		 System.out.println("data inserted successfully");		
		
	}
	
	
//Screen -2.5 	
	
	
	
// Screen-3 Retrive From DataBase	
//	public List<MaintenanceVacancies> retrieveSelectQuestion()
//	{
//	}	
//	
//testing 	
	public void name(CandidateData emp)
	{
//		Blob on=fileData
	    String sql = "INSERT INTO boss VALUES (?,?,?,?,?)";
//	    template.update(sql,emp.getFirstname(),emp.getLastname(),emp.getPhoneno(),emp.getQualification(), );
	}

	public List<MaintenanceVacancies> retrieveSelectQuestion() 
	{
		 System.out.println("data inserted successfully");
		 System.out.println("dao data");
		 
		 String qry1="select * from maintenance_vacancies where active = 'y'";	
		 System.out.println("db");
		 List<MaintenanceVacancies> obj1=namedtemplate.query(qry1, new BeanPropertyRowMapper<MaintenanceVacancies>(MaintenanceVacancies.class));
//		System.out.println(maintenance);
//		 for(MaintenanceVacancies ob:obj1) 
//		 {
//			 System.out.println(ob.getDomain()+" "+ob.getField());
//			 
//		 }
		 return obj1;
		 
	}


	
	
	
	
	
	

}










//			String qry="select * from questionmaintain where active = true";
//		QuestionRetrieve ob=new QuestionRetrieve();
//		List<MaintainQuestion> obj=namedJdbcTemplate.query(qry, ob);
//		return obj;
//	

//jdbctemplate
//		int update = template.update("insert into interview_maintain values(?,?,?,?,?)",
//							new Random().nextInt(10000), 
//							interview.getDomain(), 
//							interview.getExperince(), 
//							interview.getSlot(),
//							new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new java.util.Date()));
//		System.out.println("rows = " + update);




//jdbctemplate
//		int update = template.update("insert into userdetails values(?,?,?,?,?)", 
//										emp.getFirstname(), emp.getLastname(),
//										emp.getPhoneno(), emp.getQualification(),
//										emp.getResume());
//		System.out.println("rows = " + update);