package test;

import java.text.SimpleDateFormat;
import java.util.Random;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		java.util.Date date =new java.util.Date();
		
//System.out.println(java.time.LocalDateTime.now());

//System.out.println(new java.sql.Date(System.currentTimeMillis()));

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		System.out.println(formatter.format(new java.util.Date()));
//		System.out.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new java.util.Date()));
	
		
		System.out.println(new Random().nextInt(10000));
	}

}
