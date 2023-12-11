package parabank_finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccount {
	public void url(WebDriver driver)
	{
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=CCB19185089DC43D46B281728B5DA465");
	}

	//LOGIN
		//username
		public void username(WebDriver driver)
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yyy@gmail.com");

		}
		
		public void password(WebDriver driver)
		{
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");

		}
		
		public void login(WebDriver driver)
		{
			driver.findElement(By.xpath("//input[@value='Log In']")).click();

		}
		

	public void openNewAccount(WebDriver driver)
	{
		driver.findElement(By.linkText("Open New Account")).click();

	}
	public void AccountType(WebDriver driver)
	{
		Select s=new Select(driver.findElement(By.xpath("//select[@id='type']")));
		s.selectByIndex(1);
	}
	
	public void MinimumAmmount(WebDriver driver)
	{
		Select s=new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		s.selectByIndex(1);
	}
	
	public void Open(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
	}
	
	public void About(WebDriver driver)
	{
		driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[@href='about.htm'][normalize-space()='About Us']")).click();
	}
	public void Service(WebDriver driver)
	{
		driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[@href='services.htm'][normalize-space()='Services']")).click();
	}
	public void Admin(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[normalize-space()='Admin Page']")).click();
	}
	public void Logout(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
	}
	

}
