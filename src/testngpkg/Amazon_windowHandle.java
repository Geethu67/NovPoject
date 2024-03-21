package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_windowHandle {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver = new ChromeDriver();
	}
@Test
public void test() 
{
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize(); // to maximize
	String hometab = driver.getWindowHandle(); //to get home tab
	WebElement search=  driver.findElement(By.xpath("//form[@role=\"search\"]/div[2]/div[1]/input"));
	search.sendKeys("Mobiles");
	search.submit();
	
	String expected ="Amazon.in : Mobiles";
	String actual= driver.getTitle();
	System.out.println(actual);
	if(expected.equals(actual))
	{
		System.out.println("Correct Title");
	}
	else
	{
		System.out.println("Incorrect Title");
	}
	
	WebElement mobile=  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	mobile.click();
	
	Set<String> multiplewindow = driver.getWindowHandles();
	for(String secondtab:multiplewindow)
	{
		if(!secondtab.equalsIgnoreCase(hometab))
		{
			driver.switchTo().window(secondtab);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();		
		}
		driver.switchTo().window(hometab);
	}
}	
}
