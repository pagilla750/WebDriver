

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdownVerification {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropdownelement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(dropdownelement);
		
		List<WebElement> options = dropdown.getOptions();
		List<String> actualoptions = new ArrayList<>();
		
		for(WebElement option: options) {
			actualoptions.add(option.getText().trim());			
		}
		
		//Define expected options
		List<String> expectedoptions = List.of("Select","INR","AED","USD");
		
		//Now compare both lists
		if(actualoptions.equals(expectedoptions)) {
			System.out.println("Dropdown options are as expected");
		}else {
			System.out.println("Dropdown options do not match");
			System.out.println("Actual: " + actualoptions);
            System.out.println("Expected: " + expectedoptions);
		}	
		driver.close();
	}
	
}
