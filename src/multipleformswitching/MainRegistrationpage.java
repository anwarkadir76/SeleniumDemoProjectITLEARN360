package multipleformswitching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainRegistrationpage {

	public static void main(String[] args){

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.itlearn360.com/");

	    WebElement xf = driver.findElement(By.xpath("//*[@id=\"loginlabel\"]/iframe"));
	    driver.switchTo().frame(xf);
	    driver.findElement(By.name("Username")).clear();
	    driver.findElement(By.name("log")).sendKeys("Username");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("pwd")).sendKeys("Password");
	    driver.findElement(By.id("wp-submit")).click();
	    driver.switchTo().defaultContent();
	    //……
	  }
	}