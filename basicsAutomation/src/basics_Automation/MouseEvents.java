package basics_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Action Class
		Actions act=new Actions(driver);//driver is passed as parameter
		//contextClick()
		act.contextClick(rightClick).perform(); //build will create the task and perform will execute
		
		//doubleClick()
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		WebElement doubleClickb=driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));
		act.doubleClick(doubleClickb).perform();
		
		//Drag and Drop
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden=driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(stockholm, sweden).perform();
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(rome, italy).perform();
		
		//Mouse hover
		driver.navigate().to("https://demo.opencart.com/");
		WebElement componentClick=driver.findElement(By.xpath("//a[text()='Components']"));
		WebElement monitorClick=driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
		act.moveToElement(componentClick).moveToElement(monitorClick).click().perform();
		

	}

}
