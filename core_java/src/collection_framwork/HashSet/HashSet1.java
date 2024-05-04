package collection_framwork.HashSet;
import java.util.*;

public class HashSet1 {
	
	int id;
	String name; 
	double salary;
	

	public HashSet1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public static void main(String[] args) {
		
		HashSet<HashSet1> s = new HashSet<HashSet1>();
		
		HashSet1 hs1 = new HashSet1(101, "Dipanshu", 3000000);
		HashSet1 hs2 = new HashSet1(102, "Shivam", 5000000);
		HashSet1 hs3 = new HashSet1(103, "Ritik", 1000000);
		HashSet1 hs4 = new HashSet1(101, "Dipanshu", 10000000);
		
		s.add(hs1);
		s.add(hs2);
		s.add(hs3);
		s.add(hs4);
		
		for(HashSet1 h : s) {
		System.out.println("Id : "+h.id+"\n"+"Name : "+h.name+"\n"+h.salary+"\n");
		
		}
	}
}
