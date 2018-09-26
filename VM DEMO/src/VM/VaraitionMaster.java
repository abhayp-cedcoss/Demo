package VM;
import java.util.regex.Pattern;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VaraitionMaster {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","/home/cedcoss/Pictures/geckodriver");
	   // driver = new FirefoxDriver();
	    System.setProperty("webdriver.chrome.driver","/home/cedcoss/Pictures/chromedriver");
		   driver = new ChromeDriver();
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	  }
	  @Test
	  public void testVmgallery() throws Exception {
		  driver.get("https://codecanyon.net/user/makewebbetter/portfolio");
		  driver.findElement(By.xpath("//div[@id='content']/div/section")).click();
		  driver.findElement(By.linkText("WooCommerce Variation Master")).click();
		  System.out.println("click1");
		Thread.sleep(2000);
		 driver.get("http://demo.makewebbetter.com/variation-master/product/girls-top/");
		 Thread.sleep(2000);
		  JavascriptExecutor jse = (JavascriptExecutor)driver;   
			jse.executeScript("window.scrollBy(0,600)", "");
		 System.out.println("click2");
		    //driver.findElement(By.xpath("//div[@id='primary-menu']/ul")).click();
		    Thread.sleep(2000);
			 System.out.println("click3");
		    driver.findElement(By.id("attr_img_Pink")).click();
		    Thread.sleep(2000);
			 System.out.println("click3");
		    driver.findElement(By.id("attr_img_S")).click();
		    Thread.sleep(2000);
			 System.out.println("click4");
		    driver.findElement(By.id("attr_img_M")).click();
		    Thread.sleep(2000);
			 System.out.println("click5");
		    driver.findElement(By.id("attr_img_Denim")).click();
		    Thread.sleep(2000);
			 System.out.println("click6");
		    driver.findElement(By.id("attr_img_Black")).click();
		    Thread.sleep(2000);
			 System.out.println("click7");
		    driver.findElement(By.id("attr_img_L")).click();
		    Thread.sleep(2000);
			 System.out.println("click3");
		    driver.findElement(By.id("attr_img_Cotton")).click();
		    Thread.sleep(2000);
			 System.out.println("click8");
		    driver.findElement(By.xpath("(//img[contains(@src,'http://demo.makewebbetter.com/variation-master/wp-content/uploads/2017/11/b1-1.jpg')])[2]")).click();
		    Thread.sleep(2000);
			 System.out.println("click9");
		    driver.findElement(By.xpath("(//img[contains(@src,'http://demo.makewebbetter.com/variation-master/wp-content/uploads/2017/11/b3.jpg')])[2]")).click();
		    Thread.sleep(2000);
			 System.out.println("click10");
		    driver.findElement(By.xpath("(//img[contains(@src,'http://demo.makewebbetter.com/variation-master/wp-content/uploads/2017/11/g2.jpg')])[2]")).click();
		    Thread.sleep(2000);
			 System.out.println("click11");
		    driver.findElement(By.xpath("(//img[contains(@src,'http://demo.makewebbetter.com/variation-master/wp-content/uploads/2017/11/g4.jpg')])[3]")).click();
		  }
	  

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
