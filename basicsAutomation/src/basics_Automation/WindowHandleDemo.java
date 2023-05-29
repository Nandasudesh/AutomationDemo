package basics_Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		
		//Id of parent window
		String parentWindowId=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentWindowId);
		WebElement clickButton=driver.findElement(By.xpath("//button[@class='btn btn-info' and text()='    click   ']"));
		clickButton.click();
		
		//Getting the title of windows
		Set<String> WindowIds=driver.getWindowHandles();//return set of string
		List<String> ChildWindows=new ArrayList(WindowIds);//converting set to list
		System.out.println("Window title: ");
		for(String i:ChildWindows) {
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(i+":"+title);
		}
		
		
		//Printing display in child window
		WebElement displayText=driver.findElement(By.xpath("//h1[@class='display-1']"));
		System.out.println("Display text in child window: "+displayText.getText());
		
		driver.close();//close the current window...here child window will close first
		driver.quit();//close all the windows
		
	}

}
