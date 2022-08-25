package program;

public class SinglePrimeNo {

public static void main(String[] args) {
	
	int i =7 ; int count =0;
	for(int j=1; j<=7; j++) {
		
		if(i%j==0) {
			count++;
			}
	}
	
	if(count>0) {
		System.out.println(i+" is prime no");
	}
	else 
		System.out.println("not prime no");
	}
	
	
	
	
}





