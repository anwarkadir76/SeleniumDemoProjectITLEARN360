package controlbrowsertogobackwardsandforward;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserGoBackitlen360 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		   
		driver.get("https://www.itlearn360.com/");
		
		  driver= new ChromeDriver();
		    driver.get("https://www.itlearn360.com/");

	   
	    driver.get("https://www.itlearn360.com/");
	    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);

	
	    driver.findElement(By.linkText("Log in")).click();
	    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);


	    driver.navigate().back();
	    System.out.printf("back to %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);


	    driver.navigate().forward();
	    System.out.printf("forward to %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);

	    driver.quit();
	  }
	}