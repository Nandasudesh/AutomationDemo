package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		//alert Box
		WebElement alertBox=driver.findElement(By.xpath("//button[@name='alertbox']"));
		alertBox.click();
		driver.switchTo().alert().accept();
		
		//confirm Box
		WebElement confirmBox=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		confirmBox.click();
		driver.switchTo().alert().accept();
		WebElement confirmText=driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(confirmText.getText());
		
		//Prompt Box
		WebElement promptBox=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		WebElement promptText=driver.findElement(By.xpath("//p[@id='demoone']"));
		System.out.println(promptText.getText());
		
		
	/*	driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		WebElement alert3=driver.findElement(By.xpath("//*[@id=\"promptBox\"]"));
		alert3.click();
		//driver.switchTo().alert().sendKeys("Yes");
		//driver.switchTo().alert().accept();*/
		
		
	
	}

}
