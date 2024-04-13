<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page isELIgnored="false" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hiii boss</h1>

<%Object name=request.getAttribute("log");%>

<%=name%>
  
<%--  

${login.uname}
${login.psw}

 --%>
 

</body>
</html>