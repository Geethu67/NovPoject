package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_script {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//to launch chrome browser
    driver.get("https://www.google.com");	//url
    String expected_r="Google"; //expected title
    String actual_r= driver.getTitle(); //actual title
    System.out.println("Expected result"+expected_r);
    System.out.println("Actual result"+actual_r);

    if(expected_r.equals(actual_r)) //compare expected result with actual
    {
    	System.out.println("Pass");
    }
    else
    {
    	System.out.println("Fail");
    }
    driver.quit();// to close entire tab
    }

}
