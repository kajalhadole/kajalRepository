package program;

public class Swap2Variable {

	public static void main(String[] args) {
		int a=  20, b=30;
		
		a=a+b;  //      a+b  20+30=50   a=50
		b=a-b;   //     a-b  50-30=20   b=20
 		a=a-b;   //     a-b  50-20=30   a=30
		
		System.out.println("a="  +a);
		System.out.println("b=" +b);
	
	}
	
	
	
	 
	
}
