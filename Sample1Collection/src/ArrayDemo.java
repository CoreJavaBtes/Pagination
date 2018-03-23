import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int arr[] = { 4, 6, 5, 3, 2,4, 6, 5, 3, 2,4, 6, 5, 3, 2,4, 6, 5, 3, 2,4, 6, 5, 3, 2,4, 6, 5, 3, 2 };
		int i, sum=0;
		int arr1[] = new int[10];
		System.out.println("Enter Values :: ");
		for (i = 0; i < arr1.length; i++) {

			arr1[i] = sn.nextInt();
		}
		
		for (i = 0; i < arr1.length; i++) {

			sum = sum + arr[i];
			
			
			
			}
		System.out.println(" Sum is ::  " + sum);
		for (i = 0; i < arr.length; i++) {

			System.out.println("......." + arr[i]);
			
			}
	

	}

}
