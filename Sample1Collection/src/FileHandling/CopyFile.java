package FileHandling;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

	public class CopyFile {
	  
		public static void main(String args[]) throws IOException
	   {
	      FileInputStream in = null;
	      
	      FileOutputStream out = null;
	      Scanner sn = new Scanner(System.in);
	      ArrayList<String> al = new ArrayList<String>();
	     // String s = sn.nextLine();
	      try {
	         in = new FileInputStream("D:/output.txt");
	         out = new FileOutputStream("D:/Test23.txt");
	         
	         for(int i=0; i<=al.size();i++)
	         {
	        	 out.write(56);
	         }
	         
	         /*int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }*/
	      }finally {
	         if (in == null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}


