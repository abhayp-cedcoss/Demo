package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import java.lang.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class MakeWebBetter {

	  public static WebDriver driver;
	  public static String urls="https://www.makewebbetter.com/";
	  public static String registration_url="https://makewebbetter.com/plans/";
      public static String base_login_url="https://makewebbetter.com/my-account/";
      public static String store_url="https://makewebbetter.com/store/";
      public static String deal_url="https://makewebbetter.com/deals/";
      public static String blog_url="https://makewebbetter.com/blog/";
      public static String contact_url="https://makewebbetter.com/contact-us/";
      
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
			          Thread.sleep(6000);
			         // driver.switchTo.frame("drift-widget");
			          //driver.findElement(By.id())
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
				 /*  driver.findElement(By.id("mwb_choose_plan")).click();
				   Thread.sleep(3000);
				   driver.findElement(By.xpath(".//*[@id='pms_register-form']/div[2]/ul/div/li/div[2]/label/input")).click();
				   Thread.sleep(5000);
				   driver.findElement(By.name("pms_register")).submit();
				   Thread.sleep(5000);*/
				   System.out.println("Successfuly  Sign UP");

	  }
//***********************************LOG IN YOUR ACCOUNT  USING FUNCTION **********************************************************//	  
	  
 public void log_in()throws InterruptedException 
	  {
				    driver.findElement(By.linkText("LOGIN")).click();
				  
				    JavascriptExecutor jse = (JavascriptExecutor)driver; 
					jse.executeScript("window.scrollBy(0, 350)"," ");
					driver.findElement(By.id("username")).clear();
					driver.findElement(By.id("username")).sendKeys("Demo123@mwb.com");
					driver.findElement(By.id("password")).clear();
					driver.findElement(By.id("password")).sendKeys("Demo123456");
					driver.findElement(By.id("rememberme")).click();
					//driver.findElement(By.name("login")).click();
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
				System.out.println("plan function calling start "); 
				driver.findElement(By.linkText("OUR PLANS")).click();
			
				JavascriptExecutor jse = (JavascriptExecutor)driver;   
				jse.executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(3000);
				jse.executeScript("window.scrollBy(0,400)", "");
				Thread.sleep(3000);
				jse.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(3000);
				driver.findElement(By.className("ea-item-head")).click();
				Thread.sleep(2 * 1000);
				driver.findElement(By.className("ea-item-head")).click();
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0,700)", "");
				Thread.sleep(3000);
				jse.executeScript("window.scrollBy(0,800)", "");
				Thread.sleep(3000);
				jse.executeScript("window.scrollBy(0,1000)", "");
				Thread.sleep(3000);
				jse.executeScript("window.scrollBy(0,1200)", "");
				Thread.sleep(3000); 
				jse.executeScript("window.scrollBy(0,-400)", "");
			
				System.out.println("moving to top ");
				System.out.println("plans completed");
				Thread.sleep(5000);

   }

