package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopsExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/search?q=laptop&sid=6bo%2Cb5g&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_7_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_7_na_na_na&as-pos=2&as-type=RECENT&suggestionId=laptop%7CLaptops&requestId=d7340f45-4e02-4d94-8d6b-9220c81b8bd8&as-searchtext=Laptops");

		
		WebElement secondLaptop=driver.findElement(By.xpath("(.//div[@class='_3wU53n'])[2]"));
		
		secondLaptop.click();
		
		
//		List<WebElement> laptops = driver.findElements(By.xpath(".//div[@class='_3wU53n']"));
//		System.out.println("Total no of laptops are " + laptops.size());
//
//		for (int i = 0; i < laptops.size(); i++) {
//			WebElement laptop = laptops.get(i);
//			String text = laptop.getText();
//			System.out.println(text);
//		}

	}

}
