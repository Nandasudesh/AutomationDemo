package practiseSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		System.out.println("Name: "+email.getAttribute("name"));
		System.out.println("Value: "+email.getAttribute("value"));
		//WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		System.out.println("Text: "+email.getText());
		

	}

}
