package Java8;
interface Interf
{
	public void m1();
}
class Demo implements Interf
{
	public void m1()
	{
		System.out.println("HEllo...");
	}
}
class Demo4 {
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.m1();
	}
}


