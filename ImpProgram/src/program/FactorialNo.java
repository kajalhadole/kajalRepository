package program;

public class FactorialNo {

	public static void main(String[] args) {
		// increment

		int no = 5;
		int fact = 1;
		for (int i = 1; i <= no; i++) { /* instead of no we can write 5 also */
			fact = fact * i;
		}
		System.out.println(fact);
//System.out.println("factorial of "+5+" is " + b);

		// decrement
		// int h=6; int factor = 1;
		// for(h=6; h>=1; h-- ) {
		// factor=factor*h;
		// }
		// System.out.println("factorial of " +6+ " is " + factor);

	}
}

