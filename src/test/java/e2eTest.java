

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class e2eTest {

	public static void main(String[] args) throws InterruptedException {
		
		
	}
		
		
	@Test
	public void endtoendtest() throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2' and text()='From']")).click();
		
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar' and text()='AGR']")).click();
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']"));
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("vns")) {
				option.click();
				break;
			}
		}
		
				
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41' and @dir='auto']")).click();
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Passengers')]")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//*[@id=\"main-container\"]//div[2]//div[1]/div[1]/div[2]/div[3]")).click();
		}
				
		driver.findElement(By.xpath("//*[contains(text(),'Passengers')]")).click();
		String result = driver.findElement(By.xpath("//*[@id=\"main-container\"]//div[5]/div[1]/div/div/div[2]/div[1]")).getText();
		System.out.println(result);
		
	
//		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']")).click();
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']")).isSelected());
//		Assert.assertFalse(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']")).isSelected());
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	}
		
	}
