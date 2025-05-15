import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class updatedDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(),'Passengers')]")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//*[@id=\"main-container\"]//div[2]//div[1]/div[1]/div[2]/div[3]")).click();
		}
				
		driver.findElement(By.xpath("//*[contains(text(),'Passengers')]")).click();
		String result = driver.findElement(By.xpath("//*[@id=\"main-container\"]//div[5]/div[1]/div/div/div[2]/div[1]")).getText();
		System.out.println(result);
	}
}
