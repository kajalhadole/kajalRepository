package program;

public class ArmstrongNo {

	public static void main(String[] args) {

		int No = 153;
		int storeNo = No;
		int reminder = 0;
		int result = 0;

		       // 153 ! = 0
		while (storeNo != 0) {
			reminder = storeNo % 10; // ------15.3-----1.5-----0.1

			result = result + (reminder * reminder * reminder);
			// =0+(3*3*3)------=27+(5*5*5)-------=152+(1*1*1)
			// =27 =27+125=152 = 153
			storeNo = storeNo / 10;
		}
		if (result == No)
			System.out.println(result + " is armstrong number");
		else
			System.out.println(result + " is not armstrong number");
	}
}
