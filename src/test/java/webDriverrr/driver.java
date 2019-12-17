package webDriverrr;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class driver {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.google.com");
	  driver.findElement(By.cssSelector("input[title='Search']")).click();
	  driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("create gmail account");
	  driver.findElement(By.cssSelector("input[value='Google Search']")).click();
	 driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[3]/div/div/div[1]/a/h3/span")).click();
	 driver.findElement(By.xpath("//*[@id=\'firstName\']")).sendKeys("Akash");
	  Thread.sleep(10000); 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
