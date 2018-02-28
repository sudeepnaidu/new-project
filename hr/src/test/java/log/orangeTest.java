package log;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class orangeTest {
	public WebDriver driver=null;
  @Test(priority=0)
  public void log() {
	  System.setProperty("webdriver.chrome.driver", "C:\\tarun\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
	  driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	 
  }

  

}
