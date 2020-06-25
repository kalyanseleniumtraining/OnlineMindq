package practice;

public class ArraysExample {

	public static void main(String[] args) {

		String[] str = new String[6];
		str[0] = "Kalyani";
		str[1] = "Karishma";
		str[2] = "Raziya";
		str[3] = "Sivanvitha";
		str[4] = "Swathi";
		str[5] = "Srujana";
		
		System.out.println("Total values in the array are " + str.length);

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

}
