package basics_Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import com.google.common.io.Files;

import utilities.JsUtilities;

public class JsExecutorClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		//drawing border
		
		WebElement border=driver.findElement(By.xpath("(//*[@alt='logo'])[1]"));
		JsUtilities.drawBorder(border, driver);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(".\\ScreenShots\\logo.png");//.\\ is current project
		FileUtils.copyFile(src, des);
		
		//Title
		JsUtilities.getTitle(driver);
		Thread.sleep(2000);
		//Scroll Down
		JsUtilities.scrollDown(driver);
		//Scroll Up
		Thread.sleep(2000);
		JsUtilities.scrollUp(driver);
		//Zoom
		JsUtilities.zoom(driver);
		
		
		
		

	}

}
