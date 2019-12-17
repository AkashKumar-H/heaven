package mail;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import mail;
public class LoginTestMeAppODT { 
  public WebDriver driver; 
  public WebDriverWait wait;

  @beforeTest
  public void beforeTest() throws MalformedURLException
  {
   System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
   driver.new ChromeDriver();
   driver.manage().window().maximize();
   wait = new WebDriverWait(driver, 30);
   driver.get("http://10.232.237.143:443/TestMeAppr");
  }

  Fest(dataProvider="credentials")
  @Test
public void testMeAppLogin(String username,String password) throws InterruptedException
  {
   driver.findElement(By.tinkText("SignIn")).click(); 
   driver.findElement(By.name("userName")).sendkeys(username); 
   driver.findElement(By.name("password")).sendkeys(password); 
   driver.findElement(By.name("Login")).click();
   WebElement signout = wait.until(ExpectedConditions.presenceOVELementlocoted(0y.CinkText("SignOut"))) ; 
   Assert.ossertNotNutl(signout);
  }

  DataProvider(name="credentials")
  public Object[][] getData() throws I0Exception
  {return MyExcelReader.ReodDato();
  }

  AfterTest
  public void afterTest()
  {
   driver.close();
  }
}
