<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     
    <%@ page import=" java.sql.Connection"%>
    <%@ page import ="java.sql.DriverManager"%>
    <%@ page import ="java.sql.ResultSet"%>
   <%@ page import ="java.sql.Statement"%>
  <%--  <%@page import ="org.json.simple.JSONObject" %>
   <%@page import="org.json.simple.JSONArray"%>  --%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>

<%
//JSONObject obj = new JSONObject();

//JSONArray jarr = new JSONArray();
    try{
    	
    
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
  
   Class.forName("com.mysql.jdbc.Driver");
  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
  stmt=con.createStatement();
  rs=stmt.executeQuery("select * from  registeration ");
  int count=0;
  String name,pass,cont;
  while(rs.next())
  {
	   name = rs.getString(2);
	   pass = rs.getString(3);
	   cont = rs.getString(4);
	   /* JSONObject obj1 = new JSONObject(); 
	  obj1.put("Name", name);
	  obj1.put("Pass", pass);
	  obj1.put("Contact", cont);
	  jarr.add(obj1); */
	   System.out.println(name);
	 
  }
 
//  obj.put("Message", jarr); 
 // System.out.println(obj.toJSONString());
 
    }catch (Exception e) {
		// TODO: handle exception
	}
%>