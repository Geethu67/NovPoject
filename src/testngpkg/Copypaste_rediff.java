package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste_rediff {
ChromeDriver driver;
	String baseurl ="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void copypastemethd()
	{
		WebElement fullname= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediffid= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		fullname.sendKeys("abcdefg");
		Actions act = new Actions(driver);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(fullname,Keys.CONTROL);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(fullname,Keys.CONTROL);
		act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(rediffid,Keys.CONTROL);
		act.perform();
	}
	
			
}
