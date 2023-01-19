package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement uploadButton=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89_input\']"));
		uploadButton.click();
		
		String file="D:\\selenium training\\upfile\\test.png";
		StringSelection selection =new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
