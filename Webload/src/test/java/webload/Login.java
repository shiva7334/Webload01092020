package webload;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends TestBase {
	
	
  @Test
  public void LoginPage() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr/td/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[2]/td[2]/input")).sendKeys("shiva");
	driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td[2]/input")).sendKeys("sunmoon");
	driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[6]/td/input")).click();
	Thread.sleep(5000);
	
	
	 	  
  }
}
