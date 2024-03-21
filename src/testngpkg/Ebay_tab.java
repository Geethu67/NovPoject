package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_tab {

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
		Actions act = new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
		act.moveToElement(electronics);
		
		act.perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		//WebElement smartphone= driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		//smartphone.click();
		
	}
	
}

