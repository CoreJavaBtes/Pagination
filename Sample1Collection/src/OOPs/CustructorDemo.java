package OOPs;

public class CustructorDemo {
	
	double a,b;
	
	public CustructorDemo(){
		System.out.println("I Am Default Constructor");
	}
	
	public CustructorDemo(double a)
	{
		this();
		//a = a1;
		this.a = a;
	}
	
	public CustructorDemo(double a,double b)
	{
		this(a);
		//a = a1 ;
		//b = b1;
	//	this.a = a;
		this.b = b;
	}
	
	void show()
	{
		System.out.println("Value ::"+a);
		System.out.println("Value ::"+b);
	}
	
	
	
	public static void main(String[] args) {
		
		//CustructorDemo obj = new CustructorDemo();
		//CustructorDemo obj1 = new CustructorDemo(12.6);
		
		int a =10;
		a = a++;
		System.out.println("Value is :: "+ a);
		a = ++a;
		System.out.println("Value is :: "+ a);
		System.out.println("..."+ ++a);
		System.out.println("..."+ a++);
	
		CustructorDemo obj3 = new CustructorDemo(12.6,67.0);
		
		//obj1.show();
		obj3.show();
		//obj.show();
	}

}










