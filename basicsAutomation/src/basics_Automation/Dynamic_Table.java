package basics_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Table {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://qalegend.com/billing/public/home");
		
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("admin");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("12345");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='End tour']")).click();
		
		Thread.sleep(2000);
		WebElement contacts=driver.findElement(By.xpath("//*[@id='tour_step4_menu']"));
		contacts.click();
		
		Thread.sleep(2000);
		WebElement suppliers=driver.findElement(By.xpath("(//*[@class='fa fa-star'])[1]"));
		suppliers.click();
		Thread.sleep(2000);
		//
		//1.total number of pages in table
		String text=driver.findElement(By.xpath("//div[@id='contact_table_info']")).getText();
		//System.out.println(text); //Showing 1 to 25 of 1,045 entries
		
		//indexOf and subString is used -java builtin methods
		String data=text.substring(text.indexOf("f")+ 2, text.indexOf("e")-1);
		//System.out.println(data);
		String entries=data.replaceAll(",", "");
		System.out.println("Total entries: "+entries);
		
		Thread.sleep(2000);
		for(int p=1;p<6;p++) {
			WebElement activePage=driver.findElement(By.xpath("//li[@class='paginate_button active']//a"));
			System.out.println("Current active page: "+activePage.getText());
			//total no of rows in active page
			//activePage.click();
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-striped dataTable']//tbody//tr")).size();
			System.out.println("No of rows in active page "+activePage.getText()+": "+rows);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String page=Integer.toString(p+1);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[@class='paginate_button ']//a[text()='"+page+"']")).click();
			
		}
		
		
		
		
		
		//driver.close();
		
		
		
		
		
	}

}
