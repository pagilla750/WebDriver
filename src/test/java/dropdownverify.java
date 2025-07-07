
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdownverify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		WebElement fromdropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']"));
		
		Select dropdown = new Select(fromdropdown);
		
		List<WebElement> allfromoptions = dropdown.getOptions();
		List<String> actualoptions = new ArrayList();
		List<String> expectedstates = new ArrayList();
		
		for( WebElement option:allfromoptions) {
			actualoptions.add(option.getText().split(" ")[0].trim());
		}
		
		System.out.println("actualoptions are: "+actualoptions);
		if (actualoptions.contains("Ahmedabad")) {
			System.out.println("Input state are in the actualoptions");
		}else {
			System.out.println("Input state are not in actualoptions");
		}
		expectedstates.add("Ahmedabad");
		expectedstates.add("Amritsar");
			
		if (actualoptions.containsAll(expectedstates)) {
			System.out.println("Input states are in the actualoptions");
		}else {
			System.out.println("Input states are not in actualoptions");
		}
			
		

	}

}
