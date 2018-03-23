
public class TypeCastExample2 {
	
	public static void main(String[] args) {
		
		int x = 100;
		
		//int to float
		
		float f = x;
		
		//Explicit Conversion
		
		double d =  98.80d;
		
		int d1 = (int) d;
		
		System.out.println("Value of :: "+d1);
		
	//String to numeric
		
		String s = "7865";
		
		long l = Long.parseLong(s);
		
		long l2 = Long.valueOf(s);
		
		// Numeric to String
		
		long l1 = 87698l;
		
		String s1 = ""+l1;
		
		String s2 = String.valueOf(l1);
		
		String s3 = Long.toString(l1);
		
	}

}
