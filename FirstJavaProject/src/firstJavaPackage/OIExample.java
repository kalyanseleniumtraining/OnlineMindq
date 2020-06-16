package firstJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OIExample {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		
		WebElement amazonLpTextBox=driver.findElement(By.id("twotabsearchtextbox"));
		amazonLpTextBox.sendKeys("Mobiles");
		
		WebElement amazonLpSrchBtn=driver.findElement(By.className("nav-input"));
		amazonLpSrchBtn.click();
		
		
	}

}
