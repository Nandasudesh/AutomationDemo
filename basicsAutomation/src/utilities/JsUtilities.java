package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsUtilities {

	
		public static void drawBorder(WebElement element, WebDriver driver) {//passing element and driver
			// Executing java script with selenium web driver
			
			JavascriptExecutor js=(JavascriptExecutor)driver; //type casting
			js.executeScript("arguments[0].style.border='3px solid red'",element);//element=webelement
		}
		
		
		public static void getTitle(WebDriver driver) {
			JavascriptExecutor js=(JavascriptExecutor)driver; //Create Object for JavaScriptExecutor by typecasting driver instance.
			String title=js.executeScript("return document.title").toString();
			System.out.println(title);
		}
		
		public static void scrollDown(WebDriver driver) {
			JavascriptExecutor js=(JavascriptExecutor)driver; 
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		public static void scrollUp(WebDriver driver) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			
		}
		
		public static void zoom(WebDriver driver){
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.body.style.zoom='50%'");
		
		}

	}


