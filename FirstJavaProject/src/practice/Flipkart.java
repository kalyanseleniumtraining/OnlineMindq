package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		WebElement popupClose = driver.findElement(By.xpath(".//*[@class='_2AkmmA _29YdH8']"));
		popupClose.click();
		WebElement ele = driver.findElement(By.xpath(".//input[@class='LM6RPg']"));
		ele.sendKeys("Bags");

	}

}
