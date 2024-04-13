<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form   
		action="insadd" 
		method="post">
  

  <div class="container">
    <label><b>id</b></label>
    	<input 
    		type="number" 
    		placeholder="Enter id" 
    		name="id" required>
    		
    <label><b>name</b></label>
    	<input 
    		type="text" 
    		placeholder="Enter name" 
    		name="name" required>
    		
    <label><b>age</b></label>
    	<input 
    		type="number" 
    		placeholder="Enter age" 
    		name="age" required>
    		
    <label><b>address</b></label>
    	<input 
    		type="text" 
    		placeholder="Enter address" 
    		name="address" required>
    		
    		
    		
    		
    <button type="submit">Login</button>
</div>
</form>



</body>
</html>