

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://google.com/");
		
		List<WebElement> links = dr.findElements(By.tagName("a"));
		
		for(WebElement link:links) {
			
			String stringurl = link.getAttribute("href");
			
			if(stringurl!=null && !stringurl.isEmpty()) {
				
				URL url = new URL(stringurl);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				
				int httpResponse = connection.getResponseCode();
				
				if (httpResponse>=400) {
					System.out.println(stringurl+"Invalid URL"+httpResponse);
				}else {
					System.out.println(stringurl+"Valid URL"+httpResponse);
				}
					
				
				
				
				
			}
			
			
			
			
			
			
		}
		
	
	}

}
