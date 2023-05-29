package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AertEg2 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement customerIdText= driver.findElement(By.name("cusid"));
		customerIdText.sendKeys("123456");
		WebElement submitClick=driver.findElement(By.name("submit"));
		submitClick.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text	);
		driver.switchTo().alert().accept();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		
		driver.switchTo().alert().accept();
		

	}

}
