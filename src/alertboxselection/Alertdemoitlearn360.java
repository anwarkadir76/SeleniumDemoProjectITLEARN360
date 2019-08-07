package alertboxselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemoitlearn360 {

	 public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.itlearn360.com/");

	    driver.findElement(By.linkText("Get Started")).click();
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.id("login_error")).click();

	
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);

	    driver.quit();
	  }
	}