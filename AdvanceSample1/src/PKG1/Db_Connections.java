package PKG1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Connections {
	
	 static Connection con = null;
	  
	    
	    public static Connection db()
	    {
	    
	          
	        try {
				Class.forName("com.mysql.jdbc.Driver");
				   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demotest","root","");
	                System.out.println("second::");
	           
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	             
	             
	   
	       return con;
	    }
	    
	 

}
