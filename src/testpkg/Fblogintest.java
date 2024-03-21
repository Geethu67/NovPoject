package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;
import pagepkg.Fbsignin;



public class Fblogintest {

WebDriver driver;

@BeforeTest
public void setup()
{
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
}
	
@Test
public void  test()
{
	Fbloginpage obj= new Fbloginpage(driver);
	obj.setvalues("abc@gmail.com", "abcd*123");
	obj.login();
	driver.navigate().back();
}	
@Test
public void test1()
{
	Fbsignin obj1 = new Fbsignin(driver);
	obj1.fbcreate();
	String actualtitle=obj1.fbtitle();
	Assert.assertEquals(actualtitle, "createpage");
	obj1.fbsiginin();
}
}
