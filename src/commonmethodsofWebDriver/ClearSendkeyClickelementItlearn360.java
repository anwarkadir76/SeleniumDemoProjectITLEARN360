package commonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearSendkeyClickelementItlearn360 {

	 public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			   
			driver.get("https://www.itlearn360.com/");
			
			  

		    WebElement search_text = driver.findElement(By.id("search_course"));
		    WebElement search_button = driver.findElement(By.xpath("//*[@id=\"search_course\"]"));

		    search_text.sendKeys("JAVA FOR WEB DEVELOPERS");
		    search_text.clear();
		    Thread.sleep(5000);//throws InterruptedException 
		    search_text.sendKeys("ADVANCED SELENIUM IN C#");
		  
		    search_button.click();
		    
		    search_text.submit();

		    driver.quit();
		  }
		}