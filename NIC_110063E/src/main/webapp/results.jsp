<%@page import="nic.NIC"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>


<h3>Result of the Nic interpolation</h3>
<%
	String nicno = request.getParameter("nicnumber");
	
        NIC nic1=new NIC();        
        nic1.calculate(nicno);       
	out.println(nic1.getResult());
		
%>
</head>
<body>

</body>
</html>