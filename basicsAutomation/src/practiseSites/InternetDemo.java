package practiseSites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class InternetDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Checkboxes")).click();
		WebElement checkBox1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		checkBox1.click();
		WebElement checkBox2=driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
		checkBox2.click();
		
		driver.navigate().back();
		driver.findElement(By.linkText("Context Menu")).click();
		
		Actions act=new Actions(driver);
		WebElement rightClick=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		act.contextClick(rightClick).perform();
		driver.switchTo().alert().accept();
		
		driver.navigate().back();
		driver.findElement(By.linkText("Drag and Drop")).click();
		
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement b=driver.findElement(By.xpath("//div[@id='column-b']"));
		act.dragAndDrop(a, b).perform();
		
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.linkText("Dropdown")).click();
		
		Thread.sleep(1000);
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select slObj=new Select(dropDown);
		slObj.selectByVisibleText("Option 1");
		
		driver.navigate().back();
		driver.findElement(By.linkText("File Upload")).click();
		
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		chooseFile.sendKeys("C:\\Users\\nanda\\OneDrive\\Documents\\Git and Github.docx");
		driver.findElement(By.xpath("//*[@id='file-submit']")).click();
		WebElement text=driver.findElement(By.xpath("//*[@class='example']/h3"));
		System.out.println(text.getText());
		
		
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.linkText("Key Presses")).click();
		
		WebElement key=driver.findElement(By.xpath("//input[@id='target']"));
		key.click();
		key.sendKeys("a");
		key.sendKeys(Keys.BACK_SPACE);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		}

}
