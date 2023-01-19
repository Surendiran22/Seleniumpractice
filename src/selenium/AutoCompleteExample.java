package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		
		WebElement input=driver.findElement(By.className("custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input"));
		input.sendKeys("s");
		Thread.sleep(4000);
		List<WebElement> optionsList= driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		System.out.println(optionsList.size());
		
		for (WebElement list : optionsList) {
		 if(	list.getText().equals("Scala")) {
			 list.click();
			 System.out.println("if part");
			 System.out.println("selecting"+list.getText());
			 
		 }else {
			 System.out.println("else part");
		 }
		}
		
		
		
	}

}
