package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch_xpath {

	ChromeDriver driver;
	
		String baseurl = "https://www.google.com";
		@Before
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get(baseurl);
		}
	
		@Test
		public void google_search()
		{
			WebElement search =driver.findElement(By.xpath("//form[@role=\"search\"]//div/div/div[2]/textarea"));
			search.sendKeys("books");
			search.submit();
		}	
}
