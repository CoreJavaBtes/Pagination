package FileHandling;

import java.io.*;

public class DemoSerialize {

	public static void main(String[] args) {
		
		Employee e =new Employee(23, "Sarabjit") ;
		Employee e1 =new Employee(12, "Sandeep") ;
		Employee e2 =new Employee(123, "Kulwinder") ;
		
		try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("D:/MyEmployee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
		
	}

}
