package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_Present {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		// isDisplayed() and isEnabled()
		/*WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Is logo displayed: "+logo.isDisplayed());
		System.out.println("Is logo enabled: "+logo.isEnabled());
		
		//isSelected() can be used for radio buttons/check boxes/drop down
		WebElement maleClick=driver.findElement(By.xpath("//input[@id='gender-male']"));
		maleClick.click();
		System.out.println("Is male selected: "+maleClick.isSelected());	
		System.out.println(driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected());
		*/
		
		WebElement date=driver.findElement(By.name("DateOfBirthDay"));	
		Select SelectDate=new Select(date);
		SelectDate.selectByValue("13");
		
		WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
		Select SelectMonth=new Select(month);
		SelectMonth.selectByVisibleText("January");
		
		WebElement year=driver.findElement(By.name("DateOfBirthYear"));
		Select SelectYear=new Select(year);
		SelectYear.selectByValue("1994");
		
		

	
	}

}
