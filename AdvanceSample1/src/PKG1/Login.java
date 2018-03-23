package PKG1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
         //config = getServletConfig();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		ServletConfig config = getServletConfig();
		
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    String p=request.getParameter("userPass");  
		    
		    String name = config.getInitParameter("username");
		    String pass = config.getInitParameter("password");
		    if(p.equals(pass)){  
		    	  out.print("Hurry!!!!!"); 
		        RequestDispatcher rd=request.getRequestDispatcher("/WelcomeServlet");  
		     // rd.include(request, response); 
		       rd.forward(request, response);  
		    }  
		    else{  
		        out.print("Sorry "+ name +" UserName or Password Error!");  
		        RequestDispatcher rd=request.getRequestDispatcher("/Login.html");  
		       rd.include(request, response);  
		       //rd.forward(request, response);  
		                      
		        }  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
