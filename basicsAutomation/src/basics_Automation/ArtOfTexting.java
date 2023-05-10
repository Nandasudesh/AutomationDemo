package basics_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArtOfTexting {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium#");
		
		WebElement artOfTexting=driver.findElement(By.xpath("//*[@title='ArtOfTesting' and @alt='ArtOfTesting']"));
		System.out.println(artOfTexting.getText());
		
		WebElement thislink=driver.findElement(By.linkText("This is a link"));
		thislink.click();
		
		WebElement textBox=driver.findElement(By.xpath("//*[@id='fname']"));
		textBox.sendKeys("Nanda S");
		
		WebElement submitButton=driver.findElement(By.cssSelector("button#idOfButton"));
		submitButton.click();
		
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='female']"));
		radioButton.click();
		
		WebElement checkBox1=driver.findElement(By.xpath("//input[@value='Automation']"));
		checkBox1.click();
		WebElement checkBox2=driver.findElement(By.xpath("//input[@value='Performance']"));
		checkBox2.click();
		
		WebElement dropDown=driver.findElement(By.id("testingDropdown"));
		Select selectObj=new Select(dropDown);
		selectObj.selectByValue("Manual");
		
		System.out.println("Drop down Options: ");
		List <WebElement> allOptions= selectObj.getOptions();
		for(int i=0; i<allOptions.size();i++) {
			String printOption=allOptions.get(i).getText();
			System.out.println(printOption);
		}
		
		//Select option without select class object
		
		for(WebElement option:allOptions) {
			if (option.getText().equals("Manual Testing")){
				option.click();
			}
		}
		
		WebElement alertBox=driver.findElement(By.xpath("//*[text()='Generate Alert Box']"));
		alertBox.click();
		driver.switchTo().alert().accept();
		WebElement confirmBox=driver.findElement(By.xpath("//*[text()='Generate Confirm Box']"));
		confirmBox.click();
		driver.switchTo().alert().dismiss();
		WebElement confirmText=driver.findElement(By.xpath("//*[@id='demo']"));
		System.out.println(confirmText.getText());
	
		
		//WebElement seleniumScript=driver.findElement(By.linkText("Selenium Sample Script"));
		//seleniumScript.click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
