package Inheritance;

public class StudentDemo {

	public static void main(String[] args) {
		Student3 obj = new Student3(23, "Amrit", "B.Tech", 12.4, 23.3, 27.90, 90, 80);
		
	obj.display();
	obj.putdata();
	
	String s = "hello";
	s=s+s;
	System.out.println(s);
	StringBuffer sb = new StringBuffer("Hello");
	sb.append(s);
	System.out.println(sb);
	sb.insert(3, " Welcome ");
	System.out.println(sb);
	}
}
