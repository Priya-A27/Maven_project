package Mavensample.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googleTestCase {
  WebDriver driver;
  @Test
  public void google() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vihaan\\Desktop\\Webdriver\\chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
 
}
}
