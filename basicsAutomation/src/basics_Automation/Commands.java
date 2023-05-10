package basics_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement enterMessage=driver.findElement(By.xpath("//label[text()='Enter Message']"));
		if(enterMessage.isDisplayed()) {					 //isDisplayed()
			System.out.println("Enter Message is displayed");
		}
		else {
			System.out.println("Enter message is not displayed");
		}
		if(enterMessage.isEnabled()) {	 	 	             //isEnabled()
			System.out.println("Enter Message is Enabled");
		}
		else {
			System.out.println("Enter message is not Enabled");
		}
		System.out.println("Tag Name:"+enterMessage.getTagName());	             //getTagName
		System.out.println("Attribute Name:"+enterMessage.getAttribute("for"));	 //getAttribute
		System.out.println("Location: "+enterMessage.getLocation());	         //getLocation
		System.out.println("Get Text: "+enterMessage.getText());                                  //getText()
		System.out.println("Get cssValue: "+enterMessage.getCssValue("color")); 	                   //getCssValue()
		
		//driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckBoxClick=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		singleCheckBoxClick.click();
		
		if(singleCheckBoxClick.isSelected()) {
			System.out.println("Check Box is clicked");
		}
		else {
			System.out.println("Check Box is not clicked");
		}
		
		WebElement multipleCheckClick =driver.findElement(By.xpath("//input[@id='button-two']"));
		multipleCheckClick.click();	              //click()
		//multipleCheckClick.submit();//	   //submit()
		System.out.println("Submitted");
		//multipleCheckClick.clear();	      //clear()
		//System.out.println("cleared");
		
		List <WebElement> headers=driver.findElements(By.xpath("//div[@class='card-header']"));
		System.out.println(headers.size());	                            //size()
		
		
	

	}

}
