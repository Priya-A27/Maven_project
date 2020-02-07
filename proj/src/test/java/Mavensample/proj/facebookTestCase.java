package Mavensample.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebookTestCase {
  WebDriver driver;
	@Test
  
  public void Login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vihaan\\Desktop\\Webdriver\\chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
 
}
}
