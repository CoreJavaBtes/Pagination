package Exceptionhandling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int a = 10;
		try{
			System.out.println("Hello");
			int res = a/0;
			System.out.println("Hie");
		}catch(ArithmeticException e)
		{
			
			System.out.println(e);
		}catch (Exception e) {
			// TODO: handle exception
		}catch (Throwable e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("Hieeeee");
		}
		
		
		
	}

}
