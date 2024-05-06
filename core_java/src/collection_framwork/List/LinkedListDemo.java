package collection_framwork.List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Dipanshu");
		l.add(13);
		l.add("Shivam");
		l.add(4);
		l.set(0, "Dipanshu Namdev");
		l.remove(1);
		l.addFirst("Mr.");
		l.addLast("Both are brothers");
		l.remove(3);
		
		System.out.println(l);

	}

}
