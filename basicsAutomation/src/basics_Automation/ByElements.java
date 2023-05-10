package basics_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByElements {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		List <WebElement> headers=driver.findElements(By.xpath("//div[@class='card-header']"));
		System.out.println(headers.size());
		
		//printing all Links
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement n:links) {
			System.out.println(n.getText());
		}


	}

}
