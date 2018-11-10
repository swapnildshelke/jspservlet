<%@page import="java.util.ArrayList"%>
<%
	ArrayList<String> alEmp=(ArrayList)request.getAttribute("data");
	
	for(String empname : alEmp){
		out.println(empname);
	}
%>