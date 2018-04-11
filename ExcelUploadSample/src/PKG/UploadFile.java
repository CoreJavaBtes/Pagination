package PKG;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.File;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
 * Servlet implementation class UploadFile
 */
@WebServlet("/UploadFile")
public class UploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

     private final String UPLOAD_DIRECTORY = "E:/Files/";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Db_Connections db = new Db_Connections();
		Connection con = db.db();
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
	}
}
