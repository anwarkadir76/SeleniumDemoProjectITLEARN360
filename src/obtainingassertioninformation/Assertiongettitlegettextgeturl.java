package obtainingassertioninformation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertiongettitlegettextgeturl {

	public static void main(String[] args) throws InterruptedException {

	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.itlearn360.com/");

	      System.out.println("Search before================");



	      System.out.printf("title of current page is %s\n", driver.getTitle());
	      System.out.printf("url of current page is %s\n", driver.getCurrentUrl());



	      WebElement search = driver.findElement(By.id("search_course"));
	      search.sendKeys("Selenium");
	      search.sendKeys(Keys.ENTER);
	      Thread.sleep(2000);

	      System.out.println("Search after================");



	      System.out.printf("title of current page is %s\n", driver.getTitle());
	      System.out.printf("url of current page is %s\n", driver.getCurrentUrl());



	      WebElement result = driver.findElement(By.xpath("//*[@id=\"search_course\"]"));
	      System.out.println(result.getText());

	      driver.quit();
	  }
	}