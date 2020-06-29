package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksExample {
	// link[0],link[1]

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		List<WebElement> links = driver.findElements(By.tagName("ahsdkhfkdashfljadskf"));
		System.out.println(links.size());//29
		int count=0;

		for (int i = 0; i < links.size(); i++) {
			String link = links.get(i).getText();
			if (!link.equals("")) {
				count=count+1;
				System.out.println(links.get(i).getText());
			}

		}
		System.out.println(count);
		
		System.out.println("completed reading links");

	}

}
