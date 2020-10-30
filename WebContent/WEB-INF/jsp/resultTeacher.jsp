<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is a result page....</h1>
<%
String m;
int i=(int)request.getAttribute("i");
double sal=(double)request.getAttribute("salary");
String error=(String)request.getAttribute("err");
if(i>0){
	m="Successfull registration with salary="+sal;	
}else{
	m="Unsuccessfull registration with error="+error;
}
%>
<h3>The output received is :<%=m %></h3>
<jsp:include page="../../index.jsp"></jsp:include>
</body>
</html>