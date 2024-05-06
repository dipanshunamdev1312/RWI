package collection_framwork.List;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"m");
		l.add("N");
		System.out.println(l);
	}

}

//Output :[A, 10, A, null]
//		[A, 10, null]
//		[A, 10, m, null, N]
