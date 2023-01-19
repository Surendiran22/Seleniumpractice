package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExtendedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
		
		
		WebElement homePagelink=driver.findElement(By.linkText("Go to Home Page"));
		homePagelink.click();
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find where"));
		String where=whereToGo.getAttribute("href");
		System.out.println("This link is going to"+ where);
		
		WebElement brokenLink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title=driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("This link is broken");
		}
		driver.navigate().back();
		
		WebElement homePagelink1=driver.findElement(By.linkText("Go to Home Page"));
		homePagelink1.click();
		driver.navigate().back();
		
		List<WebElement> totalLink= driver.findElements(By.tagName("a"));
		int linkCount= totalLink.size();
		System.out.println("Total links"+ linkCount);
		
		
		
		
	}

}
