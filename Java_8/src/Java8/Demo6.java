package Java8;
interface InterA
{
	public void m1();
}

class Demo6 {
	public static void main(String[] args)
	{
		InterA i = ()-> System.out.println("HEllo...By Lambda Expression.");
		i.m1();
	}
}


