package browsercookieoperation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercookieoperation {

	 public static void main(String[] args){

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.itlearn360.com/");

		    Cookie c1 = new Cookie("name", "key-aaaaaaa");
		    Cookie c2 = new Cookie("value", "value-bbbbbb");
		    driver.manage().addCookie(c1);
		    driver.manage().addCookie(c2);

		  
		    Set<Cookie> coo = driver.manage().getCookies();
		    System.out.println(coo);

		    
		    //driver.manage().deleteAllCookies();

		    driver.quit();
		  }
		}