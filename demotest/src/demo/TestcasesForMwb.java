package demo;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test ;

public class TestcasesForMwb {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver","/home/cedcoss/Pictures/chromedriver");
  
	  driver = new ChromeDriver();

    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCasesForMwb() throws Exception {
	  driver = new ChromeDriver();
    driver.get("https://makewebbetter.com/");
    Thread.sleep(2000);
    driver.findElement(By.linkText("Our Plugins")).click();
    new Select(driver.findElement(By.name("orderby"))).selectByVisibleText("Sort by price: low to high");
    driver.findElement(By.name("orderby")).click();
    new Select(driver.findElement(By.name("orderby"))).selectByVisibleText("Sort by price: high to low");
    driver.findElement(By.name("orderby")).click();
    driver.findElement(By.xpath("//div[@id='top']/section")).click();
    driver.findElement(By.xpath("//li[@id='menu-item-3417']/a/span")).click();
    driver.findElement(By.xpath("//div[@id='panel-3415-0-0-0']/div/div/div[2]/ul/li[2]/strong")).click();
    driver.findElement(By.xpath("//li[@id='menu-item-3229']/a/span")).click();
    driver.findElement(By.linkText("Hosting")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Plugins')]")).click();
    driver.findElement(By.linkText("Services")).click();
    driver.findElement(By.linkText("Themes")).click();
    driver.findElement(By.xpath("//div[@id='top']/section")).click();
    driver.findElement(By.xpath("//li[@id='menu-item-4747']/a/span")).click();
    driver.findElement(By.xpath("//img[@alt='WordPress Migration / Cloning']")).click();
    driver.findElement(By.xpath("//div[@id='panel-4159-0-1-1']/div/div/div/p[3]/a/button")).click();
    driver.findElement(By.xpath("//div[@id='panel-4159-0-1-1']/div/div/div/p[3]/a/button")).click();
    driver.findElement(By.id("menu-item-1510")).click();
    driver.findElement(By.xpath("//li[@id='menu-item-1510']/a/span")).click();
    driver.findElement(By.id("nf-field-1")).click();
    driver.findElement(By.id("nf-field-1")).clear();
    driver.findElement(By.id("nf-field-1")).sendKeys("abhay");
    driver.findElement(By.id("nf-field-2")).clear();
    driver.findElement(By.id("nf-field-2")).sendKeys("testmwb13@gmail.com");
    driver.findElement(By.id("nf-field-3")).click();
    driver.findElement(By.id("nf-field-3")).clear();
    driver.findElement(By.id("nf-field-3")).sendKeys("want to use micro srevices");
    driver.findElement(By.id("nf-field-4")).click();
    driver.findElement(By.xpath("//div[@id='pg-120-1']/div")).click();
    driver.findElement(By.linkText("Documentation")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.close();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//li[@id='menu-item-3229']/a/span")).click();
    driver.findElement(By.linkText("Themes")).click();
    driver.findElement(By.xpath("//li[@id='menu-item-3417']/a/span")).click();
    driver.findElement(By.xpath("//li[@id='menu-item-4154']/a/span")).click();
    driver.findElement(By.xpath("//div[@id='mwb-hedaer-left']/div/div")).click();
    driver.findElement(By.linkText("Get WooCommerce")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.close();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.close();
  }

  //@AfterClass
  @Test(alwaysRun = true)
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
