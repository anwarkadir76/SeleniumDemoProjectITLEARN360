package keyboardsimulateoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardsimulateoperation {

	 public static void main(String[] args)throws InterruptedException {

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.itlearn360.com/");

		    WebElement input = driver.findElement(By.id("search_course"));//searching 

		   

		    input.sendKeys("seleniumm");
		    Thread.sleep(2000);


		    input.sendKeys(Keys.BACK_SPACE);
		    Thread.sleep(2000);

		

		    input.sendKeys(Keys.SPACE);
		    input.sendKeys("Tutorial");
		    Thread.sleep(2000);

	
		    input.sendKeys(Keys.CONTROL,"a");
		    Thread.sleep(2000);


		    input.sendKeys(Keys.CONTROL,"x");
		    Thread.sleep(2000);


		    input.sendKeys(Keys.CONTROL,"v");
		    Thread.sleep(2000);


		    input.sendKeys(Keys.ENTER);
		    Thread.sleep(2000);

		    driver.quit();
		  }
		}