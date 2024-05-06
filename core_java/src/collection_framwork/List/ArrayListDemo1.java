package collection_framwork.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		
		System.out.println(l1 instanceOf Serializable); // true
		System.out.println(l2 instanceOf Cloneable); // true
		System.out.println(l1 instanceOf RandomAccess);//true
		System.out.println(l1 instanceOf RandomAccess);//false

	}

}
