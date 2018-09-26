package pluginsetting;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import java.lang.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


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

public class Admin {
	public static WebDriver drive;
	public void variable_product()throws InterruptedException
	{
		System.out.println("function invoked suuccefully");
		Actions action = new Actions(drive);
		action.moveToElement(drive.findElement(By.linkText("Products"))).build().perform();
		Thread.sleep(2000);
		drive.findElement(By.linkText("All Products")).click();	
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)drive;   
		jse.executeScript("window.scrollBy(0,100)", "");
		 drive.manage().window().maximize();

		Thread.sleep(2000);
		 Select sl =new Select(drive.findElement(By.id("dropdown_product_type")));	
		 sl.selectByValue("variable");
		 drive.findElement(By.name("filter_action")).submit();
		 Thread.sleep(2000);
		 drive.findElement(By.linkText("Shoes")).click();
		 Thread .sleep(2000);
		 jse.executeScript("window.scrollBy(0,400)", "");
		 drive.findElement(By.linkText("Variation Swatches")).click();
		 Thread .sleep(2000);
		 
 //*******************************Selecting Brand from shoes********************************************************
	
	/*	 drive.findElement(By.tagName("h4")).click();
		 Thread.sleep(2000);
		 drive.findElement(By.name("ced_vm_label_brand")).clear();
		 drive.findElement(By.name("ced_vm_label_brand")).sendKeys("Brand_name");;
		 Select color=new Select(drive.findElement(By.name("ced_vm_dt_brand")));
		 color.selectByValue("2");
		 
		 Select display_size=new Select(drive.findElement(By.name("ced_vm_ds_brand")));
		 display_size.selectByValue("3");

		 Select circle=new Select(drive.findElement(By.name("ced_vm_ds2_brand")));
		 circle.selectByValue("2");
		 jse.executeScript("window.scrollBy(0,500)", "");

		 Select display_name=new Select(drive.findElement(By.name("ced_vm_dn_brand")));
		 display_name.selectByValue("1");
		 Thread.sleep(2000);
		 
		 drive.findElement(By.className("ced-vm-sub-panel-heading")).click();
		 Thread.sleep(2000);
		 Select variation_image=new Select(drive.findElement(By.name("ced_vm_sdt_Liberty")));
		 
		 variation_image.selectByValue("1");
		 drive.findElement(By.tagName("button")).click();
		 Thread.sleep(3000);
			System.out.println("click on browse button");

		 drive.findElement(By.cssSelector(".ced-vm-scimage-upload")).click();
		 Thread.sleep(2000);
		 System.out.println("clicked successfully");

		 drive.findElement(By.xpath("//*[@id=\"__attachments-view-39\"]/li[1]/div")).click();
		 System.out.println("image selected ");
		 Thread.sleep(6000);
		 System.out.println("image selected successfully ");
	     drive.findElement(By.className("media-button")).click();	
		 System.out.println("image uploaded successfully ");   
		 Thread.sleep(2000);
////////************************************ selecting image  for power variation   *******************************************/
		 
	/*	 drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[1]/div[2]/div/div/div[3]")).click();
		 Thread.sleep(1000);
         Select variation_images=new Select(drive.findElement(By.name("ced_vm_sdt_Power")));
		 
		 variation_images.selectByValue("1");
		 drive.findElement(By.tagName("button")).click();
		 Thread.sleep(3000);
		System.out.println("click on browse button");

		 drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[1]/div[2]/div/div/div[4]/table/tbody/tr[2]/td[2]/button")).click();
		 Thread.sleep(3000);
		System.out.println("clicked successfully");
		drive.findElement(By.xpath("//*[@id=\"__attachments-view-401\"]/li[2]/div/div")).click();
		System.out.println("image selected "); 
		 Thread.sleep(6000);
		 System.out.println("image selected successfully ");
	     drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-3\"]/div[5]/div/div[2]/button"));
	     drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-3\"]/div[5]/div/div[2]/button")).click();
		 System.out.println("image uploaded successfully ");   
		 Thread.sleep(2000);*/
 
//*******************************Selecting catalog setting  from shoes ********************************************************/
	/*	 
		 Thread.sleep(2000);
		 drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[2]/div[1]")).click();
		 Thread.sleep(2000);
		 drive.findElement(By.name("ced_vm_label_catalog")).clear();
		 drive.findElement(By.name("ced_vm_label_catalog")).sendKeys("Catalog Name");
		 //jse.executeScript("window.scrollBy(0,20)", "");
		 Thread.sleep(2000);
		 System.out.println("ced_vm_dt_catalog");   
		 Select colors=new Select(drive.findElement(By.name("ced_vm_dt_catalog")));
		 colors.selectByValue("2");
		 System.out.println("image selected from drop down");  
		 Thread.sleep(3000);
		WebElement el=drive.findElement(By.className("ced-vm-ds1"));
		System.out.println(el);
		 Select display_sizes= new Select(drive.findElement(By.className("ced-vm-ds1")));
		 Thread.sleep(1000);

	      display_sizes.selectByVisibleText("60px * 60px");
		 Select circles=new Select(drive.findElement(By.name("ced_vm_ds2_catalog")));
		 Thread.sleep(2000);
			System.out.println("hell");
			 drive.manage().window().maximize();

		 circles.selectByValue("2");
		// jse.executeScript("window.scrollBy(0,300)", "");
			System.out.println("hell2");

		 Select display_names=new Select(drive.findElement(By.name("ced_vm_dn_catalog")));
		 Thread.sleep(1000);
			System.out.println("hell3");

		 display_names.selectByValue("1");
		 Thread.sleep(2000);*/
//********** Selecting  Variation image for Boys  ***************************************/		
		 
