package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator12 implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//
//		return (o1<02)?-1:(o1>o2)?1:0;
//	}
//	
//}

public class Demo12 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(0);
		l.add(20);
		l.add(15);
	
		System.out.println(l);
		Comparator<Integer> c = (Integer o1, Integer o2)-> (o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(l, c);
		System.out.println(l);
	}
}
