package controlbrowseroperation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ControlBrowseritlearn360 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			   
			driver.get("https://www.itlearn360.com/");
			
			  driver= new ChromeDriver();
			    driver.get("https://www.itlearn360.com/");

			    driver.manage().window().maximize();
			    Thread.sleep(2000);

			    driver.get("https://www.itlearn360.com/");
			    driver.manage().window().setSize(new Dimension(480, 800));
			    Thread.sleep(2000);

			    driver.quit();
			  }
			}

	


