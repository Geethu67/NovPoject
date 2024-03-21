package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_xpath {

	ChromeDriver driver =new ChromeDriver();
	String baseurl="https://www.facebook.com";
	@Before
	public void setup()
	{
	driver.get(baseurl);	
	}
	
	@Test
	public void fb_login()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}
	
}
