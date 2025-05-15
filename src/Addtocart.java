import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] vegies = { "Cucumber","Tomato","Brocolli" };
		int j=0;
		List<WebElement> prodcuts = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i=0; i<prodcuts.size(); i++) {

			String productname = prodcuts.get(i).getText().split("-")[0].trim();

			// convert array into array list for easy search
			List<String> vegieslist = Arrays.asList(vegies);

			// check whether product you extracted is present in arraylist or not
			if (vegieslist.contains(productname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==vegies.length) {
					break;
				}
			}

		}

	}

}
