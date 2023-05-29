package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		
		//Single value
		/*WebElement dropSearch=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		dropSearch.click();
		//(//span[@class='select2-selection select2-selection--single'])[1]
		WebElement dropText=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		dropText.sendKeys("Washington");
		WebElement washington=driver.findElement(By.xpath("//li[text()='Washington']"));
		washington.click();
		
		//Multiple Values
		WebElement selectMultiple=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		selectMultiple.click();
			selectMultiple.sendKeys("Hawaii");
		selectMultiple.sendKeys(Keys.ENTER); //Keyboard
		selectMultiple.sendKeys("California");
		selectMultiple.sendKeys(Keys.ENTER);
		selectMultiple.sendKeys("Nevada");
		
		selectMultiple.sendKeys(Keys.ENTER);
		selectMultiple.sendKeys("Alaska");
		selectMultiple.sendKeys(Keys.ENTER);*/
		
		
		WebElement multipleValue=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		multipleValue.click();
		multipleValue.sendKeys("Hawaii");
		driver.findElement(By.xpath("//li[text()='Hawaii']")).click();
		multipleValue.sendKeys("Nevada");
		driver.findElement(By.xpath("//li[text()='Nevada']")).click();
		
		//WebElement hawaii=driver.findElement(By.xpath("//ul[@id='select2-states-8z-results']"));
		//hawaii.click();
		
		//category
		WebElement dropSearch2=driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]"));
		dropSearch2.click();
		WebElement dropValEnter=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		dropValEnter.sendKeys("Nevada");
		WebElement dropValSelect=driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']"));
		dropValSelect.click();
		
		//isMultiple();
		
	}

}
