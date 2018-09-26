package demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.0.214/shopping/wp-admin";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDemo() throws Exception {
    driver.get(baseUrl + "/shopping/");
    driver.findElement(By.linkText("My account")).click();
    driver.findElement(By.linkText("Log out")).click();
    driver.findElement(By.id("user_login")).clear();
    driver.findElement(By.id("user_login")).sendKeys("admin");
    driver.findElement(By.id("user_pass")).clear();
    driver.findElement(By.id("user_pass")).sendKeys("password");
    driver.findElement(By.id("wp-submit")).click();
    new Select(driver.findElement(By.id("dropdown_product_type"))).selectByVisibleText("Variable product");
    driver.findElement(By.id("post-query-submit")).click();
    driver.findElement(By.cssSelector("div.row-actions.visible > span.edit > a")).click();
    driver.findElement(By.linkText("Variation Swatches")).click();
    driver.findElement(By.xpath("//div[@id='ced-vm-accordion']/div[2]/div/h4")).click();
    new Select(driver.findElement(By.name("ced_vm_ds_catalog"))).selectByVisibleText("40px * 40px");
    new Select(driver.findElement(By.name("ced_vm_dn_catalog"))).selectByVisibleText("No");
    new Select(driver.findElement(By.name("ced_vm_dn_catalog"))).selectByVisibleText("Yes");
  }

  @After
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




/*package demo;
 * 
 * 
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Mwbselenium {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","/home/cedcoss/Pictures/chromedriver");
		driver = new ChromeDriver();
    baseUrl = "https://makewebbetter.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMwb() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("Get Started")).click();
    driver.findElement(By.xpath("//img[@alt='arrow']")).click();
    driver.findElement(By.xpath("//img[@alt='arrow']")).click();
    driver.findElement(By.cssSelector("#menu-item-1511 > a > span")).click();
    driver.findElement(By.cssSelector("p.plugin-scroll")).click();
    new Select(driver.findElement(By.name("orderby"))).selectByVisibleText("Sort by price: low to high");
    driver.findElement(By.cssSelector("#menu-item-3417 > a > span")).click();
    driver.findElement(By.cssSelector("h2.ea-item-head")).click();
    driver.findElement(By.cssSelector("h2.ea-item-head")).click();
    driver.findElement(By.cssSelector("#sizzle1518521552667 > h2.ea-item-head")).click();
    driver.findElement(By.cssSelector("#sizzle1518521552667 > h2.ea-item-head")).click();
    driver.findElement(By.cssSelector("#sizzle1518521552667 > h2.ea-item-head")).click();
    driver.findElement(By.cssSelector("#sizzle1518521552667 > h2.ea-item-head")).click();
    driver.findElement(By.cssSelector("div.mwb_plan_type > ul > li")).click();
    driver.findElement(By.cssSelector("strong")).click();
    driver.findElement(By.xpath("//div[@id='panel-3415-0-0-0']/div/div/div[2]/ul/li[2]/strong")).click();
    driver.findElement(By.cssSelector("div.mwb_plan_type > ul > li")).click();
    driver.findElement(By.xpath("//div[@id='panel-3415-0-0-0']/div/div/div[2]/ul/li[2]/strong")).click();
    driver.findElement(By.cssSelector("strong")).click();
    driver.findElement(By.xpath("//div[@id='panel-3415-0-0-0']/div/div/div[2]/ul/li[2]/strong")).click();
    driver.findElement(By.cssSelector("strong")).click();
    driver.findElement(By.linkText("Deals")).click();
    driver.findElement(By.linkText("Hosting")).click();
    driver.findElement(By.cssSelector("li.cat-item.cat-item-3131 > a")).click();
    driver.findElement(By.linkText("0 items$0.00")).click();
    driver.findElement(By.linkText("Signup")).click();
    driver.findElement(By.id("user_login")).click();
    driver.findElement(By.id("user_login")).click();
    driver.findElement(By.id("user_login")).click();
    driver.findElement(By.id("user_login")).clear();
    driver.findElement(By.id("user_login")).sendKeys("Henry");
    driver.findElement(By.id("user_email")).clear();
    driver.findElement(By.id("user_email")).sendKeys("Henruy@gmail.com");
    driver.findElement(By.id("pass1")).clear();
    driver.findElement(By.id("pass1")).sendKeys("henry@gmail.com");
    driver.findElement(By.id("pass2")).clear();
    driver.findElement(By.id("pass2")).sendKeys("henry@gmail.com");
    driver.findElement(By.name("register")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.name("login")).click();
    driver.findElement(By.id("rememberme")).click();
    driver.findElement(By.name("login")).click();
    driver.findElement(By.linkText("Contact Us")).click();
    driver.findElement(By.id("nf-field-1")).clear();
    driver.findElement(By.id("nf-field-1")).sendKeys("hanry");
    driver.findElement(By.id("nf-field-2")).clear();
    driver.findElement(By.id("nf-field-2")).sendKeys("hanry@gmail.com");
    driver.findElement(By.id("nf-field-3")).clear();
    driver.findElement(By.id("nf-field-3")).sendKeys("nice to see you");
    driver.findElement(By.linkText("Support Forum")).click();
    driver.findElement(By.cssSelector("#menu-item-3288 > a > span")).click();
    driver.findElement(By.linkText("WooCommerce spinning wheel plugin- Uplifting your eCommerce business!")).click();
    driver.findElement(By.xpath("//img[@alt='Grow your sales with One Click Upsell']")).click();
  }

  @After
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

*/
