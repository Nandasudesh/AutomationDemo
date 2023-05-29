package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssEg {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		
		//Locator LinkText
		WebElement simpleFormLink = driver.findElement(By.linkText("Simple Form Demo"));
		simpleFormLink.click();
		System.out.println("clicked");
		
		
		WebElement messageText = driver.findElement(By.cssSelector("input.form-control")); //tag.class
		messageText.sendKeys("css Class");
		
		WebElement messageClick = driver.findElement(By.cssSelector("button#button-one")); //tag#ID
		messageClick.click();
		
		WebElement valueAText = driver.findElement(By.cssSelector("input[id=value-a]")); //tag[type=value]
		valueAText.sendKeys("20");
		
		//WebElement valueBText = driver.findElement(By.cssSelector("input[placeholder=Enter Value]")); //same place holder multiple times
		
		WebElement valueBText = driver.findElement(By.cssSelector("input[id=value-b]"));
		valueBText.sendKeys("20");
		
		WebElement getTotalClick = driver.findElement(By.cssSelector("button[id=button-two]")); 
		getTotalClick.click();
		
		

		
		
		
		
		

	}

}