		/* drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[2]/div[2]/div/div/div[1]")).click();
		 Thread.sleep(2000);
		 Select variation_img=new Select(drive.findElement(By.name("ced_vm_sdt_Liberty")));
		 
		 variation_img.selectByValue("1");
		 Thread.sleep(3000);
		System.out.println("click on browse button");

	   drive.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/div/div/div[3]/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]/button")).click();
		 Thread.sleep(2000);
		System.out.println("clicked successfully");

		 drive.findElement(By.xpath("//*[@id=\"__attachments-view-605\"]/li[4]/div/div")).click();
		 System.out.println("image selected ");
		 Thread.sleep(6000);
		 System.out.println("image selected successfully ");
	     drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-6\"]/div[5]/div/div[2]/button")).click();
		 System.out.println("image uploaded successfully ");   
		 Thread.sleep(2000);*/
		 
//*********** selecting   variation image for girl ****************************************************/
		 
	/*	 drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[2]/div[2]/div/div/div[3]")).click();
		 Thread.sleep(1000);
         Select variation_imagesss=new Select(drive.findElement(By.name("ced_vm_sdt_Girls")));  
         Thread.sleep(1000);
		 variation_imagesss.selectByValue("1");
		 Thread.sleep(3000);
		System.out.println("click on browse button");

		 drive.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/div/div/div[3]/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[2]/div/div/div[4]/table/tbody/tr[2]/td[2]/button")).click();
		 Thread.sleep(2000);
		 System.out.println("clicked successfully");

		 drive.findElement(By.xpath("//*[@id=\"__attachments-view-809\"]/li[4]/div/div")).click();
		 System.out.println("image selected ");
		 
		 Thread.sleep(6000);
		 
		 System.out.println("image selected successfully ");
		 drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-9\"]/div[5]/div/div[2]/button")).click();
	   //  drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-3\"]/div[5]/div/div[2]/button")).click();	
		 System.out.println("image uploaded successfully ");  */
		 
//************ Selecting variation image for Kids ****************************************////////////////
	/*	 
	 drive.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/div/div/div[3]/div[1]/div[2]/div/div/div[8]/div[2]/div[2]/div[2]/div/div/div[5]")).click();
		 Thread.sleep(1000);
         Select variation_imagessss=new Select(drive.findElement(By.name("ced_vm_sdt_Girls")));  
         Thread.sleep(1000);
		 variation_imagessss.selectByValue("1");
		 Thread.sleep(3000);
		System.out.println("click on browse button");
		drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[2]/div[2]/div/div/div[6]/table/tbody/tr[2]/td[2]/button")).click();
		 //drive.findElement(By.xpath("")).click();
		 Thread.sleep(2000);
		 System.out.println("clicked successfully");

		 drive.findElement(By.xpath("//*[@id=\"__attachments-view-1013\"]/li[16]/div/div")).click();
		 System.out.println("image selected ");
		 
		 Thread.sleep(6000);
		 
		 System.out.println("image selected successfully ");
		 
	     drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-12\"]/div[5]/div/div[2]/button")).click();
	     
		 System.out.println("image uploaded successfully ");  
		 */
		 
//************************** Creating setting for  Parameter ******************************/		 

