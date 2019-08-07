package simulatemouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mmouseoperations {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			   
			driver.get("https://www.itlearn360.com/");
			
	     driver = new ChromeDriver();
	    driver.get("https://www.itlearn360.com/");

	    WebElement search_setting = driver.findElement(By.linkText("Log in"));
	    Actions action = new Actions(driver);
	    action.clickAndHold(search_setting).perform();
	    
        action = new Actions(driver);

	    
	 action.contextClick(driver.findElement(By.id("loginlabel"))).perform();

	        
	 action.doubleClick(driver.findElement(By.id("loginlabel"))).perform();

	
	 WebElement source = driver.findElement(By.name("loginlabel"));
	 WebElement target = driver.findElement(By.name("#login_form_container"));
	 action.dragAndDrop(source,target).perform();

	                        
	 action.release().perform();

	    driver.quit();
	  }
	}