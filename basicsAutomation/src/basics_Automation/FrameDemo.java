package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		//iframe=inline frame
		//1. driver.switchto.frame(index)
		
		Thread.sleep(1000);
		
		//2. driver.switchto.frame("id/name")
		//driver.switchTo().frame("iframeResult");
		
		//3. driver.swicthto.frame(webelement)
		/*WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		WebElement tryIt=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		tryIt.click();
		driver.switchTo().alert().accept();*/
		
		//Frame in Frame or Multiple Frame
		
		//Parent Frame
		driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");
		WebElement text=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
		System.out.println("1st Frame: "+text.getText());
		
		//Child Frame
		WebElement frame2=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame2);
		WebElement frame2Text=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		System.out.println("2nd Frame: "+frame2Text.getText());
		
		//Come out of the current frame
		driver.switchTo().parentFrame();
		System.out.println("1st Frame: "+text.getText());
		
		//To come out of all frames
		driver.switchTo().defaultContent(); 
		WebElement size=driver.findElement(By.xpath("//span[@id='framesize']"));
		System.out.println(size.getText());
	
		
		
		
		

	}

}
