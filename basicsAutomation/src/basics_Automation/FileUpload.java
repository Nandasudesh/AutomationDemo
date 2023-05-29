package basics_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	/*	driver.get("https://demo.automationtesting.in/Register.html");
		
		/* 1.sendKeys:- xpath tag should be input
		 * 2.autoIt
		 * 3.robotClass
		 
		WebElement uploadFile=driver.findElement(By.id("imagesrc"));
		uploadFile.sendKeys("C:\\Users\\nanda\\OneDrive\\Documents\\Automation\\file_upload.png");
		System.out.println("File uploaded");*/
		
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gad=1&gclid=CjwKCAjwl6OiBhA2EiwAuUwWZYECcJIrSpCS5pzzYFIokIliEMapZ8hi5Z2F9IWh4C0xyeACJUnc_hoCaWgQAvD_BwE&gclsrc=aw.ds");
		//identify element and click
		WebElement uploadResume=driver.findElement(By.xpath("//button[@type='button' and text()='Upload Resume']"));
		uploadResume.click();
		//file path passed as parameter to string selection
		StringSelection str=new StringSelection("C:\\Users\\nanda\\Downloads\\official_documents_1676829587.pdf");
		//Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		//Robot object creation
		Robot rb=new Robot();
		//pressing control + v
		rb.delay(250);
		//rb.keyPress(KeyEvent.VK_ENTER);
	    //rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		//pressing enter
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
