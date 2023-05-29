package basics_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDownStatic=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectObj =new Select(dropDownStatic);//create object of select
		selectObj.selectByIndex(1); 	 //select by index(1,2,3,)
		selectObj.selectByValue("Red");	 //select by value of the webelement
		selectObj.selectByVisibleText("Green");	 //In black text visible
		
		WebElement firstOption=selectObj.getFirstSelectedOption(); //current selected element
		System.out.println(firstOption.getText());
		
		WebElement red=driver.findElement(By.xpath("(//option[@value='Red'])[2]"));
		red.click();
		WebElement green=driver.findElement(By.xpath("(//option[@value='Green'])[2]"));
		green.click();
		
		List <WebElement> allOptions= selectObj.getOptions();
		//to print all in the list
		for(int i=1;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}
		
		//
		/*for(int i=1;i<allOptions.size();i++) {
			String optionText=allOptions.get(i).getText();
			System.out.println(optionText);
		}
		 * 
		 * driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		 */
		/*WebElement drop=driver.findElement(By.id("select2-nnb9-container"));
		Select selectobj1=new Select(drop);
		List<WebElement> alloptions1=selectobj1.getOptions();
		for(WebElement option:alloptions1)
		{
			if(option.getText().equalsIgnoreCase("Washington")) {
				option.click();
			}
		}
			*/
		//WebElement hawaii=driver.findElement(By.xpath("//li[@id='select2-qzm3-result-4rza-HI']"));
		//hawaii.click();
		
		
		
		//selectObj.deselectByIndex(2);	 //for multi select
		//selectObj.deselectByValue("Yellow");	  //for multi select*/
		
		

	}

}
