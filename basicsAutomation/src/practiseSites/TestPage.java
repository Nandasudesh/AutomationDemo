package practiseSites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gad=1&gclid=CjwKCAjwl6OiBhA2EiwAuUwWZYECcJIrSpCS5pzzYFIokIliEMapZ8hi5Z2F9IWh4C0xyeACJUnc_hoCaWgQAvD_BwE&gclsrc=aw.ds");
		
		//driver.findElement(By.linkText("File Upload Example Page")).click();
		//System.out.println("clicked");
		/*WebElement chooseFile=driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
		chooseFile.click();
		StringSelection str=new StringSelection("C:\\Users\\nanda\\OneDrive\\Documents\\Automation\\notes.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb=new Robot();
		rb.delay(1000);
		System.out.println("Delay");
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.navigate().to("https://testpages.herokuapp.com/styled/file-upload-test.html");
		WebElement choose=driver.findElement(By.xpath("//input[@type='file']"));
		choose.sendKeys("C:\\Users\\nanda\\OneDrive\\Documents\\Automation\\notes.docx");
		
		driver.navigate().to("https://testpages.herokuapp.com/frames/index.html");
		driver.switchTo().frame("content");
		driver.findElement(By.linkText("Load white page")).click();
		driver.findElement(By.linkText("Back to original page")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		driver.findElement(By.linkText("Example 1")).click();*/
		
		driver.navigate().to("http://uitestingplayground.com/click");
		WebElement buttonClick=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		buttonClick.click();
		System.out.println(buttonClick.getCssValue("color"));
		
		

	}

}
