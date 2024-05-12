package practise;

import java.util.HashMap;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

public class Operators_Expressions {
	int Add(int a,int b) {
		return a+b;
	}
	int Remainder(int a,int b) {
		return a%b;
	}
	int expression1() {
		int a=5 * (10 + 3);
		return a;
	}
	int expression2() {
		int a=(8 - 3) * 2 / 5;
		return a;
	}
	int expression3() {
		int a=10 % 3;
		return a;
	}
	Double Average(Double a,Double b) {
		Double c=(a+b)/2;
		return  c;
	}
	boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	int Area(int length,int width) {
		return length*width;
	}
	Boolean isLeapyear(int year) {
		if(year%4==0&&(year%100!=0 || year%400==0)) {
			return true;
		}
		else {
			return false;
		}
	}
	int Hypotenuse(int length1,int length2) {
		int length3=(int) (Math.pow(length1, 2)+Math.pow(length2, 2));
		return length3;
	}
	boolean isUppercase(String inp) {
		if(inp.matches(".*[A-Z].*")) {
			return true;
	
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Operators_Expressions ins=new Operators_Expressions();
		System.out.println(ins.isUppercase("A"));
		
	}
}
