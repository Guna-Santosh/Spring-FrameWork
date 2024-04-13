package test.phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile
{
	public static void main(String[] args) 
	{
		ApplicationContext o=new ClassPathXmlApplicationContext("bean.xml");
		
		Sim sim = o.getBean("sim",Sim.class);   
		sim.m1();
			
			
			
	}
}