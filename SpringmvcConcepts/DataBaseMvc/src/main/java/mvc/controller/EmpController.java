package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.beans.EmpData;
import mvc.dao.EmpDao;

@Controller
public class EmpController {

	public EmpDao dao;

	@RequestMapping("/add")
	public String showform(@ModelAttribute EmpData emp){return "insert";} 

	@RequestMapping(value = "/addDao", method = RequestMethod.POST)
	public String save(@ModelAttribute EmpData emp) 
	{
		new EmpDao().save(emp);
		return "view";
	}

}
