package multiwindowswitching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MorewindoeDemo {

	public static void main(String[] arge) throws InterruptedException{

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.itlearn360.com/");


	    String search_handle = driver.getWindowHandle();

	    
	    driver.findElement(By.linkText("Log in")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Linkedin oauth process")).click();


	    Set<String> handles = driver.getWindowHandles();

	
	    for(String handle : handles){
	      if (handle.equals(search_handle)==false){
	 
	        driver.switchTo().window(handle);
	        System.out.println("now register window!");
	        Thread.sleep(2000);
	        driver.findElement(By.name("log")).clear();
	        driver.findElement(By.name("log")).sendKeys("k");
	        driver.findElement(By.name("pwd")).clear();
	        driver.findElement(By.name("pwd")).sendKeys("ka");
	      
	        Thread.sleep(2000);
	
	        driver.close();
	      }
	    }
	    Thread.sleep(2000);

	    driver.quit();
	  }
	}