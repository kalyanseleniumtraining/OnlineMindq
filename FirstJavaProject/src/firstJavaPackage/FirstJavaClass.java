package firstJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstJavaClass {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://en.wikipedia.org/wiki/India");

		String expectedResult = "India -  Wikipedia";// BA

		String actualResult = driver.getTitle();// application

		// How do we compare two strings in java

		boolean testcaseResult = expectedResult.equals(actualResult);

		if (testcaseResult == true) {
			System.out.println("India - Wikipedia page got opened");
		} else {
			System.out.println("India - Wikipedia page not opened");
		}

	}

}
