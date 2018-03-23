<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.sql.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ServiceJson.jsp" >
Name:<input type="text" name="userName"/><br/>  
Password:<input type="password" name="userPass"/><br/>  
<input type="submit" value="login" name="login"/>  
</form>

</body>
</html>

<%
if(request.getParameter("login")!=null){
 try
  {
       
   JSONObject obj1=new JSONObject();
   JSONObject obj2 = new JSONObject();
   Connection con=null;
   Statement stmt=null;
   ResultSet rs=null;
   String name = request.getParameter("name");
   String pass = request.getParameter("pass");
  Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
 stmt=con.createStatement();
 rs=stmt.executeQuery("select * from  registeration");
 int count=0;
 while(rs.next())
  {
    String username=rs.getString("Uname");
    String pass2=rs.getString("Password");
    String contact=rs.getString("Contact");
    if(username.equals(name) && pass.equals(pass2))
     {
       obj2.put("msg", "success");
        count++;
       break;
     }
  }
  if(count==0)
  {
      obj2.put("msg", "fail");
  } 
 obj1.put("obj2", obj2);

response.setContentType("application/json");
response.getWriter().write(obj1.toString());
   
 /*JSONObject obj=new JSONObject();
    
    JSONArray arr=new JSONArray();
    JSONObject json = new JSONObject();
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    if (name.equals("admin") && pass.equals("pass")) {
        json.put("msg", "success");
        json.put("msg", "success");
        json.put("msg", "success");
        json.put("msg", "success3");
    } else {
        json.put("msg", "fail");
    }
    
    arr.put(json);
    obj.put("myobj", arr);
    obj.put("outer", "value");
    response.setContentType("application/json");
    response.getWriter().write(obj.toString());*/
    }
    catch(Exception e)
     {
       System.out.println("test"+e);
     }
}
    %>