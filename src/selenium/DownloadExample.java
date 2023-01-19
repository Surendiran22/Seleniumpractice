package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/file.xhtml");
	
		
		WebElement downloadLink=driver.findElement(By.linkText("Download"));
		
		downloadLink.click();
		
		Thread.sleep(3000);
		
		//Downloads
		
		File fileLocations=new File("Downloads");
		
		File[] totalFiles=	fileLocations.listFiles();
		
		for (File file : totalFiles) {
		if(	file.getName().equals("TestLeaf Logo")) {
			System.out.println("File is downloaded");
			break;
		}
		}
			
		}
		
		
	}


