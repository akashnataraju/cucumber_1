package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobject {
	
	  WebDriver driver;
	  
	  public void openurl() {
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/login/");
	  
	  };
	  
	  public void user() {
	  
	  driver.findElement(By.id("email")).sendKeys("akashs123@gmail.com");
	  
	  }
	  
	  public void pass() {
	  
	  driver.findElement(By.id("pass")).sendKeys("12345678911");
	  
	  }
	  
	  public void quit() {
	  
	  driver.quit();
	  
	  }
	 

}
