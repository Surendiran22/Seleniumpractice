package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		WebElement unchecked=driver.findElement(By.className("ui-radiobutton-icon ui-icon ui-c ui-icon-bullet"));
		
		WebElement checked=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]/span"));
		
	    boolean status1=	unchecked.isSelected();
		boolean status2= checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/span"));
		below20.click();
		
	}

}
