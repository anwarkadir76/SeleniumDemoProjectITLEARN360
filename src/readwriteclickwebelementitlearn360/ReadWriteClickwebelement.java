package readwriteclickwebelementitlearn360;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadWriteClickwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		// open browser
		WebDriver driver = new FirefoxDriver();
		// pass url
		driver.get("https://www.itlearn360.com/");
		//System.out.println(driver.findElement(By.name("userName")));
		// pass some credentials
		driver.findElement(By.id("user_login")).sendKeys("a");
		driver.findElement(By.id("user_pass")).sendKeys("a");
		driver.findElement(By.id("wp-submit")).click();
		
		
		driver.close();
	}

}