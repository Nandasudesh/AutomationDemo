package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEg {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement messageText=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageText.sendKeys("Nanda S");
		WebElement showMessageClick=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageClick.click();
		WebElement valueAText=driver.findElement(By.xpath("//input[@id='value-a']"));
		valueAText.sendKeys("56");
		WebElement valueBText=driver.findElement(By.xpath("//input[@id='value-b']"));
		valueBText.sendKeys("86");
		WebElement getTotalClick=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalClick.click();
		
		
		//button[@id][1] , [1]represents the first copy
		
		//dynamic XPath
		
		//and
		//WebElement getTotalClick=driver.findElement(By.xpath("//button[@id="button-two" and @type='button']"));
		//getTotalClick.click();
		
		

	
		

	}

}
