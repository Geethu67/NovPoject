package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya_prm2 {

ChromeDriver driver;
String baseurl="https://janasya.com";
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void janasya_log()
	{
		String exp ="janasya.com";
		String actual = driver.getTitle();
		System.out.println(actual);
		if(actual.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//div[@data-index=\"22\"]//div[1]/nav/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
		driver.findElement(By.xpath("//div[@id=\"halo-sidebar\"]//div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
	}
	
	
}
