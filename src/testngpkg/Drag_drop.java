package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop {
	ChromeDriver driver;
	String baseurl ="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void copypastemethd()
	{
		WebElement bank= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		WebElement fiveth= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a "));
		WebElement amount= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		WebElement sales= driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement account1= driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	
		WebElement fiveth1= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a "));
		WebElement amount1= driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(bank, account);
		act.dragAndDrop(fiveth, amount);
		act.dragAndDrop(sales, account1);
		act.dragAndDrop(fiveth1, amount1);
		
		act.perform();	
	}
@Test
public void displaycopypaste()
{
	
		boolean text =driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
		if(text)
		{
			System.out.println("Perfect is displayed");
		}
		else
		{
			System.out.println("Perfect is not displayed");
		}
}
		//*[@id="fourth"]/a =5000
		//*[@id="credit1"]/a = sales
		
	
}
