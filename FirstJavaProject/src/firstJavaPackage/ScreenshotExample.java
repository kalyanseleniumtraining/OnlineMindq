package firstJavaPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public void screenshot(WebDriver driver, String fileName) throws Exception {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("C:\\Users\\kalya.000\\Documents\\Screens\\" + fileName + ".png"));
	}

	public static void main(String[] args) throws Exception {

		ScreenshotExample obj = new ScreenshotExample();

		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://amazon.in");

		} catch (Exception e) {
			System.out.println("Page not opened");
			obj.screenshot(driver, "PageNotOpend");
		}
		try {
			WebElement ele = driver.findElement(By.id("ahkdjshf"));
		} catch (Exception e) {
			obj.screenshot(driver, "LaunchPageTextBox");
		}

	}

}
