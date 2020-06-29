package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");

		WebElement dropDown = driver.findElement(By.id("gh-cat"));

		Select sel = new Select(dropDown);
		List<WebElement> items = sel.getOptions();
		for (int i = 0; i < items.size(); i++) {
			String item = items.get(i).getText();
			System.out.println(item);
		}

//		WebElement ele = sel.getFirstSelectedOption();
//		if (ele.getText().equals("All Categories")) {
//			System.out.println("Default value matched");
//		} else {
//			System.out.println("Default value not matched");
//		}

		// sel.selectByIndex(4);
		// sel.selectByVisibleText("Crafts");
		// sel.selectByValue("10542");

	}

}
