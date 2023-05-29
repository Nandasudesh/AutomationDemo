package practiseSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		
		int row=driver.findElements(By.xpath("//table/tbody/tr")).size();
		System.out.println("No of rows: "+row);
		
		int column=driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
		System.out.println("No of column: "+column);
		
		/*for(int r=1;r<row;r++) {
			for(int c=1;c<column;c++) {
				WebElement text=driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]"));
				System.out.print(text.getText()+" ");
				
				
			}
			System.out.println(" ");
			}*/
			 //or
			  for(int r=1;r<row;r++){
			  for(int c=1;c<column;c++)
			  {
			  String text=driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
			  System.out.println(text);
			  }
			  System.out.println(" ");
			 }
			 
			
			driver.quit();
		}
		

	}


