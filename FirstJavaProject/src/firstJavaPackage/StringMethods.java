package firstJavaPackage;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Automation Testing";
		int j = 0;

		for (int i = 1; i < str.length(); i = i + 2) {

			j = j + 1;

		}
		System.out.println(j);
	}

}
