package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Website_methods {
	// public static  JavascriptExecutor jse;
	 
	  // System.setProperty("webdriver.chrome.driver","/home/cedcoss/Pictures/chromedriver");
	 WebDriver  driver = new ChromeDriver();
	   // driver = new ChromeDriver();
	//************************** Check your mouser hover and links ******************************************************//  
    
	  public void link_text()throws InterruptedException
	      {
	    	  driver.findElement(By.linkText("PLUGINS")).click();
	//*******************Use this class for scrolling on pages **************************************//      
	          
	          //-----for selecting values from drop down ----------------///
	    	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	  jse.executeScript("window.scrollBy(0,350)", "");
	    	  Thread.sleep(2000);

	          Select sl=new Select(driver.findElement(By.className("orderby")));
	          
	          System.out.println("select values from drop down");
	          
	          sl.selectByVisibleText("Sort by price: low to high");
	          Thread.sleep(4000);
	          jse.executeScript("window.scrollBy(350,500)", "");
	          Thread.sleep(4000);
	          jse.executeScript("window.scrollBy(0,1000)", "");
	          Thread.sleep(4000);
	          jse.executeScript("window.scrollBy(0,2000)", "");
	          Thread.sleep(4000);
	          /*jse.executeScript("window.scrollBy(0,2200)", "");
	          Thread.sleep(4000);*/
	          Actions action = new Actions(driver);
	          
	 // mouser  over on images and checking the link  /////////////////////
	          action.moveToElement(driver.findElement(By.className("social-facebook")));
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.className("social-email")));
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.className("social-gplus")));
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.className("social-medium")));
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.className("social-pinterest")));
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.className("social-tumblr")));
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.className("social-twitter")));
	          Thread.sleep(4000);
	      //--------- for mouse hover we use Action class ------------------------------//

	          action.moveToElement(driver.findElement(By.linkText("HOME"))).build().perform();
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.linkText("OUR PLANS"))).build().perform();
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.linkText("ABOUT US"))).build().perform();
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.linkText("PRIVACY POLICY"))).build().perform();
	          action.moveToElement(driver.findElement(By.linkText("HUBSPOT WOOCOMMERCE INTEGRATION"))).build().perform();
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.linkText("DEALS"))).build().perform();
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.linkText("BLOG"))).build().perform();
	          Thread.sleep(2000);
	          action.moveToElement(driver.findElement(By.linkText("TERMS AND CONDITIONS"))).build().perform();
	          Thread.sleep(2000);
	          driver.findElement(By.name("EMAIL")).sendKeys("abcdd@gmail.com");
	          
	          System.out.println("click to subscribe ");
	          
	         //driver.findElement(By.xpath(".//*[@id='mc4wp-form-1']/div[1]/p[2]/input")).submit();    
	          Thread.sleep(2000);
	          jse.executeScript("window.scrollBy(0,-350)", "");
	          System.out.println("click here for sign up");
	         // driver.findElement(By.xpath(".//*[@id='menu-item-3049']/a")).click();
	          System.out.println("successfull click on  sign up page ");
	          System.out.println("Plugin section successfully invoked ");


	          Thread.sleep(2000);
	          
	   //********************* Navigating Sign Up Page and checking links ****************************************************//
	  
	     
	    	  
	      }
		  
	 //**************** Register on your price and using Sign up form THROUGH FUNCTION CALLING  *************************************/
		  
	  public void signUp()throws InterruptedException{
			  
			   System.out.println("function called successfuly");
			   driver.findElement(By.linkText("SIGNUP")).click();
			   JavascriptExecutor jse = (JavascriptExecutor)driver; 
		        jse.executeScript("window.scrollBy(120,350)", "");
		        Thread.sleep(2000);
		        driver.findElement(By.id("pms_user_login")).sendKeys("Demo123");
		        Thread.sleep(2000);
		        driver.findElement(By.id("pms_user_email")).sendKeys("Demo12345@mwb.com");
		        Thread.sleep(2000);
		        driver.findElement(By.id("pms_pass1")).sendKeys("Demo123456");
		        Thread.sleep(2000);
		        driver.findElement(By.id("pms_pass2")).sendKeys("Demo123456");
		        Thread.sleep(2000);
		        jse.executeScript("window.scrollBy(0,350)", "");
		        Thread.sleep(1000);
		        driver.findElement(By.id("mwb_choose_plan")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath(".//*[@id='pms_register-form']/div[2]/ul/div/li/div[2]/label/input")).click();
		        Thread.sleep(5000);
		        //driver.findElement(By.name("pms_register")).submit();
		        Thread.sleep(5000);
				System.out.println("Successfuly  Sign UP");
			    
		  }
	//***********************************LOG IN YOUR ACCOUNT  USING FUNCTION **********************************************************//	  
		  
	 public void log_in()throws InterruptedException 
		  {
			 // driver.findElement(By.linkText("LOGIN")).click();
			  
			    JavascriptExecutor jse = (JavascriptExecutor)driver; 
				jse.executeScript("window.scrollBy(0, 350)"," ");
				driver.findElement(By.id("username")).clear();
				driver.findElement(By.id("username")).sendKeys("Demo123@mwb.com");
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys("Demo123456");
				driver.findElement(By.id("rememberme")).click();
				driver.findElement(By.name("login")).click();
				System.out.println("Successfuly logged in");
				Thread.sleep(5000);
				driver.quit();   
		  }
		  
	public void contact_US() throws InterruptedException
		  {
			    driver.findElement(By.linkText("CONTACT US")).click();   //navigating contact us page 
		        JavascriptExecutor jse = (JavascriptExecutor)driver;
		        System.out.println("scrolling start");
			    jse.executeScript("window.scrollBy(0,550)"," ");
				 
				  
	 // Store the current window handle
			
				  String winHandleBefore = driver.getWindowHandle();

	 // Perform the click operation that opens new window
				  driver.findElement(By.linkText("SUPPORT FORUM")).click();
				  
	 // Switch to new window opened
				  for(String winHandle : driver.getWindowHandles()){
				      driver.switchTo().window(winHandle);
				  }

	 // Perform the actions on new window
				  jse.executeScript("window.scrollBy(0, 100)"," ");
				  driver.findElement(By.id("helpdesk_ticket_email")).sendKeys("harrwilson@gmail.com");
				  driver.findElement(By.id("helpdesk_ticket_subject")).sendKeys("plugin issue");
				  Thread.sleep(4000);

				  
				  
				  /*driver.findElement(By.id("redactor_editor")).sendKeys("I want to know about your pluginsdshbfjfjkghv ");
				  Thread.sleep(1000);
				  driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.id("helpdesk_ticket_submit")).submit();*/
		          System.out.println("Freshdesk tickets page invoked successfully ");

				  
	// Close the new window, if that window no more required
				  driver.close();

	// Switch back to original browser (first window)
				  driver.switchTo().window(winHandleBefore);
				  
				  Thread.sleep(4000);
		  
			      driver.findElement(By.id("nf-field-1")).sendKeys("harry");
			      driver.findElement(By.id("nf-field-2")).sendKeys("harry@gmail.com");
			      driver.findElement(By.id("nf-field-3")).sendKeys("I want to know about your plugins");
			      Thread.sleep(3000);
			      // driver.findElement(By.id("nf-field-4")).click();	
		          System.out.println("Contact us page invoked successfully ");

		  }
	public  void plan() throws InterruptedException
	{
		System.out.println("Hello "); 
		driver.findElement(By.linkText("OUR PLANS")).click();

		 JavascriptExecutor jse = (JavascriptExecutor)driver;   
	     jse.executeScript("window.scrollBy(0,200)", "");
	     Thread.sleep(3000);
	     jse.executeScript("window.scrollBy(0,400)", "");
	     Thread.sleep(3000);
	     jse.executeScript("window.scrollBy(0,500)", "");
	     Thread.sleep(3000);
	     jse.executeScript("window.scrollBy(0,700)", "");
	     Thread.sleep(3000);
	     jse.executeScript("window.scrollBy(0,1000)", "");
	     Thread.sleep(3000);
	     jse.executeScript("window.scrollBy(0,1200)", "");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.className("ea-item-head")).click();
	     Thread.sleep(2 * 1000);
	     driver.findElement(By.className("ea-item-head")).click();
	     Thread.sleep(2000);
	     jse.executeScript("window.scrollBy(0,-400)", "");
	     
	      System.out.println("moving to top ");
	      Thread.sleep(5000);
		
	}
		  

}
