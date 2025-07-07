
import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Todo_Task {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://todomvc4tasj.herokuapp.com/");
		dr.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(2000));
		
		dr.findElement(By.id("new-todo")).sendKeys("Task1");
		Thread.sleep(2000);
		dr.findElement(By.id("new-todo")).sendKeys(Keys.ENTER);
		
		//edit the task by double click and change name
		WebElement todolist_element = dr.findElement(By.xpath("//*[@id='todo-list']/li/div/label"));

		wait.until(ExpectedConditions.elementToBeClickable(todolist_element));
		Actions actions = new Actions(dr);
		actions.doubleClick(todolist_element).perform();
		wait.until(ExpectedConditions.visibilityOf(todolist_element));
//		todolist_element.sendKeys(Keys.BACK_SPACE);
		todolist_element.sendKeys("Task2");
		
		
		//clear the Task
		dr.findElement(By.xpath("//*[@type='checkbox']")).click();
		
		//Delete the Task
		dr.findElement(By.id("clear-completed")).click();	
		
			

	}

}
