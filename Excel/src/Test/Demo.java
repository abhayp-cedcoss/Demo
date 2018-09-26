package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
public class Demo {

	public static void main(String[] args) {
		
		System.out.println("heelo");
		 System.setProperty("webdriver.chrome.driver","/home/cedcoss/Pictures/chromedriver");
		   WebDriver driver = new ChromeDriver();
	       String  baseUrl = "http://www.demo.guru99.com/V4/";
	       driver.get(baseUrl);
	      // driver.get("http://www.demo.guru99.com/V4/");
	       driver.manage().window().maximize();
	}

}
