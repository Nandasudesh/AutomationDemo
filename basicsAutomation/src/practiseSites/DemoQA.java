package practiseSites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		
		
	/*	//Check box and Buttons
		WebElement checkBoxButton=driver.findElement(By.xpath("//span[@class='text' and text()='Check Box']"));
		checkBoxButton.click();
		WebElement expandButton=driver.findElement(By.xpath("//button[@title='Expand all']"));
		expandButton.click();
		WebElement desktopClick=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
		desktopClick.click();
		WebElement textResult=driver.findElement(By.xpath("//div[@id='result']"));
		System.out.println("Result: "+textResult.getText());
		
		WebElement radioButton=driver.findElement(By.xpath("//span[text()='Radio Button']"));
		radioButton.click();
		WebElement text=driver.findElement(By.xpath("//div[text()='Do you like the site?']"));
		System.out.println("Text: "+text.getText());
		WebElement yesClick=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesClick.click();
		
		//mouse events
		WebElement Buttons=driver.findElement(By.xpath("//span[text()='Buttons']"));
		Buttons.click();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		WebElement doubleclickButton=driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		act.doubleClick(doubleclickButton).perform();
		
		WebElement doubleText=driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]"));
		System.out.println("Double click text:"+ doubleText.getText());
		
		WebElement rightClickButton=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(rightClickButton).perform();
		WebElement rightClickText=driver.findElement(By.xpath("//*[@id=\"rightClickMessage\"]"));
		System.out.println("Right click text: "+rightClickText.getText());
		
		WebElement clickMe=driver.findElement(By.xpath("//*[text()='Click Me']"));
		clickMe.click();
		WebElement clickText=driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]"));
		System.out.println("Click: "+clickText.getText());
		
		//Alerts
		driver.navigate().to("https://demoqa.com/alertsWindows");
		Thread.sleep(1000);
		WebElement AlertButton=driver.findElement(By.xpath("//span[text()='Alerts']"));
		AlertButton.click();
		WebElement simpleAlertButton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlertButton.click();
		driver.switchTo().alert().accept();
		
		WebElement confirmButton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		driver.switchTo().alert().dismiss();
		WebElement confirmText=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println("ConfirmText: "+confirmText.getText());
		
		Thread.sleep(1000);
		WebElement promptButton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptButton.click();
		driver.switchTo().alert().sendKeys("Nanda");
		driver.switchTo().alert().accept();
		WebElement pronmptText=driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println("prompt text: "+pronmptText.getText());
		
		//File Upload
		driver.navigate().to("https://demoqa.com/upload-download");
		WebElement uploadButton=driver.findElement(By.xpath("//*[@id='uploadFile']"));
		uploadButton.sendKeys("C:\\Users\\nanda\\OneDrive\\Documents\\Automation\\notes.docx");
		System.out.println("File Uploaded");
		
		
		//Window Handle
		driver.navigate().to("https://demoqa.com/browser-windows");
		WebElement newTabClick=driver.findElement(By.xpath("//button[@id='tabButton']"));
		newTabClick.click();
		
		Set<String> WindowIDs= driver.getWindowHandles();
		List<String> WindowIDList=new ArrayList(WindowIDs);
		for(String i:WindowIDList) {
			String title=driver.switchTo().window(i).getTitle();
			System.out.println("ID: "+i+"\n"+"Title: "+title);
			
		}
		WebElement childText=driver.findElement(By.tagName("h1"));
		System.out.println(childText.getText());*/
		
		driver.navigate().to("https://demoqa.com/upload-download");
		WebElement uploadButton=driver.findElement(By.xpath("//*[@id='uploadFile']"));
		uploadButton.click();
		StringSelection str=new StringSelection("C:\\Users\\nanda\\OneDrive\\Documents\\Automation\\New Microsoft Excel Worksheet.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
