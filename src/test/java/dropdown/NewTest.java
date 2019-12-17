package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException{
	  driver.get("https://semantic-ui.com/modules/dropdown.html");
	  WebElement dropdown= driver.findElement(By.name("gender"));
	  Select drop= new Select(dropdown);
	  drop.deselectByIndex(1);
	  
  }
}
