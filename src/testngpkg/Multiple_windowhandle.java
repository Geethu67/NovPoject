package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiple_windowhandle {
	
WebDriver driver;
@BeforeTest
public void beforetest()
{
	driver = new ChromeDriver();
}

@Test
public void test() 
{
	driver.get("https://demo.guru99.com/popup.php");
	String parentwindow = driver.getWindowHandle();  // to get current window or tab
	System.out.println("Parent Window"+driver.getTitle()); // to get the title of the parent tab
	driver.findElement(By.xpath("//html/body/p/a")).click();
	Set<String> allWindowHandles = driver.getWindowHandles();
	for(String handle : allWindowHandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc2gmail.com");
			driver.close();
		}
		driver.switchTo().window(parentwindow);
	}
}

}
