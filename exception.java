package practise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
public static void main(String[] args) {
	try {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String name=sc.next();
		if(name.matches("[a-zA-Z]+")){
			System.out.print("Enter the Age: ");
			int age=sc.nextInt();
			System.out.println("Name: "+name);
			System.out.println("Age: "+ age);
		}
		else {
			 throw new IllegalArgumentException("Enter the details correctly");
		}
	} 
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Enter the details correctly");
	}
	finally {
		System.out.println("Thank You");
	}
	
	
}
}
