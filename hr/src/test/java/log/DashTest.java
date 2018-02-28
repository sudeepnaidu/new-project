package log;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DashTest extends adminTest {
  @Test(priority=2)
  public void f1() {
	  driver.findElement(By.xpath(".//*[@id='menu_dashboard_index']/b")).click();
  }
  @AfterTest
  public void afterTest() {
	  driver.findElement(By.xpath(".//*[@id='welcome']")).click();
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
  }
}
