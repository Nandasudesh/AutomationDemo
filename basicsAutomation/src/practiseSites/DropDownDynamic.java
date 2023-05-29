package practiseSites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDynamic {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		
		WebElement multiple=driver.findElement(By.xpath("//textarea[@type='search']"));
		multiple.sendKeys("Hawaii");
		multiple.sendKeys(Keys.ENTER);
		/*WebElement hawaii=driver.findElement(By.xpath("//*[@id='select2-states-ie-results']"));
		hawaii.click();*/
		

	}

}
