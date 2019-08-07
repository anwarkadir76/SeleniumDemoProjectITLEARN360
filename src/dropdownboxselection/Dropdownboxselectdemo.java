package dropdownboxselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownboxselectdemo {

	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.itlearn360.com/");

	    driver.findElement(By.linkText("Get Started")).click();
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(2000);


	    WebElement el = driver.findElement(By.xpath("//select"));
	    Select sel = new Select(el);
	    sel.selectByValue("20");
	    Thread.sleep(2000);

	    driver.quit();
	  }
	}