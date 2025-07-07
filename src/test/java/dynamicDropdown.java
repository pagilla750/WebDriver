

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class dynamicDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2' and text()='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu' and @dir='auto' and @spellcheck='false' and @type='text' and @data-focusable='true']")).sendKeys("AR");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar' and text()='VTZ']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar' and text()='ATQ']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']"));
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("vns")) {
				option.click();
				break;
			}
		}
		
		System.out.println(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']")).isSelected());

		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']")).isSelected());
		//find the number of check boxes
		int size = driver.findElements(By.cssSelector("circle[stroke*='#']")).size();
		Assert.assertEquals(size, 8);
		System.out.println("end");
		driver.close();	
		
		
		
		

	}



}
