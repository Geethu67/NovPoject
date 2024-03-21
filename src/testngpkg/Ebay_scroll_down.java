package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_scroll_down {

ChromeDriver driver;	
String baseurl="https://www.ebay.com/";
	@BeforeTest
	public void before()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/h3/a"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",aboutus);
		aboutus.click();
	}
}
