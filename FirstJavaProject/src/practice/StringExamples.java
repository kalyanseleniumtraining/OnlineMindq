package practice;

public class StringExamples {

	public void verifyChars(String str, int count, char ch1) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);// r

			if (ch == ch1) {
				count = count + 1;
			}

		}
		System.out.println("No of times "+ch1+ "is printing " +count);
	}

	public static void main(String[] args) {

		String str = "Test Selenium Webdriver";
		int count = 0;
		StringExamples obj=new StringExamples();
		obj.verifyChars(str, count, 'r');
		

	}

}
