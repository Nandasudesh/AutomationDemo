package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		//set a system property "webdirver.chrome.driver" to the path of the chromeDriver.exe file 
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		//and instantiate a chromeDriver class
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement logo=driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[1]/div/a/img"));
		if(logo.isDisplayed()) {
			System.out.println("LOGO Is present");
		}
		else {
			System.out.println("LOGO is not present");
		}
		
		//Display text
		WebElement menuDisplay=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div"));
		System.out.println(menuDisplay.getText());
		//(or)
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div")).getText());
		
	}

}
