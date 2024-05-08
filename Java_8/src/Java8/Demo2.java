package Java8;

interface start {
	public void show(int x, int y);
}
public class Demo2 {

	public static void main(String[] args) {
		
		start s1 = (x,y)->System.out.println(x*y);
		s1.show(10, 20);
	}

}
