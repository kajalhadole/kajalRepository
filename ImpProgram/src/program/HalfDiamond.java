package program;

public class HalfDiamond {

public static void main(String[] args) {
	
	                             // row=5 from center right from left with space (not include right side )
	int star=1;
	int space=4;
	for(int i=1; i<=5; i++) {    // column= 5
		for(int j=1; j<=space; j++) {     //space=4
			System.out.print(" ");
		}
		for(int k=1; k<=star; k++) {    // star=1
			System.out.print(" *");
		}
		System.out.println();
		star++;
		space--;
	}
	
	
}}
