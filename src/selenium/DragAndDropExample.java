package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement From=driver.findElement(By.id("form:drag_content"));
		WebElement To=driver.findElement(By.id("form:drop"));
		
        Actions actions=new Actions(driver);
        //actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
        actions.dragAndDrop(From, To).build().perform();
		
		
		
		
	}

}
