package Java8;
interface Inter
{
	public void m1();
}
class Test implements Inter
{
	public void m1()
	{
		System.out.println("HEllo...");
	}
}
class Demo5 {
	public static void main(String[] args)
	{
		Inter i = new Test();
		i.m1();
	}
}


