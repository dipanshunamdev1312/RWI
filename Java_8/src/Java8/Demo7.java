package Java8;

interface InterB{
	public void add(int a, int b);
}
class Test7 implements InterB{

	@Override
	public void add(int a, int b) {
		System.out.println("The sum : "+(a+b));
		
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
		
		Test7 t = new Test7();
		t.add(10, 20);
	}

}
