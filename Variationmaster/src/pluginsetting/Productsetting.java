package pluginsetting;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import java.lang.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 
import java.io.BufferedReader;

public class Productsetting {
	public static WebDriver drive;
	
	
	public void variable_product()throws InterruptedException
	{
		System.out.println("function invoked suuccefully");
		Actions action = new Actions(drive);
		action.moveToElement(drive.findElement(By.linkText("Products"))).build().perform();
		Thread.sleep(1000);
		drive.findElement(By.linkText("All Products")).click();	
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)drive;   
		jse.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(2000);
		 Select sl =new Select(drive.findElement(By.id("dropdown_product_type")));	
		 sl.selectByValue("variable");
		 drive.findElement(By.name("filter_action")).submit();
		 Thread.sleep(2000);
		 drive.findElement(By.linkText("Shoes")).click();
		 Thread .sleep(1000);
		 jse.executeScript("window.scrollBy(0,400)", "");
		 drive.findElement(By.linkText("Variation Swatches")).click();
		 Thread .sleep(1000);
		 drive.findElement(By.className("ced-vm-panel-heading")).click();
		 Thread.sleep(2000);
		 drive.findElement(By.name("ced_vm_label_brand")).clear();
		 drive.findElement(By.name("ced_vm_label_brand")).click();
		 Select color=new Select(drive.findElement(By.name("ced_vm_dt_brand")));
		 color.selectByValue("2");
		 
		 Select display_size=new Select(drive.findElement(By.name("ced_vm_ds_brand")));
		 color.selectByValue("3");
		 
		 Select circle=new Select(drive.findElement(By.name("ced_vm_ds2_brand")));
		 color.selectByValue("2");
		 
		 Select display_name=new Select(drive.findElement(By.name("ced_vm_dn_brand")));
		 color.selectByValue("1");
		 Thread.sleep(2000);
		 
		 drive.findElement(By.className("ced-vm-sub-panel-heading")).click();
		 Thread.sleep(2000);
		 Select variation_image=new Select(drive.findElement(By.name("ced_vm_sdt_Liberty")));
		 variation_image.deselectByValue("1");
		 drive.findElement(By.tagName("button")).click();
		 Thread.sleep(2000);
		 drive.findElement(By.xpath(".//*[@id='__attachments-view-39']/li[1]/div/div")).click();
		 Thread.sleep(2000);
		 drive.findElement(By.className("button media-button button-primary button-large media-button-select")).click();
		 
		 
		 

		 
		 
		
	}
	
	

}
