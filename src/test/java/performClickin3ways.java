import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class performClickin3ways {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement feelingluckybutton = driver.findElement(By.id("gbqfbb"));
		Thread.sleep(2000);
		
		//1st method
		feelingluckybutton.click();
		
		System.out.println("button clicked");
		
		//2nd method
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",feelingluckybutton);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("test");
				
		WebElement feelingluckybutton1 = driver.findElement(By.cssSelector("div.FPdoLc.lJ9FBc > center > input.gNO89b"));
		Thread.sleep(2000);
		
		//3rd method
		Actions actions = new Actions(driver);
		actions.click(feelingluckybutton1).perform();
		
		

	}


}
