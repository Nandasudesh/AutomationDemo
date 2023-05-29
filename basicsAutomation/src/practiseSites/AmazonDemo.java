package practiseSites;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\nanda\\OneDrive\\Documents\\Nanda\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Laptop");
		WebElement searchIcon=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchIcon.click();
		//searchBox.sendKeys(Keys.ENTER);
		System.out.println("Searched Laptops");
		WebElement climateCheckBox=driver.findElement(By.className("a-icon-checkbox"));
		climateCheckBox.click();
		System.out.println("filtered climate pledge friendly");
		WebElement apple2023=driver.findElement(By.className("a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal"));
		apple2023.click();
	}

}
