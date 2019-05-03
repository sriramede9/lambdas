package sortingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

class myComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
	}

}

public class Trail1 {

	public static void main(String[] args) {
		List<Integer> lis = new ArrayList();

		lis.add(10);
		lis.add(50);
		lis.add(70);
		lis.add(40);
		lis.add(80);
		lis.add(90);
		lis.add(20);

		System.out.println(lis);

		// not coompare them using default implementation

		Collections.sort(lis);

		System.out.println(lis); // ascending order

		// to do that sort in desending order have to implement our own interface

		// Collections.sort(lis,new myComp());

		Collections.sort(lis, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0); // using lambda as collectioni interface
																				// has only one abst meth

		// System.out.println(lis); // ascending order

		HashSet<Integer> hs = new HashSet();// they do not preseve the order and not allow duplicates.
		hs.add(20);
		hs.add(10);
		hs.add(50);
		hs.add(70);
		hs.add(40);
		hs.add(80);
		hs.add(90);
		hs.add(30);

		// System.out.println(hs);

		TreeSet<Integer> ts = new TreeSet(new myComp());// by default they will sort in ascending order, we can use comp
														// to sort in descening
		ts.add(20);
		ts.add(10);
		ts.add(50);
		ts.add(70);
		ts.add(40);
		ts.add(80);
		ts.add(90);
		ts.add(30);

		System.out.println(ts);

		//TreeSet<Integer> ts1=new TreeSet<Integer>( (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0); to send default comparator
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);// non duplicate keys and sort in ascendingn order of keys
		
		tm.put(5,"five");
		tm.put(2,"two");
		tm.put(9,"nine");
		System.out.println(tm);
		
		
	}
}
