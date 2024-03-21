package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_auto {
ChromeDriver driver;
	String baseurl="file:///C:/Users/SUGATHAN/Desktop/(Devu)Assignment/webpage_auto.html";
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void web_log()
	{
		WebElement ele =driver.findElement(By.xpath("//html//body/input[1]"));//to handle alert
		ele.click();
		
		Alert a =driver.switchTo().alert();
		String alerttext = a.getText();
		System.out.println("Alert Text = "+alerttext);
		
		a.accept();
		
		WebElement ele1 =driver.findElement(By.xpath("//html//body/input[2]"));
		ele1.sendKeys("geethu");
		WebElement ele3 =driver.findElement(By.xpath("//html//body/input[3]"));
		ele3.sendKeys("sugathan");
		WebElement ele4 =driver.findElement(By.xpath("//html//body/input[4]"));
		ele4.click();
		
		
	}
	
	
	
	
	
	
	
	
	
}
