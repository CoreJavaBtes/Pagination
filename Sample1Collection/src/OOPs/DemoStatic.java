package OOPs;

public class DemoStatic {
	
	int a = 199;
final static int x;
	
	static{
	x = 100;
	}
	void show()
	{	
		//x = 100;
		System.out.println("a = "+a);
		System.out.println("x = "+x);
	}

	void show1()
	{
		show();
		System.out.println("a = "+a);
		System.out.println("x = "+x);
	}
	public static void display()
	{
		//System.out.println("a = "+a);
		System.out.println("x = "+x);
	}
	
	public static void main(String[] args) {
		
		DemoStatic obj = new DemoStatic();
		
		obj.show();
		display();
		
	}

}
