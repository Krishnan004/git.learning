package practise;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class Variable_Datatype {
//	int age = 25;
//	Double temperature = 98.6;
//	boolean isRaning = true;
//	char Grade = 'A';
//	String name = "Krishnan";
//	int num1 = 13, num2 = 20, num3 = 30;
//	Double pi = Math.PI;
//
//	boolean isEven(int num) {
//		return ((num1 % 2 == 0));
//	}// Even or odd using Boolean
//
//	char initial = 'N';
//	String City = "kanyakumari";

	boolean isPalindrome(String str) {// isPalindrome by Boolean
		int left = 0;
		int right = str.length() - 1;
		char val[] = str.toCharArray();
		while (left < right) {
			if (str.charAt(right) != str.charAt(left)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	double length = 5.5, width = 2.5;

	boolean isPositive(int b) { // ispositive using boolean
		if (b >= 0) {
			return true;
		}
		return false;
	}

	String greeting(String name) {
		String Name = "Hello ";
		return Name + name;
	}

	int TotalStudent = 100;

	boolean isLeapyear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	Double price1 = 10.50, price2 = 20.75;

	boolean isVowel(char inp) {
		if ((inp == 'a') || (inp == 'e') || (inp == 'i') || (inp == 'o') || (inp == 'u') || (inp == 'A') || (inp == 'E')
				|| (inp == 'I') || (inp == 'O') || (inp == 'U')) {
			return true;
		} else {
			return false;
		}

	}

	Double hoursWorked = 40.5, hourlyRate = 15.0;

	boolean isPrime(int num) {
		if(num>2) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}
				}
		}
		if(num==0||num==1) {
			return false;
		}
		
		else  {
			return true;
		}
	}
		

	public static void main(String[] args) {
		Variable_Datatype obj = new Variable_Datatype();
//		System.out.println(obj.isEven(obj.num1));
//		System.out.println(obj.isPalindrome("madam"));
//		System.out.println(obj.isPositive(0));
//		System.out.println(obj.greeting("krishnan"));
//		System.out.println(obj.isLeapyear(2024));
		System.out.println(obj.isPrime(7));
	}
}
