package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LTExample {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		
		WebElement link=driver.findElement(By.partialLinkText("Deals"));
		link.click();
		
		
	}

}
