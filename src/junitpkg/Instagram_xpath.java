package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_xpath {

	ChromeDriver driver = new ChromeDriver();
	String baseurl = "https://www.instagram.com";
	@Before
	public void setup()
	{
		driver.get(baseurl);
	}
	@Test
	public void insta_login()
	{
		driver.findElement( By.xpath("//form[@id='loginForm']/div/div[1]/label/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("abcdefgt");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).submit();

		
	}
	
	
}
