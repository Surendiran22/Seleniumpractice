package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
        WebElement emailBox=driver.findElement(By.id("j_idt88:j_idt99"));
        emailBox.sendKeys("test@gmail.com");

        WebElement appendBox=		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
        appendBox.sendKeys("chidambaram");

        WebElement  getTextBox=driver.findElement(By.name("j_idt88:j_idt97"));
        String value=  getTextBox.getAttribute("value");

		System.out.println(value);
		
		WebElement clearBox=	driver.findElement(By.name("j_idt88:j_idt95"));
	    clearBox.clear();
	    
	    WebElement disabledBox= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']"));
	    boolean enabled=   disabledBox.isEnabled();	    
	    System.out.println(enabled);
	}
	

}
