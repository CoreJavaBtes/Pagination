package PKG1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration_Servlet
 */
@WebServlet("/Registration_Servlet")
public class Registration_Servlet extends HttpServlet {

	
	 
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Registration_Servlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		//con = Db_Connections.db();
		PrintWriter out = response.getWriter();
		out.print("Hello Guys...");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String user = request.getParameter("name");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String gen = request.getParameter("gen");
		String contact = request.getParameter("tel");
		String address = request.getParameter("add");
		String pin = request.getParameter("pin");
		String submit = request.getParameter("Sub");
		String cancel = request.getParameter("Can");
		
		Connection con = Db_Connections.db();
		
		try {
			PreparedStatement pd = con
					.prepareStatement("Insert into tb_test (Name,Uname,Password,Email,Gender,Contact,Address,Pin) "
							+ "values(?,?,?,?,?,?,?,?) ");

			// pd.setInt(1,0 );
			pd.setString(1, fname);
			pd.setString(2, user);
			pd.setString(3, pass);
			pd.setString(4, email);
			pd.setString(5, gen);
			pd.setString(6, contact);
			pd.setString(7, address);
			pd.setString(8, pin);
		
			int i = pd.executeUpdate();

			if (i > 0) {
				out.print("Successfuly submited :: ");

				// response.sendRedirect("/Login.html");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

/*	void insert(String name, String user, String pass, String email, String gen, String contact,
			String address, String pin) {
		con = Db_Connections.db();
		try {
			PreparedStatement pd = con
					.prepareStatement("Insert into tb_test (Name,Uname,Password,Email,Gender,Contact,Address,Pin) "
							+ "values(?,?,?,?,?,?,?,?) ");

			// pd.setInt(1,0 );
		
			pd.setString(2, user);
			pd.setString(3, pass);
			pd.setString(4, email);
			pd.setString(5, gen);
			pd.setString(6, contact);
			pd.setString(7, address);
			pd.setString(8, pin);
			pd.setString(9, name);
			int i = pd.executeUpdate();

			if (i > 0) {
				out.print("Successfuly submited :: ");

				// response.sendRedirect("/Login.html");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/

}
