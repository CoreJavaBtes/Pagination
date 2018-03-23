package MainObjective;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class MainExcecution {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("1. To Enter the Name of Component :: ");
		System.out.println("2. To Enter the Name of OS :: ");
		NuralPKG.FirstClass obj = new NuralPKG.FirstClass();
		
		ArrayList<NuralPKG.BeanClass> list1 = obj.getData();
		
		int i = sn.nextInt();
		switch (i) {
		case 1:
			System.out.println("Enter the Name of Component :: ");
			String name = sn.next();
			obj.showName(list1, name);
			break;

		case 2:
			System.out.println("Enter the Name of OS :: ");
			String os = sn.next();
			obj.showOS(list1, os);
			break;

		default:
			break;
		}
		
	}

}
