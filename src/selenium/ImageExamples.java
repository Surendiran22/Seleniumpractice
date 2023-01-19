package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		
		//WebElement firstImage=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img"));
		//firstImage.click();
		
		WebElement brokenImage=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
		
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		}else {
			System.out.println("The image is not broken");
		}
	
		
	}

}
