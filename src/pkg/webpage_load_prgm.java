package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class webpage_load_prgm {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
 String url = "https://www.geeksforgeeks.org/";
 driver.get(url);
 String page_s = driver.getPageSource();
 String result= "Language";
 if(page_s.contains(result))
 {
	 System.out.println("present");
 }
 else
 {
	 System.out.println("not present");
 }

	}

}
