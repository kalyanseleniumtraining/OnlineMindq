package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
	     for(int i=0;i<links.size();i++)
	     {
	    	 WebElement ele=links.get(i);
	    	 String text=ele.getText();
	    	 System.out.println(text);
	    	 
	     }
	}

}
