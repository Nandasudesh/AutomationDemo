package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		
		driver.switchTo().frame("iframeResult");
		
		//No of rows
		int rows=driver.findElements(By.xpath("//table/tbody/tr")).size();
		System.out.println("No of rows: "+rows);
		
		//No of column
		int column=driver.findElements(By.xpath("//table/tbody/tr/th")).size();
		System.out.println("No of column: "+column);
		Thread.sleep(1000);
		//Get Germany
		/*WebElement text=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
		System.out.println(text.getText());*/
		
		//Use loop
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=column;c++) {
				WebElement text=driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]"));
				System.out.println(text.getText());
			}
			System.out.println(" ");
		}
		
		
		
		
		

	}

}
