package Java8;

interface Inter8{
	public void add(int a, int b);
}
//class Test7 implements InterB{
//
//	@Override
//	public void add(int a, int b) {
//		System.out.println("The sum : "+(a+b));
//	}
//	
//}
public class Demo8 {

	public static void main(String[] args) {
		
		Inter8 i =(a, b) -> System.out.println("The sum : "+(a+b));
		i.add(10, 20);
	}

}
