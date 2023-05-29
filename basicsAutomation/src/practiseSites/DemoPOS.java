package practiseSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qalegend.com/billing/public/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[text()='End tour']")).click();
		
		driver.findElement(By.xpath("//span[text()='User Management']")).click();
		driver.findElement(By.xpath("(//*[@class='title'])[2]")).click();
		
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-primary']")).click();
		driver.findElement(By.xpath("//*[@name='surname']")).sendKeys("Miss");
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Aati");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Aayra3@gmail.com");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("AmnnS123");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("AmnnS123");
		driver.findElement(By.xpath("//*[@name='confirm_password']")).sendKeys("AmnnS123");
		driver.findElement(By.xpath("//*[@name='cmmsn_percent']")).sendKeys("23.1");
		driver.findElement(By.xpath("//*[@id='select2-role-container']")).click();
		driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]")).sendKeys("Technician");
		driver.findElement(By.xpath("//li[text()='Technician']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Nanda S");
		driver.findElement(By.xpath("//button[contains(@class,'delete_user_button')]")).click();
		
		
		
	}

}
