package Exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExample {

	
	void m() throws NullPointerException, IOException,SQLException{
		
		System.out.println("Method 1");
		
	}
	
	void n() 
	{
		try {
			m();
		} catch (NullPointerException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void g() 
	{
		n();
	}
	public static void main(String[] args)   {
		
		ThrowsExample obj = new ThrowsExample();
		
		obj.g();
		
	}
}
