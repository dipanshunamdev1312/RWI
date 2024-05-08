package Java8;

public class CheckEvenNum {
	
//	public static void m1(int n) {
//		if(n%2==0) {
//			System.out.println("Number is even");
//		}
//		else 
//			System.out.println("Invalid Number");
//	}
	
	interface start{
		public  void show(int x);
	}
	
	public static void main(String[] args) {
		
		start s1 = x->System.out.println(x%2==0);
		
		s1.show(11);
		
		        start s2 = (x)->{
		                if(x%2==0){
		                    System.out.println("Even");
		                }else{
		                    System.out.println("Odd");
		                }
		            
		        }; 
		        s2.show(2);   
		    }
	}
