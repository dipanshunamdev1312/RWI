package Java8;

import java.util.function.Function;

public class Java8Demo {
//	
//	public static int squareIt(int x) {
//		return x*x;
//	}

	public static void main(String[] args) {
		
//		System.out.println(squareIt(5));//25
//		System.out.println(squareIt(4));//16
		
		Function<Integer,Integer> f=i->i*i;
		
		System.out.println("The square of 5 : "+f.apply(5));//25
		System.out.println("The square of 6 : "+f.apply(6));//36

		
		
	}

}
