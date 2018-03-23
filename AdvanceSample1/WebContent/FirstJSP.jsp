<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%--Hello World!<--%> <!--  Comment Tag -->
        <%!int x=10;
        public int cube(int x)
        {
        	return (x*x*x);
        }%> <!--  Declaration-->
        <%=x%><br> <!--  Expression-->
        <%			
       for(int i=1;i<=7;i++)
       {
        %><!--  Scriptlet Tag-->
        
        <font color="red" size="<%=i%>">Sipika</font><br>
        <%
       }
       %>
       <h>My Cube is = <%=cube(3) %> </h><br>
       
       <%   
	out.print("Welcome "+request.getParameter("userName"));  
  
	String driver=config.getInitParameter("dname");  
	out.print("driver name is="+driver);  
	%>  
	<br>
	<%
	out.print(""+application.getInitParameter("Name") );
	%>
    
</body>
</html>