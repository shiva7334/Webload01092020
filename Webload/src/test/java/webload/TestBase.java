package webload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {
	
WebDriver driver;
	
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sruthi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.webloadmpstore.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	  }
  
  
  
  @AfterTest
  public void afterTest() {
	  
	  
  driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr/td/a[1]")).click();
  driver.quit();
  }
  
  
  
}