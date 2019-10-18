package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavisri\\eclipse-workspace\\selenium\\src\\selenium\\Javascript.java");

	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	    WebElement scrdown = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
	   
	  
	    
	   
	   
	   
	    
	}

}
