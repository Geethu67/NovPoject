package junitpkg;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_demo {

	ChromeDriver driver = new ChromeDriver();
  String baseurl = "https://www.facebook.com";
 @Before
 public void setup()
 {
	driver.get(baseurl); 
 }
	
@Test
public void titleverification()
{
	String exp ="facebook";
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
}
@After
public void tearDown() 
{
	driver.quit();
}	
	
}
