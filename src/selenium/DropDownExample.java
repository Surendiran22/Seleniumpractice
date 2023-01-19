package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement dropDown1= driver.findElement(By.className("ui-selectonemenu"));
		Select select= new Select(dropDown1);
		select.selectByIndex(3);
		
		//select.selectByValue("2");
		
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listOfOptions = select.getOptions();
	    int size=	listOfOptions.size();
		System.out.println("Number Of Elements: "+ size);
		

		dropDown1.sendKeys("Cypress");
		
		WebElement multiSelect=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/ul"));
		Select multiSelectBox=new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		multiSelectBox.selectByIndex(5);
		multiSelectBox.selectByIndex(7);
		
		
	}

}
