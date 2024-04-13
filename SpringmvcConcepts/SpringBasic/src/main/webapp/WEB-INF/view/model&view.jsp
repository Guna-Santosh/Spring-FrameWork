<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%  String name=(String)request.getAttribute("name"); 
 Integer id=(Integer)request.getAttribute("id"); 

  List list=(List)request.getAttribute("li"); %>


<h1>
	<%=name %>
	<%=id %>
<%-- 	<%=list.forEach(p->{out.print(p);}); %> --%>
<%for(Object k:list){%>

<h1> <%=k %></h1>

 
<%} %>




</body>
</html>