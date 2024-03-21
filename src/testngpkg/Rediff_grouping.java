package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_grouping {
	ChromeDriver driver; 
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}	
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}
		@Test
		public void test1()
		{
			String exp ="refiff.com";
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
	@Test
	public void test2()
	{
		boolean logo =driver.findElement(By.xpath("//div[@id=\"wrapper\"]/table/tbody/tr/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
	}
	@Test
	public void test3()
	{
		//boolean title =driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[1]")).isDisplayed();
		WebElement title=driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[1]"));
		String p = driver.getPageSource();
		String t1="Full Name";
		if(p.contains(t1))
		{
			System.out.println("Full Name is displayed");
		}
		else
		{
			System.out.println("Full Name is not displayed");
		}
	}
	@Test
	public void test4()
	{
		boolean button =driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[34]/td[2]/input[6]")).isEnabled();
		if(button)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}
	}
	@Test
	public void test5()
	{
		WebElement text=driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[34]/td[2]/input[6]"));
		String s=text.getAttribute("value");
		String st="Create my account >>";
		if(s.contains(st))
		{
			System.out.println("text is displayed");
		}
		else
		{
			System.out.println("text is not displayed");
		}
	}

	
}
