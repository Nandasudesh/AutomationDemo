package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButton {

	public static void main(String[] args) {
		
			System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
			
			WebElement singleCheckBox=driver.findElement(By.xpath("//label[@class='form-check-label' and @for='gridCheck']"));
			singleCheckBox.click();
			
			WebElement message=driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
			String text=message.getText();
			System.out.println(text);
			//System.out.println(message.getText());
			
			/*WebElement checkBoxOne=driver.findElement(By.xpath("//label[@for='check-box-one']"));
			checkBoxOne.click();
			WebElement checkBoxFour=driver.findElement(By.xpath("//label[@for='check-box-four']"));
			checkBoxFour.click();*/
			
			WebElement selectAll=driver.findElement(By.xpath("//input[@id='button-two']"));
			selectAll.click();
			selectAll.click(); //Unselect
			
			driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
			WebElement male=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
			male.click();
			WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
			showButton.click();
			WebElement genderF=driver.findElement(By.xpath("//input[@name='student-gender' and @value='Female']"));
			genderF.click();
			WebElement age2=driver.findElement(By.xpath("//input[@value='19 to 44']"));
			age2.click();
			WebElement getResultButton=driver.findElement(By.xpath("//button[@id='button-two']"));
			getResultButton.click();
			
			
	}

}
