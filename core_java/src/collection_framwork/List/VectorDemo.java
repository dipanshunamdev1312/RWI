package collection_framwork.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
 Vector<String> v=new Vector<String>();
 v.add("Depesh");
 v.add("Dhruv");
 v.add("Ankit");
 v.add("Sneha");
 v.add("Sakshi");
 
 Iterator<String>itr=v.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
 }
 
 System.out.println("========================================");
// without using iterator 
 
 System.out.println(v);
 
	}

}
