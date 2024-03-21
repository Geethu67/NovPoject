package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya_xpath {

	ChromeDriver driver;
	String baseurl ="https://janasya.com";
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void janasya_prgm()
	{
		driver.findElement(By.xpath("//div[@data-index=\"22\"]//div[1]/nav/ul/li[1]/a/span")).click();
		WebElement search= driver.findElement(By.xpath("//div[@data-index=\"23\"]//div/div/div[3]/div/details-modal/predictive-search/details/summary/form/div/input[1]"));
		search.sendKeys("tops");
		search.submit();
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(WebElement ele: linklist)
		{
			String link= ele.getAttribute("href");
			String linktext = ele.getText();
			System.out.println(link+"........."+linktext);
		}
		
	}
}
