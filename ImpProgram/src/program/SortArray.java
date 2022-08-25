/**
 * 
 */
package program;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] a = { 666, 2865, 4543, 88, 56, 4, 675, 3, 987, 67, 5, 88, 35, 76, 6, 0 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a);
		}

	}
}
