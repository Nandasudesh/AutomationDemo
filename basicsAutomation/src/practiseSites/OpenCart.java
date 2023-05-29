package practiseSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		Actions act=new Actions(driver);
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		act.moveToElement(desktop).moveToElement(mac).click().perform();
		
		

	}

}
