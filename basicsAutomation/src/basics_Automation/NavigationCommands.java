package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class NavigationCommands {

	public static void main(String[] args) {
		
		//ChromeDriver driver=new ChromeDriver();
		//webdriver.chrome.driver//Setting path
		//for firefox - webdriver.gecko.driver
		//WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.quit();
		//driver.close();
		
		//navigation commands
		driver.navigate().to("https://www.google.com");//navigates to google.com, used instead of get command
		//driver.navigate().back();//back to obsqura page
		//driver.navigate().forward();//back to google
		driver.navigate().refresh();
		
		//Locators 
		//ID
		//WebElement button=driver.findElement(By.id("single-input-field"));
				//button.sendKeys("Yes");
		
		WebElement button =driver.findElement(By.className("form-control"));
		button.sendKeys("Yess");
		WebElement message=driver.findElement(By.className("btn-primary"));
		message.click();
		//WebElement message=driver.findElement(By.id("button-one"));
		//message.click();
		WebElement inputFields=driver.findElement(By.className("card-header"));
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("20");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("95");
		WebElement total=driver.findElement(By.id("button-two"));
		total.click();
		
		

	}

}
