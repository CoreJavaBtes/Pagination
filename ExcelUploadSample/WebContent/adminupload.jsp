<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Choose File to Upload in Server</h3>
        <form action="adminupload.jsp" method="post" enctype="multipart/form-data">
                <input type="file" name="file" /> 
                <input type="submit" name = "upload" value="upload" />
                </form>
         <%@ page import="javax.servlet.*" %>
         <%@ page import="javax.servlet.http.*" %>
         <%@ page import="java.sql.*" %>
         <%@ page import="org.apache.commons.fileupload.FileItem"%>
         <%@ page import ="org.apache.commons.fileupload.FileItemFactory"%>
         <%@ page import=" org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
         <%@ page import=" org.apache.commons.fileupload.servlet.ServletFileUpload" %>
         <%@ page import=" java.util.List"%>
         <%@ page import="java.io.File" %>
                      
             
		<%
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	final	String UPLOAD_DIRECTORY="E:/Files/";
		 boolean isMultipart = ServletFileUpload.isMultipartContent(request);

	        // process only if its multipart content
	        if (isMultipart) {
	                // Create a factory for disk-based file items
	                FileItemFactory factory = new DiskFileItemFactory();

	                // Create a new file upload handler
	                ServletFileUpload upload = new ServletFileUpload(factory);
	                try {
	                    // Parse the request
	                    List<FileItem> multiparts = upload.parseRequest(request);

	                   for (FileItem item : multiparts) {
	                   if (!item.isFormField()) {
	                   String name = new File(item.getName()).getName();
	                   item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
	                   
	                   String fp1=UPLOAD_DIRECTORY.replace("\\" ,"/");
		               fp1=fp1+"/"+name;
		               System.out.println("1111111111");
		              
		               try {
		            	   String query1 = "LOAD DATA INFILE '"+fp1+"'  INTO TABLE attendance FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' ";
		            	   PreparedStatement pd = con.prepareStatement(query1);
		               
		                 pd.executeUpdate();
		                 // File uploaded successfully
		                 request.setAttribute("message", "Your file has been uploaded!");
	                   
	                
	                        
	               
	               
	                } 
	                catch (Exception e) 
	                {
	                 request.setAttribute("message", "File Upload Failed due to " + e);
	                }
	        } else 
	        
	        request.setAttribute("message", "This Servlet only handles file upload request");
	        
	        request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

	                
	        }catch(Exception e)
	                {
	        	 request.setAttribute("message", "This Servlet only handles file upload request");
	 	        
	 	       	                }
	        }
	        
	        
	%>
       
</body>
</html>