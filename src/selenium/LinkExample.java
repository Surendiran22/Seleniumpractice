package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.findElement(By.partialLinkText("Dashboard") ).click();
		
		
	}

}
