package practise;

import java.util.*;

public class Collection_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection ->Arraylist
		Collection<Integer> inp1 = new ArrayList<Integer>();
		inp1.add(5);
		inp1.add(3);
		inp1.add(2);
		inp1.add(4);
		inp1.add(3);
		inp1.forEach(System.out::print);   // This is also a iteration method
		System.out.println("Value =" + inp1);
		System.out.println("Size =" + inp1.size());
		//List->ArrayList
		List<Integer> inp = new ArrayList<Integer>();
		inp.add(5);
		inp.add(3);
		inp.add(2);
		inp.add(4);
		inp.add(1);
		inp.sort(null);
		System.out.println("Value=" + inp);
		System.out.println("ByIndex =" + inp.get(1));
		System.out.println("ByValue =" + inp.indexOf(2));

	}

}
