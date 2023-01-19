package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/tooltip/#Forms%20Based");
		
	    WebElement name=driver.findElement(By.id("firstname"));
		
	    String toolTipText= name.getAttribute("title");
		System.out.println(toolTipText);
		
	}

}
