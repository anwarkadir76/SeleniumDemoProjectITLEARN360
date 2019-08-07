package JavabaseFirstCodeforwebsitetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOpenMultiBrowseritlern360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		   

		
		driver.get("https://www.itlearn360.com/");
		
		driver =new ChromeDriver();
		driver.get("https://www.itlearn360.com/");
	}

}