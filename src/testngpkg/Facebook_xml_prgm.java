package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook_xml_prgm 
{
	ChromeDriver driver; 
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}	
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}

	@Parameters({"username","password"})
	@Test
	public void test(String username,String password )
	{
	System.out.println("value of username ="+username);
	System.out.println("value of password ="+password);
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	}
}
	

	
	

