package basicMethods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBasicMethodExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.get("http://amazon.in");
		driver.navigate().refresh();
		
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
