package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfXpath {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		//OR XPath
		WebElement messageText=driver.findElement(By.xpath("//input[@placeholder='message' or @id='single-input-field']"));
		messageText.sendKeys("Nanda");
		
		//AND XPath
		
		WebElement enterValueA=driver.findElement(By.xpath("//input[@class='form-control' and @id='value-a']"));
		enterValueA.sendKeys("45");
		
		//Contains XPath
		
		WebElement enterValueB=driver.findElement(By.xpath("//input[contains(@id,'-a')]"));
		enterValueB.sendKeys("901");
		
		//text() Xpath
		
		/*WebElement yourMessage= driver.findElement(By.xpath("//div[text()=' Your Message :']"));
		if(yourMessage.isDisplayed()) {
			System.out.println("Message is present");
		}*/
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		
		WebElement sampleText=driver.findElement(By.xpath("//b[text()='This is sample text!']"));
		if(sampleText.isDisplayed()) {
		System.out.println("Text is displayed");
		
		}
		
	}

}
