
<% 
	String msg=(String)request.getAttribute("msg");
	if(msg!=null){
%>
<font color="red">
<%
		out.println(msg);
%>
</font>
<%
	}
%>
<form action="log">
	User Name : <input type="text" name="uname" /></br>
	<input type="submit" />
	
</form>


<form action="forgetPasswd">
	<input type="submit" value="Forget Password" />
</form>