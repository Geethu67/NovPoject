package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbsignin {

WebDriver driver;

By fbcreate= By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By fbsigin = By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");	
	
public 	Fbsignin(WebDriver driver)
{
	this.driver= driver;
}
public void fbcreate()
{
	driver.findElement(fbcreate).click();
}
public void fbsiginin()
{
	driver.findElement(fbsigin).click();
}
public String fbtitle()
{
	String title = driver.getTitle();
	return title;
}

}
