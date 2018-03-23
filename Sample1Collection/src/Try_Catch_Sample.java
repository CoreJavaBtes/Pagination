import java.io.IOException;

public class Try_Catch_Sample {

	
	void m() throws IOException
	{
		System.out.println("Throws class");
	}
	
	
	void n() //throws IOException
	{
		try {
			m();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void h() //throws IOException
	{
		n();
	}
	public static void main(String[] args) throws IOException {
		
	Try_Catch_Sample obj = new Try_Catch_Sample();
		obj.h();	
	}
}
