package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource_prgm {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		 String url ="https://www.google.com";
		 driver.get(url);
		 String page_r = driver.getPageSource();
		  String exp_r = "Gmail";
		  if(page_r.contains(exp_r))
		  {
			  System.out.println(exp_r+" is present in the text");
		  }
		  else
		  {
			  System.out.println(exp_r+" is not present in the text");

		  }
		  driver.quit();
	}

}
