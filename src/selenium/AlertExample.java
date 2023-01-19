package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alertBox=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
		alertBox.click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmButton=driver.findElement(By.xpath("html body.main-body.ui-input-filled div.layout-wrapper.layout-wrapper-slim-sidebar.slim div.layout-main div.layout-main-content form#j_idt88 div.grid.overlay-demo div.col-12.lg:col-6 div.card button#j_idt88:j_idt93.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-icon-left.ui-button-warning span.ui-button-text.ui-c"));
		confirmButton.click();
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement promptBox=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		promptBox.click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("sd");
		promptAlert.accept();
		
		
		
	}

}
