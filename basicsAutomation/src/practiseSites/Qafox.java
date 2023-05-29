package practiseSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qafox {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		
		//Search Option
		WebElement searchClick= driver.findElement(By.name("search"));
		searchClick.sendKeys("iphone");
		WebElement searchButton=driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-default btn-lg']"));
		searchButton.click();
		WebElement categorySelect=driver.findElement(By.xpath("//select[@name='category_id']"));
		//categorySelect.sendKeys("PC");
		
		Select selectObj=new Select(categorySelect);
		selectObj.selectByValue("26");
		WebElement searchClick2=driver.findElement(By.xpath("//input[@value='Search']"));
		searchClick2.click();
		WebElement myAccount=driver.findElement(By.xpath("//a[@title='My Account']"));
		myAccount.click();
		WebElement registerClick=driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a"));
		registerClick.click();
		

	}

}
