package commonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSizeGetAttributeGetTextisDisplayed {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();  
			driver.get("https://www.itlearn360.com/");
			
		     driver = new ChromeDriver();
		    driver.get("https://www.itlearn360.com/");

		    //Get the size of the web input box
		    WebElement size = driver.findElement(By.id("search_course"));
		    System.out.println(size.getSize());

		    //return back main page  at the bottom of the page 
		
		    WebElement text = driver.findElement(By.id("header-sroll"));
		    System.out.println(text.getText());

		   
		    WebElement ty = driver.findElement(By.id("search_course"));
		    System.out.println(ty.getAttribute("type"));

		 
		    WebElement display = driver.findElement(By.id("search_course"));
		    System.out.println(display.isDisplayed());

		    driver.quit();
		  }
		}