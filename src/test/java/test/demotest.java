package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demotest {
	
	static
	{
		System.setProperty(" webdriver.chrome.driver", "D://chromedriver.exe");
	}
@Test
public void testone()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
}
}
