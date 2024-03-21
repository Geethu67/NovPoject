package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	ChromeDriver driver= new ChromeDriver();
	String baseurl ="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void logfb()
	{
		driver.findElement(By.id("facebook")).sendKeys("agc@gmail.com");
		driver.findElement(By.id("passContainer")).sendKeys("abcde");
		driver.findElement(By.name("login")).click();

	}
	
	/*@After
	public void tearDown()
	{
		driver.quit();
	}*/
}
