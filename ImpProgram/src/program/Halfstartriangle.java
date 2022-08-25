package program;

public class Halfstartriangle {

	
	public static void main(String[] args) {
/*		
	
for(int a=1; a<=5; a++) {
	                                             //if(a==4)
	                                           //	continue;
	for(int b=1; b<=a; b++) {
		System.out.print(" * ");
	}
	System.out.println( );
	                                             //if(a==3)
	                                             // break;    */

	

	 int star=1;
	 int space=4;
	 for(int i=1; i<=5; i++) {
		 for(int j=1; j<=space; j++) {
			 System.out.print(" ");
		 }
		 for(int k=1; k<=star; k++) {
			 System.out.print("*");
		 }System.out.println();
		 star++;
		 space--;
		 }
}}



