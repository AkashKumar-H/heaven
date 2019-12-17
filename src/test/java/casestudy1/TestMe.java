package casestudy1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Assert.ThrowingRunnable;
import org.testng.annotations.AfterTest;

public class TestMe {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	  driver.findElement(By.id("userName")).sendKeys("Lalitha");
	  driver.findElement(By.id("firstName")).click();
	  Thread.sleep(3000);
    String a;
	Assert.assertTrue(driver.findElement(By.id("err")).isDisplayed(),a= driver.findElement(By.id("err")).getText());
	Thread.sleep(3000);
	System.out.println(a);
	if(a=="Name Already Exists")
	{
		 driver.findElement(By.id("userName")).clear();
		 Thread.sleep(3000);
		 driver.findElement(By.id("userName")).sendKeys("Akash Kumar");
		 driver.findElement(By.id("firstName")).sendKeys("Akash");
		 driver.findElement(By.id("lastName")).sendKeys("Kumar");
		 driver.findElement(By.id("password")).sendKeys("hello2424");
		 driver.findElement(By.id("pass_confirmation")).sendKeys("hello2424");
		 driver.findElement(By.id("gender")).click();
		 driver.findElement(By.id("emailAddress")).sendKeys("akashkumar@gmail.com");
		 driver.findElement(By.id("mobileNumber")).sendKeys("9876543221");
		 driver.findElement(By.id("dob")).sendKeys("03/24/1998");
		 driver.findElement(By.id("address")).sendKeys("Accenture CDC2, Chennai");
		 driver.findElement(By.id("securityQuestion")).click();
		 driver.findElement(By.xpath("//option[@value='411010']")).click();
		 driver.findElement(By.id("answer")).sendKeys("Madurai");
	}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
