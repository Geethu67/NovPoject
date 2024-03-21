package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation_exercise_signup {
ChromeDriver driver;
String baseurl ="https://automationexercise.com/";
@BeforeTest
public void  logn()
{
	driver = new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test()
{
	WebElement sign = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
	sign.click();
	WebElement signname = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
	signname.sendKeys("Geethu");
	WebElement signemail = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
	signemail.sendKeys("geethusugathan123@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button\r\n")).click();
	
	driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	
	WebElement password = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[4]/input"));
	password.sendKeys("Geethu123**");
	
	WebElement day= driver.findElement(By.xpath("//*[@id=\"days\"]"));
	Select daydetails = new Select(day);
	daydetails.selectByValue("1");
	
	WebElement month= driver.findElement(By.xpath("//*[@id=\"months\"]"));
	Select monthdetails =new Select(month);
	monthdetails.selectByValue("7");
	
	WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
	Select yeardetails =new Select(year);
	yeardetails.selectByValue("2000");
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[6]/div/span/input")).click();
	
	WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
	firstname.sendKeys("Geethu");
	
	WebElement Lname = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
	Lname.sendKeys("Sugathan");
	
	WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
	company.sendKeys("Luminar Techno Lab");	
	
	WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
	address.sendKeys("Kannanthadathil Mannarakulanji P.O Pathanamthitta");	
	
	WebElement address2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
	address2.sendKeys("Kannanthadathil(H) Mannarakulanji P.O Pathanamthitta");
	//*[@id="address2"]
	
	WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select countrydetails =new Select(country);
	countrydetails.selectByValue("India");
	
	WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
	state.sendKeys("Kerala");
	
	WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
	city.sendKeys("Pathanamthitta");
	
	WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
	zipcode.sendKeys("689678");
	
	WebElement mobile = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
	mobile.sendKeys("9987634542");
	
	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).submit();
}
}