public void deals()throws InterruptedException
			{
				System.out.println("plan function calling start "); 
				driver.findElement(By.linkText("DEALS")).click();
			
				 JavascriptExecutor jse = (JavascriptExecutor)driver;   
			     jse.executeScript("window.scrollBy(0,200)", "");
			     Thread.sleep(3000);
			     jse.executeScript("window.scrollBy(0,400)", "");
			     Thread.sleep(3000);
			     jse.executeScript("window.scrollBy(0,500)", "");
			     Thread.sleep(3000);
			     jse.executeScript("window.scrollBy(0,700)", "");
			     Thread.sleep(3000);
			     jse.executeScript("window.scrollBy(0,800)", "");
			     Thread.sleep(3000);
			     jse.executeScript("window.scrollBy(0,1000)", "");
			     Thread.sleep(3000);
			     jse.executeScript("window.scrollBy(0,1200)", "");
			     Thread.sleep(3000); 
			     System.out.println("deals section completed");
	
}
public void home()throws InterruptedException
{
				driver.findElement(By.linkText("GET STARTED")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				JavascriptExecutor jse = (JavascriptExecutor)driver;   
				jse.executeScript("window.scrollBy(0,300)", "");
				//Thread.sleep(3000);
				System.out.println("click on wordpress plugin tab");
				driver.findElement(By.className("siteorigin-widget-tinymce textwidget")).click();
				//  Thread.sleep(4000);
				jse.executeScript("window.scrollBy(0,300)", "");
				driver.navigate().back();
				// Thread.sleep(3000);
				System.out.println("click on wordpress theme");
				jse.executeScript("window.scrollBy(483,582)", "");

//******** Get element exact location using  Point class **************************************//
			    
			    WebElement Image = driver.findElement(By.id("panel-w5a2fa99a33808-0-1-0"));
			    Point p=Image.getLocation();
			    int xlength=p.getX();
			    int ylength=p.getY();
			    System.out.println("value of x in pixel is:"+xlength+"value of y axis in pixels is"+ylength);  
			    driver.findElement(By.id("panel-w5a2fa99a33808-0-1-0")).click();
			    Thread.sleep(4000);
			    driver.navigate().back();
			    jse.executeScript("window.scrollBy(170,300)", "");
			    Thread.sleep(3000);
			    driver.findElement(By.id("panel-w5a2fa99a33808-0-2-0")).click();
			    Thread.sleep(4000);
			    driver.navigate().back();
			    jse.executeScript("window.scrollBy(0,400)", "");
			    Thread.sleep(3000);
			    driver.findElement(By.id("panel-w5a2fa99a33808-1-0-0")).click();
			    Thread.sleep(4000);
			    driver.navigate().back();
			    jse.executeScript("window.scrollBy(0,400)", "");
			    Thread.sleep(3000);
			    driver.findElement(By.id("panel-w5a2fa99a33808-1-1-0")).click();
			    Thread.sleep(4000);
			    driver.navigate().back();
			    jse.executeScript("window.scrollBy(0,400)", "");
			    Thread.sleep(3000);
			    driver.findElement(By.id("panel-w5a2fa99a33808-1-2-0")).click();
			    Thread.sleep(4000);
			    driver.navigate().back();
			    jse.executeScript("window.scrollBy(0,500)", "");
			    Thread.sleep(3000);
			    driver.findElement(By.id("panel-w5a2fa99a33808-2-0-0")).click();
			    Thread.sleep(4000);
			    driver.navigate().back();
			    jse.executeScript("window.scrollBy(0,500)", "");
			    Thread.sleep(3000);
			    driver.findElement(By.id("panel-w5a2fa99a33808-2-1-0")).click();
			    Thread.sleep(4000);
			    driver.navigate().back();
			    jse.executeScript("window.scrollBy(0,1600)", "");
			   /* driver.findElement(By.id("foo2042_next")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("foo2042_next")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("foo2042_next")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("foo2042_next")).click();
			    Thread.sleep(2000);*/
			    
//******** Get element exact location using  Point class **************************************//
			    WebElement Images = driver.findElement(By.id("foo2042_next"));
			    Point p1=Images.getLocation();
			    int xlengths=p.getX();
			    int ylengths=p.getY();
			    System.out.println("value of x in pixel is:"+xlengths+"value of y axis in pixels is"+ylengths); 
			    System.out.println("home page invoked successfully");
}







   public static void main(String s[]) throws InterruptedException  {
		   
	   //*******************Lanuching chrome browser *****************************/
		   
		   
	   MakeWebBetter mwb=new MakeWebBetter();  
	   System.out.println("launching chrome browser");
	   System.setProperty("webdriver.chrome.driver","/home/cedcoss/Pictures/chromedriver");
	   driver = new ChromeDriver();
	    
//***************	    Getting url of the extension ***************************** //
	    
	    driver.get("https://www.makewebbetter.com");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("HOME")).click();
	    Thread.sleep(2 * 1000);
	    System.out.println("invoking home page");
	    mwb.home(); 
	    System.out.println("Now check bottom links of the page ");
	    mwb.link_text();
	    
	    System.out.println("Now check Plan page ");
	    mwb.plan();
	    System.out.println("Deals section is start ");
	    mwb.deals();

	    System.out.println("Now check Sign up page ");
	    mwb.signUp();
	    System.out.println("Now check Login page ");
	    mwb.log_in();
	    
	    
	    
	    System.out.println("contact_us function invoked");
	    mwb.contact_US();

	}

}



	
	  
	  
	  
 
