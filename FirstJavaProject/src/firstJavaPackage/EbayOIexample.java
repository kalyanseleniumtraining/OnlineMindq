package firstJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayOIexample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement ele1 = driver.findElement(By.id("gh-ac"));
		ele1.sendKeys("Laptops");

		WebElement ele2 = driver.findElement(By.id("gh-btn"));

		ele2.click();
	}

}
