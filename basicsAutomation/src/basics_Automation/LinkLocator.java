package basics_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		//Capturing all links and finding number of link:
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of Link elemennts:"+ links.size());
		System.out.println("Links: ");
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println("HREF: "+link.getAttribute("href"));
		}
		
		
		/*//Locator LinkText
		WebElement simpleFormLink = driver.findElement(By.linkText("Simple Form Demo"));
		simpleFormLink.click();
		System.out.println("clicked");
		
		WebElement checkBoxLink = driver.findElement(By.linkText("Checkbox Demo"));
		checkBoxLink.click();
		
		//locator partialLinkText
		WebElement radioButtonLink = driver.findElement(By.partialLinkText("Radio"));
		radioButtonLink.click();
		
		WebElement selectInputLink=driver.findElement(By.linkText("Select Input"));
		selectInputLink.click();
		
		
		
		
		//locator name
	/*	WebElement textBox = driver.findElement(By.name("firstName"));
		textBox.sendKeys("Nanda S");
		
		driver.navigate().back();
		
		//locator CSS Selector
		//tagName.className
		//WebElement messageText = driver.findElement(By.cssSelector("input.form-control"));
		//messageText.sendKeys("css Class");
		*/

	}

}
