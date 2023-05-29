package basics_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitDemo {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//implicit wait:- wait till specified duration before throwing exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		
		//Explicit wait:- use if implicit still throws exception.
	/*	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.RETURN);//Enter function
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		System.out.println("Search content is present");*/
		
		//Fluent wait:- hard wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.RETURN);//Enter function
		
		WebElement foo=wait.until(new Function<WebDriver, WebElement>(){ 
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h3[text()='Selenium']"));
			}
		});
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		System.out.println("Search content is present");
		
	}
	

}
