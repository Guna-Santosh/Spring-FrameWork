package test;

import java.util.BitSet;

@SuppressWarnings("serial")
public class Printing1TO100 
{
  public static void main(String[] args) 
  {
		CharSequence set = new BitSet() {
		{set(1, 101);}}.toString();
		System.out.append(set, 1, set.length());
	}}
	
	
	/* postgresql */ 
//	  Class.forName("org.postgresql.Driver");
//	  Connection com=DriverManager.getConnection("jdbc:postgresql://localhost:5432/training ","nani","chinni");
	  
	  /*
		 * jdbc:postgresql://localhost:5432/training 
		 * jdbc is the API,
		 * postgresql is the database, 
		 * localhost is the server name on which mysql is running, we may also use IP address, like 10.11.12.51
		 * 5432 is the port number
		 * training is the database name.
		 * nani is username
		 * chinni is password
		 /  
	  
	  / Oracle /
//  Class.forName("oracle.jdbc.driver.OracleDriver");
//	  Connection com=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nani","chinni");
	  
	  / MySql /
//  Class.forName("com.mysql.jdbc.Driver");
//	  Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST","nani","chinni");
	  
	  /
		 * jdbc:mysql://localhost:3306/TEST 
		 * jdbc is the API,
		 * mysql is the database, 
		 * localhost is the server name on which mysql is running, we may also use IP address, like 10.11.12.51
		 * 3306 is the port number
		 * TEST is the database name.
		 * nani is username
		 * chinni is password
		 */
	
	
