package parabank_finalproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class MainClass2 {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  System.setProperty("webdriver.fiefox.driver","C:\\Users\\jose_\\OneDrive\\Documents\\AUTOMATION\\Browser Extension\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority = 1)
  public void parabank() throws Exception
  {
	  ParaBank p= new ParaBank();
	  p.url(driver);
	  Thread.sleep(2000);
	  p.first(driver);
	  Thread.sleep(2000);
	  p.last(driver);
	  Thread.sleep(2000);
	  p.address(driver);
	  Thread.sleep(2000);
	  p.city(driver);
	  Thread.sleep(2000);
	  p.state(driver);
	  Thread.sleep(2000);
	  p.zipcode(driver);
	  Thread.sleep(2000);
	  p.phone(driver);
	  Thread.sleep(2000);
	  p.ssn(driver);
	  Thread.sleep(2000);
	  p.user(driver);
	  Thread.sleep(2000);
	  p.pwd(driver);
	  Thread.sleep(2000);
	  p.pwd2(driver);
	  Thread.sleep(2000);
	  p.Register(driver);
	  Thread.sleep(2000);
	  p.logout(driver);
	  Thread.sleep(2000);
	 
	  
  }
  @Test
  public void openNewAccount() throws Exception
  {
	  OpenNewAccount o= new OpenNewAccount();
	  o.url(driver);
	  Thread.sleep(2000);
	  o.username(driver);
	  Thread.sleep(2000);
	  o.password(driver);
	  Thread.sleep(2000);
	  o.login(driver);
	  Thread.sleep(2000);
	  o.openNewAccount(driver);
	  Thread.sleep(2000);
	  o.AccountType(driver);
	  Thread.sleep(2000);
	  o.MinimumAmmount(driver);
	  Thread.sleep(2000);
	  o.Open(driver);
	  Thread.sleep(2000);
	  o.About(driver);
	  Thread.sleep(2000);
	  o.Service(driver);
	  Thread.sleep(2000);
	  o.Admin(driver);
	  Thread.sleep(2000);
	  o.Logout(driver);
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
