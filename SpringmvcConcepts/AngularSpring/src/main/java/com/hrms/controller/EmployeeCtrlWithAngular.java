package com.hrms.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hrms.beancomponents.CandidateData;
import com.hrms.beancomponents.Interview_Maintain;
import com.hrms.beancomponents.MaintenanceVacancies;
import com.hrms.repository.EmployeeDaoImpl;

@RestController @CrossOrigin(origins = "*")
public class EmployeeCtrlWithAngular 
{

	@Autowired EmployeeDaoImpl dao; @Autowired CandidateData user;

	@RequestMapping(value = "/getemployees",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<MaintenanceVacancies> getAllEmployees(	@RequestParam String firstname,
									@RequestParam String lastname,@RequestParam long phoneno,
									@RequestParam String Qualification,@RequestParam MultipartFile resume
								 ) throws Exception 
	{
		System.err.println("Screen -1 Data ");
		
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setPhoneno(phoneno);
		user.setQualification(Qualification);
		byte[] bytes = resume.getBytes();
		user.setResume(bytes);
		System.out.println(user.getResume());
		dao.insert(user);
		List<MaintenanceVacancies> list = dao.retrieveSelectQuestion();
		for(MaintenanceVacancies ob:list) 
		 {
			 System.out.println(ob.getDomain()+"  "+ob.getField());
		 }
		return list;		
	}

	@PostMapping(value = "/person")
	public void interview_maintain(@RequestBody Interview_Maintain interview)
	{
		System.out.println("Screen - 2 Data");
		System.out.println(interview.getDomain());
		System.out.println(interview.getExperince());
		System.out.println(interview.getSlot());
//		dao.interview(interview);

	}

	
	
	
//	@RequestMapping(value= "/addinvacancies",method = RequestMethod.GET,consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE ) 
//    public List<MaintenanceVacancies> getSelectedquestions()
//	{
//		System.out.println("selected Retrive method"); 
//		
//    	return dao.retrieveSelectQuestion();
//    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping(value = "/test")
	public String test() {
		return "test";
	}
}












//@RequestMapping(value = "/")
//		dao.name(emp);

//		System.out.println(emp.getResume());
//	@RequestMapping(value = "/getemployees",method = RequestMethod.POST)

//		System.out.println(emp.getFirstname());
//		System.out.println(resume);
//		dao.insert(emp);
//		System.out.println(new String(resume.getBytes()));
//		emp.setResume(bytes);
//		System.out.println(emp.getResume());

//		File file=new File(emp.getResume());

//		file.length();
//		 MultipartFile mk= new MockMultipartFile(emp.getResume(), "".getBytes()) ;
//		 byte[] bytes = mk.getBytes();
//
//		 InputStream inputStream = new ByteArrayInputStream(bytes);
//		 System.out.println(file.length());

//		 InputStream inputStream = new ArrayIBytenputStream(bytes);
//		 System.err.println(inputStream.readAllBytes());
//		FileInputStream fileInputStream = new FileInputStream(mk);
//		System.err.println(fileInputStream);
//		OutputStream os= new FileOutputStream(resume);

//		System.out.println(emp.getResume());
//		File on=new File(emp.getFile());
//		System.out.println(on);
//		System.out.println(new File(emp.getResume()));
//	on.getName();
//		InputStream in = new FileInputStream(emp.getFile());
//		 Files.readAllBytes(Paths.get(emp.getFile()));
//		 Blob serialBlob = new SerialBlob(Files.readAllBytes(Paths.get(emp.getFile())));
//		emp.setResume(serialBlob);
//		dao.insert(emp);
//		System.out.println(	emp.getResume());

//	@Autowired
//	EmployeeService empService;

//			return empService.getAllEmployees() ;