		 Thread.sleep(2000);
		 drive.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/div/div/div[3]/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[1]")).click();
		// Thread.sleep(2000);
		// drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[2]/div[1]")).click();

		 drive.findElement(By.name("ced_vm_label_parameter")).clear();
		 drive.findElement(By.name("ced_vm_label_parameter")).sendKeys("Sizes");
		 Thread.sleep(2000);
		// System.out.println("ced_vm_dt_parameter");   
		 Select colorss=new Select(drive.findElement(By.name("ced_vm_dt_parameter")));
		 colorss.selectByValue("2");
		 System.out.println("image selected from drop down");  
		 Thread.sleep(3000);
		WebElement els=drive.findElement(By.name("ced_vm_ds_parameter"));
		System.out.println(els);
		 Select display_siz= new Select(drive.findElement(By.className("ced-vm-ds1")));
		 Thread.sleep(1000);

	      display_siz.selectByVisibleText("60px * 60px");
		 Select circl=new Select(drive.findElement(By.name("ced_vm_ds2_parameter")));
		 Thread.sleep(2000);
			System.out.println("hell");

		 circl.selectByValue("2");
		//jse.executeScript("window.scrollBy(0,500)", "");
			System.out.println("hell2");

		 Select display_nam=new Select(drive.findElement(By.name("ced_vm_dn_parameter")));
		 Thread.sleep(1000);
			System.out.println("hell3");

		 display_nam.selectByValue("1");
		 Thread.sleep(3000);
		 
//********** Selecting  Variation image for size s  ***************************************/	
	
	    drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[3]/div[2]/div/div/div[1]")).click();
		 Thread.sleep(2000);
		 Select variation_imgg=new Select(drive.findElement(By.name("ced_vm_sdt_S")));
		 
		 variation_imgg.selectByValue("1");
		 Thread.sleep(3000);
		System.out.println("click on browse button");
		 drive.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/div/div/div[3]/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]/button")).click();
		 Thread.sleep(3000);
		 
		System.out.println("clicked successfully");
		
		 //jse.executeScript("window.scrollBy(0,500)", "");
		 Thread.sleep(5000);
			    
			drive.findElement(By.xpath("//*[@id=\"__attachments-view-39\"]/li[10]/div/div")).click();
			
		 System.out.println("image selected ");
		
		
		 Thread.sleep(6000);
		 System.out.println("image selected successfully ");

	     drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-0\"]/div[5]/div/div[2]/button")).click();	
		 System.out.println("image uploaded successfully ");   
		 Thread.sleep(2000);
		 
