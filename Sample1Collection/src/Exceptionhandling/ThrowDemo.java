package Exceptionhandling;

public class ThrowDemo {
	
	void age(int a)
	{
		if(a>18)
		{
			System.out.println("You can Vote");
		}else{
			throw new CustomException("NotValidException");
		}
	}
	
	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		obj.age(12);
	}

}
