package practise;

public class PrimeNumber_TimeComplexity {

	public static void main(String[] args) {
		int num=738376,i=2;
		boolean flag=true;
		while(i<=Math.sqrt(num) && flag){
			if(num%i==0 && num!=2 ) {
				System.out.println(num+" is Not a prime number");
				flag=false;
			}
			i++;
		}
		if(flag)
		System.out.println(num+" is a prime number");
	}

}
