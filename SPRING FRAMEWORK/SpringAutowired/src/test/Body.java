package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{
	public static void main(String[] args) 
	{
		ApplicationContext apcon=new ClassPathXmlApplicationContext("bean.xml");
	    Human bean = apcon.getBean("human" ,Human.class);
	    bean.sohw();
	
	}

}
