package ie;


import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class iebrowser {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebDriverWait wait= new WebDriverWait(driver, 20);
	  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	  //WebElement we= driver.findElement(By.name("email"));
	  Actions act=new Actions(driver);
	  //act.keyDown(we, Keys.SHIFT).sendKeys("akash").keyUp(Keys.SHIFT).sendKeys("kumar").perform();
	  //Thread.sleep(5000);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"))).
	  moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));

	  //act.moveToElement(driver.findElement(By.xpath["//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a"]));
	  Assert.assertFalse(driver.getCurrentUrl().contains("del"));
	 //WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
	 //we.sendKeys("hello");Summer Dresses

	  
	  
	  
	  //WebElement dropdown= driver.findElement(By.id("selectProductSort"));
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //Select drop= new Select(dropdown);
	  //drop.selectByIndex(1);
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
	 /* driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
	  driver.findElement(By.className("btn")).click();
	  Thread.sleep(5000);
	  if(ExpectedConditions.alertIsPresent()!=null)
	  {   Alert b= driver.switchTo().alert();
		  Thread.sleep(5000);
		  System.out.println(b.getText());
		  b.accept();
		  Thread.sleep(5000);
		  
	  }
	  System.out.println(driver.getTitle());
	  driver.navigate().to("https://www.google.com/?gws_rd=ssl#spf=1575628308074");
	  System.out.println(driver.getTitle());
	  driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Today's news");
	  driver.findElement(By.cssSelector( "input[name='btnK']")).click();
	  Thread.sleep(7000);
	  driver.navigate().back();
	  driver.navigate().back();
	  System.out.println(driver.getTitle());
	  driver.navigate().refresh();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.cssSelector( "input[name='phone']")).click();
	  driver.findElement(By.cssSelector( "input[name='phone']")).sendKeys("9876543210");
	  Thread.sleep(5000);
	  System.out.println(driver.getTitle());
	  //driver.findElement(By.cssSelector("input[name='firstName']")).click();
	  //driver.manage().window().maximize();
	  //Assert.assertEquals("Home", driver.getTitle());
	  //driver.findElement(By.id("firstName")).sendKeys("kkkhhh");
	  //driver.findElement(By.id("lastName")).sendKeys("HHHkkk");
	  //driver.findElement(By.cssSelector("input[name='firstName']")).click();
	  //driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Hari");
	  //driver.findElement(By.cssSelector("input[name='lastName']")).click();
	  //driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Akash");
	  //driver.findElement(By.cssSelector("input#Passwd")).click();
	  //driver.findElement(By.cssSelector("input#Passwd")).sendKeys("akshakshkaka23");
	  //driver.findElement(By.cssSelector("input#Confirmpasswd")).click();
	  //driver.findElement(By.cssSelector("input#Confirmpasswd")).sendKeys("akshakshkaka23");
	  	
	  
	  //Thread.sleep(10000);*/
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
	 driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	
  }

}
