package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser_fb_xml
{
WebDriver driver;
String baseurl="https://www.facebook.com";
@Parameters({"browser"})
@Test
public void setUp(String browser)
{
	if(browser.equalsIgnoreCase("chrometest"))
	{
	driver = new ChromeDriver();
	}
	else
	{
		driver = new EdgeDriver();
	}
}
@Test
public void test()
{
	driver.get(baseurl);
}
}
