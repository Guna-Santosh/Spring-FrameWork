package springmvc.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@SuppressWarnings({ "unchecked", "rawtypes", "removal" })
@Controller
//@RequestMapping("/first")
public class FrontController {
	@Autowired
	private Insertdao empob;
	

	@RequestMapping("/signup")
	public String demo() {
		System.out.println("login");
		return "login";
	}

	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String Ans(
			/* HttpServletRequest ok */

			/*
			 * @RequestParam("uname") String uname,
			 * 
			 * @RequestParam("psw") String pword, Model model
			 */
			@ModelAttribute UserLogin login, Model model) {

		System.out.println("View to Controller ");

		System.out.println(login.getUname());
		System.out.println(login.getPsw());

		model.addAttribute("log", login);

//		System.out.println(ok.getParameter("uname"));

		/*
		 * System.out.println("User Name :- "+uname);
		 * System.out.println("Password  :- "+pword); model.addAttribute("uname",
		 * uname); model.addAttribute("pwd", pword);
		 */

		return "process";
	}

	@RequestMapping("/register")
	public String testing() {
		System.out.println("registration");
		return "registration";
	}

	@RequestMapping("/b_to_f")
	public String model(Model m) {
		System.out.println("Sending Contoller to View using Model Interface ");

		m.addAttribute("name", "santosh");
		m.addAttribute("id", 10);

		List list = new ArrayList();
		list.add(22);
		list.add("nani");
		list.add(new Integer(27));
		list.add(new String("chinni"));

		m.addAttribute("li", list);

//		list.forEach(p->{System.out.println(p);});

		return "model";
	}

	@RequestMapping("/bk_to_fr")
	public ModelAndView modelAndView() {
		System.out.println("Sending Contoller to View Using ModelAndView Class ");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "santosh");
		mv.addObject("id", 10);

		List list = new ArrayList();
		list.add(22);
		list.add("ricky");
		list.add(new Integer(27));
		list.add(new String("akki"));

		mv.addObject("li", list);

		mv.setViewName("model&view");

		return mv;
	}

	@RequestMapping("/add")
	public String dao() {
		System.out.println("database");
		return "insertdao";
	}

	@RequestMapping("/insadd")
	public String adddao(EmpData empob1, @RequestParam("id") int empid, @RequestParam("name") String empname,
			@RequestParam("age") int empage, @RequestParam("address") String empaddress, Model model) {
		empob1.setId(empid);
		empob1.setName(empname);
		empob1.setAge(empage);
		empob1.setAddress(empaddress);

		System.out.println(empob1.getName());
		Insertdao empob = new Insertdao();
		empob.insert(empob1);

		return "insadd";
	}

}
