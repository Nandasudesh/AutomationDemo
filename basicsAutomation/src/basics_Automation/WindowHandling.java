package basics_Automation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	//	driver.manage().window().maximize();
		
	//	String parentWindowId= driver.getWindowHandle(); //getWindowHandle() To get id of parent window. To return single window id
		//System.out.println(parentWindowId); //Print id
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(1000);
		//childWindowId.click();
		
		Set<String> windowIds=driver.getWindowHandles();//return set of string
		List <String> windowList=new ArrayList(windowIds);//converting set to list
		//for each loop
		for(String i:windowList) {
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(i+":"+title);
		}
		
		
		//String parentid=windowList.get(0);
		//String childid=windowList.get(1);
		
		//System.out.println("ParentId: "+ parentid);
		//System.out.println("Child Id: "+childid);
		//driver.switchTo().window(childid);
		
	
		
		WebElement emailText=driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
		emailText.sendKeys("nanda@gmail.com");
		//driver.close();//close the current window
		//driver.quit();//close all the windows
		
		

	}

}
