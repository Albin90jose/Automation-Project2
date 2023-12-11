package parabank_finalproject;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBank {

	public void url(WebDriver driver)
	{
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=CCB19185089DC43D46B281728B5DA465");
	}
	//Registration
	public void first(WebDriver driver)
	{
		String fname=JOptionPane.showInputDialog("Enter first name");
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(fname);

	}
	
	public void last(WebDriver driver)
	{
		String lname=JOptionPane.showInputDialog("Enter last name");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lname);

	}
	
	public void address(WebDriver driver)
	{
		String add=JOptionPane.showInputDialog("Enter address");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(add);

	}
	
	public void city(WebDriver driver)
	{
		String city=JOptionPane.showInputDialog("Enter city");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);

	}
	
	public void state(WebDriver driver)
	{
		String state=JOptionPane.showInputDialog("Enter state");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(state);

	}
	
	public void zipcode(WebDriver driver)
	{
		String zip=JOptionPane.showInputDialog("Enter zip code");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(zip);

	}
	
	public void phone(WebDriver driver)
	{
		String ph=JOptionPane.showInputDialog("Enter phone number");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(ph);

	}
	
	public void ssn(WebDriver driver)
	{
		String ssn=JOptionPane.showInputDialog("Enter ssn");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(ssn);

	}
	
	public void user(WebDriver driver)
	{
		String usn=JOptionPane.showInputDialog("Enter username");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(usn);

	}
	
	public void pwd(WebDriver driver)
	{
		String pass=JOptionPane.showInputDialog("Enter password");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(pass);

	}
	
	public void pwd2(WebDriver driver)
	{
		String pass2=JOptionPane.showInputDialog("confirm password");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(pass2);

	}
	
	public void Register(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@value='Register']")).click();

	}
	
	public void logout(WebDriver driver)
	{
		driver.findElement(By.linkText("Log Out")).click();

	}
	
	}
