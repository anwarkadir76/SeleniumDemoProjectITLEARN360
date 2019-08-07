package callJAVASCRIPTCODE;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallJavaScriptCodeDemo {

	public static void main(String[] args) throws InterruptedException{

	    WebDriver driver = new ChromeDriver();

	  
	    driver.manage().window().setSize(new Dimension(2000, 900));
	    driver.get("https://www.itlearn360.com/");

	    driver.findElement(By.id("logo")).click();
	    driver.findElement(By.linkText("Automation Testing")).click();
	    driver.findElement(By.linkText("AWS")).click();
	    driver.findElement(By.linkText("Backend Scripting")).click();
	    driver.findElement(By.linkText("Cloud Computing")).click();
	    driver.findElement(By.linkText("Code")).click();
	    driver.findElement(By.linkText("Data Science")).click();
	    driver.findElement(By.linkText("DevOps")).click();
	    driver.findElement(By.linkText("Frontend scripting")).click();
	    driver.findElement(By.linkText("Search")).click();
	    driver.findElement(By.name("s")).sendKeys("Cloud Computing");
	   
	    
	    driver.findElement(By.xpath("//*[@id=\"lp-archive-courses\"]/div[3]/form")).click();
	    Thread.sleep(5000);

	   
	    ((JavascriptExecutor)driver).executeScript("window.scrollTo(2000,750);");
	    Thread.sleep(7000);

	    driver.quit();
	  }
	}