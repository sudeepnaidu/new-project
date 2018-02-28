package log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class adminTest extends orangeTest {
  @Test(priority=1)
  public void f() {
      driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b")).click();
	  driver.findElement(By.xpath(".//*[@id='searchSystemUser_userName']")).sendKeys("00001");
	 WebElement el= driver.findElement(By.xpath(".//*[@id='searchSystemUser_userType']"));
	 Select s1=new Select(el);
	 s1.selectByValue("2");
	 driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
	 driver.navigate().back();
	 
  }
}
