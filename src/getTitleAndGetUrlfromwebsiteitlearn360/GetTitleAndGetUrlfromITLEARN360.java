package getTitleAndGetUrlfromwebsiteitlearn360;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleAndGetUrlfromITLEARN360 {


		 public static void main(String[] args) {
				System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				   
				driver.get("https://www.itlearn360.com/");
				
			
				
				System.out.println(driver.getTitle());
				String  s=driver.getCurrentUrl();
				System.out.println(s);
				System.out.println(driver.getPageSource());
				driver.navigate().to("https://www.google.com/");
				driver.navigate().back();
				driver.navigate().forward();
				
				String title = driver.getTitle();
		        System.out.printf(title);

				
				

			        driver.close();
	}

}