//*********** selecting   variation image for M ****************************************************/
		 
	 drive.findElement(By.xpath("//*[@id=\"ced-vm-accordion\"]/div[3]/div[2]/div/div/div[3]")).click();
		 Thread.sleep(1000);
         Select variation_im=new Select(drive.findElement(By.name("ced_vm_sdt_M")));  
         Thread.sleep(1000);
		 variation_im.selectByValue("1");
		 Thread.sleep(3000);
		 System.out.println("click on browse button");
       //  drive.findElement(By.className("ced-vm-scimage-upload")).click();
		 drive.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form/div/div/div[3]/div[1]/div[2]/div/div/div[8]/div[2]/div[3]/div[2]/div/div/div[4]/table/tbody/tr[2]/td[2]/button")).click();

		 Thread.sleep(2000);
		 System.out.println("clicked successfully");

		drive.findElement(By.xpath("/html/body/div[16]/div[1]/div/div/div[4]/div/ul/li[13]/div/div")).click();
		 System.out.println("image selected ");
		 
		 Thread.sleep(6000);
		 
		 System.out.println("image selected successfully ");
		 
	     drive.findElement(By.xpath("//*[@id=\"__wp-uploader-id-3\"]/div[5]/div/div[2]/button")).click();	
		 System.out.println("image uploaded successfully ");  
		 drive.findElement(By.id("publish")).click();
		 Thread.sleep(2000);
	

	}

	public static void main(String[] args) throws InterruptedException, IOException{
		
		Admin as=new Admin();

		
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","/home/cedcoss/Pictures/chromedriver");
		drive = new ChromeDriver();
		drive.navigate().to("https://localhost/shopping/wp-admin");
		Thread.sleep(2000);
	//	drive.manage().window().maximize();
		drive.findElement(By.id("user_login")).clear();
		drive.findElement(By.id("user_login")).sendKeys("admin");
		drive.findElement(By.id("user_pass")).clear();
		drive.findElement(By.id("user_pass")).sendKeys("password");
		drive.findElement(By.id("rememberme")).click();
		drive.findElement(By.id("wp-submit")).submit();
		System.out.println("successfully logged in");
		Thread.sleep(3000);


//**************** Moving to plugin setting and activating  woocommerce variation master **************************//

		/*Actions action = new Actions(drive);
		
		action.moveToElement(drive.findElement(By.linkText("Plugins"))).build().perform();
		Thread.sleep(1000);
		drive.findElement(By.linkText("Installed Plugins")).click();	
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)drive;   
		jse.executeScript("window.scrollBy(0,900)", "");
		drive.findElement(By.id("toplevel_page_ced-vm-settings")).click();
		Thread.sleep(2000);*/
		System.out.println("function calling start");
		as.variable_product();

		
		
//*********************  plugin Global Setting  starts ****************************************/		
		
/*
		
		WebElement  checkbox1=  drive.findElement(By.name("ced-vm-enable-swatch"));
		if(!checkbox1.isSelected()){
			checkbox1.click();
		}
		WebElement  checkbox2=   drive.findElement(By.name("ced-vm-enable-swatch-for-shop"));
		if(!checkbox2.isSelected()){
			checkbox2.click();
		}
		WebElement  checkbox3=  drive.findElement(By.name("ced-vm-show-varoations-btn-for-variation"));
		if(!checkbox3.isSelected()){
			checkbox3.click();
		}
		WebElement  checkbox4=drive.findElement(By.name("ced_vm_enable_pwg"));
		if(!checkbox4.isSelected()){
			checkbox4.click();
		}
		drive.findElement(By.name("save")).submit();
		Thread.sleep(1000);
		
		
		WebElement  checkbox5= drive.findElement(By.name("ced_vm_enable_this"));
		if(!checkbox5.isSelected()){
			checkbox5.click();
		}
		WebElement  checkbox6= drive.findElement(By.name("ced_vm_at"));
		if(!checkbox6.isSelected()){
			checkbox6.click();
		}
		WebElement  checkbox7= drive.findElement(By.name("dl"));
		if(!checkbox7.isSelected()){
			checkbox7.click();
		}
		WebElement  checkbox8= drive.findElement(By.name("selectswatchbor"));

		if(!checkbox8.isSelected()){
			checkbox8.click();
		}
		JavascriptExecutor js=(JavascriptExecutor)drive;
		js.executeScript("window.scrollBy(0,400)", "");
		Select sl=new Select(drive.findElement(By.id("vas")));
		sl.selectByVisibleText("Tooltip");
		Select sl1=new Select(drive.findElement(By.name("ced_vm_atds2")));
		sl1.selectByVisibleText("CIRCLE");
		Select s2=new Select(drive.findElement(By.name("ced_vm_atds1")));
		s2.selectByVisibleText("60px * 60px");

		Select sl3=new Select(drive.findElement(By.name("ced_vm_shop_size_attr")));
		sl3.selectByVisibleText("30px * 30px");

		WebElement  checkbox9= drive.findElement(By.name("ced_vm_usg"));

		if(!checkbox9.isSelected()){
			checkbox9.click();
		}
		WebElement  checkbox10= drive.findElement(By.name("ced_vm_featured"));

		if(!checkbox10.isSelected()){
			checkbox10.click();
		}
		WebElement  checkbox11= drive.findElement(By.id("ced_vm_slider_featured"));

		if(!checkbox11.isSelected()){
			checkbox11.click();
		}
		*/
//*******************************************IMPORT/EXPORT Setting *************************************////
		
	/*	drive.findElement(By.linkText("Import/Export")).click();
		Thread.sleep(2000);
		drive.findElement(By.linkText("Export Attributes")).click();
		 
		Thread.sleep(5000);
		CSVReader readcsv = new CSVReader(new FileReader("/home/cedcoss/Downloads/demo.txt"));
		List myData = readcsv.readAll();
		System.out.println("file readed successfully");
		Thread.sleep(7000);
		
		FileWriter writecsv = new FileWriter ("/home/cedcoss/Downloads/attribute_terms.csv");
		System.out.println("file created  succesfully");

	//	writecsv.append("7,color,Green,2,http://192.168.0.214/shopping/wp-content/uploads/2017/11/PRODUCTPAGE-ENHANCEMENT.png,#0000ff");
		writecsv.append("hello");
		writecsv.append('\n');
		System.out.println("csv  written succesfully");
		Thread.sleep(3000);
		drive.close();*/

	}

}
