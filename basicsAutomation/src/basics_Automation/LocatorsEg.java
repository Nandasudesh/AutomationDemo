package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.classplusapp.com/newApp/login");
		WebElement code=driver.findElement(By.className("accountLogin-input"));
		code.sendKeys("SPARC");
		WebElement number=driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
		number.sendKeys("8547173383");
	}

}
