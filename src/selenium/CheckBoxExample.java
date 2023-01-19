package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement java=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]/span"));
	
	    java.click();
	    
	    WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/div/div[2]/span"));
	    boolean selectedButton= button.isSelected();
	    System.out.println(selectedButton);
	    
	    WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div[2]/span"));
	    if (element.isSelected()) {
			element.click();
		}
	    else {
			element.click();
		}
	    
	    
	    
	    
	    
	    
	    
	}

}
