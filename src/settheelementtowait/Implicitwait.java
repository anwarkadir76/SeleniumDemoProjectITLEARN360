package settheelementtowait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args){

	    WebDriver driver = new ChromeDriver();

	
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    driver.get("https://www.itlearn360.com/");

	   
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.id("search_course")).sendKeys("selenium");

	 
	    driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);

	    driver.quit();
	  }
	}