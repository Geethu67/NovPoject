package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion_prgm {

	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);	
	}
	
	@Test
	public void test1()
	{
	String exp = "facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(actual, exp);
	System.out.println("test1 completed");
	}
}
