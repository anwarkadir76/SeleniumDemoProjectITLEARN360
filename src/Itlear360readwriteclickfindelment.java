import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Itlear360readwriteclickfindelment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		// open browser
		WebDriver driver = new FirefoxDriver();
		// pass url
		driver.get("https://www.itlearn360.com/");
		//System.out.println(driver.findElement(By.name("userName")));
		// pass some credentials
		driver.findElement(By.name("log")).sendKeys("a");
		driver.findElement(By.name("pwd")).sendKeys("a");
		driver.findElement(By.name("wp-submit")).click();
		
		
		driver.close();
	}

}