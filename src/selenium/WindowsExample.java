package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldWindow=driver.getWindowHandle();
		
		WebElement openButton=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		openButton.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[3]/a"));
		element.click();
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span"));
		openMultiple.click();
		
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println("NO OF WINDOWS OPENDED:"+numberOfWindows);
		
		WebElement dontCloseMe=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		dontCloseMe.click();
		
		Set<String> newWindowsHandles=driver.getWindowHandles();
		
		for (String allWindows : newWindowsHandles) {
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
		driver.quit();
		
	}

}
