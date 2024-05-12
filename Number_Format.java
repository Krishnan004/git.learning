package practise;

import java.util.Calendar;
import java.util.Locale;

public class Number_Format {
	
	public static void main(String[] args) {
		float deci=3.14f;
		float num=3;
		long n=4753625;
		
		Calendar cal=Calendar.getInstance();
		
		
		System.out.println("Decimal Number "+deci);
		System.out.println("Whole number "+num);
		System.out.println(String.format("%.2f%n",num));
		System.out.format("%.2f%n%n",num);
		System.out.format("%10.2f %n%n",num);
		System.out.format("%-10.2f %n%n",num);
		System.out.format(Locale.FRANCE,"%10.2f %n%n",deci);
		System.out.format("%,08d %n%n",n);
		System.out.format("%tb %n%n",cal);
		System.out.format("%tl:%tm  %tp%n%n",cal,cal,cal);
		System.out.format("%td/%tm/%ty  %n%n",cal,cal,cal);
		System.out.format("%td/%tm/%tY  %n%n",cal,cal,cal);
		System.out.format("%tD",cal);
	}
}
