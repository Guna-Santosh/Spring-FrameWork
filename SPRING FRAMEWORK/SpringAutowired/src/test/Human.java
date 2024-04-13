package test;

import org.springframework.beans.factory.annotation.Autowired;

public class Human 
{	
	private Heart heart;
	public Human() {}

	
	public Human(Heart heart) 
	{
		this.heart = heart;
	}
	@Autowired
	public void setHeart(Heart heart) 
	{
		this.heart = heart;
		System.out.println("setting : ");
	}
	
	public void sohw() 
	{
		if(heart!=null)
			heart.pump();
		else
			System.out.println("ur dead");
	}
	
}	