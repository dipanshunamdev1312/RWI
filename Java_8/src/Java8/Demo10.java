package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1<o2) {
			return -1;
		}
		if(o1 > o2) {
			return 1;
		}
		else 
		return 0;
	}

public class Demo10 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(30);
		l.add(0);
		l.add(15);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);

	}

}}

//Comparator
//
//int compare(Object obj1, Object obj2)
//	return -ve if obj1 has to come before obj2 .
//	return +ve if obj1 has to come after obj2.
//	return 0 if obj1 and obj2 are equal.

//
//
//
//
//
//
//
//
//
//
//
//
//
//
//













