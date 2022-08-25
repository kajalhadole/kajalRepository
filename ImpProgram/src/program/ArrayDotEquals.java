/**
 * 
 */
package program;

import java.util.Arrays;

public class ArrayDotEquals {

	public static void main(String[] args) {

		int[] a1 = { 50, 60, 70, 80 };
		int[] b2 = { 40, 50, 60, 70 };
		int[] c3 = { 50, 60, 70, 80 };

		System.out.println(Arrays.equals(a1, b2));
		System.out.println(Arrays.equals(b2, c3));
		System.out.println(Arrays.equals(c3, a1));
	}
}
