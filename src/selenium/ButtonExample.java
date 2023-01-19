package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/button.xhtml");
        //1.get the xy position		
	    WebElement getPositionButton=driver.findElement(By.id("j_idt88:j_idt94"));
	    
	    Point xypoint=getPositionButton.getLocation();
	    int xvalue=xypoint.getX();
	    int yvalue=xypoint.getY();
	    System.out.println("x value is:"+ xvalue+"y value is:"+ yvalue);
		
	    //2.find th color
	    WebElement colorButton=driver.findElement(By.id("j_idt88:j_idt96"));
	    String color= colorButton.getCssValue("background-color");
	    System.out.println("buttonn color is :"+color);
	    
	    //3.find the size
	    WebElement  sizeButton=driver.findElement(By.id("j_idt88:j_idt98"));
	    int height=  sizeButton.getSize().getHeight();
	    int width= sizeButton.getSize().getWidth();
	    System.out.println("Height is :"+height + "Width is :"+ width);
	    
	    //4.go to home
	    WebElement homeButton=driver.findElement(By.id("j_idt88:j_idt90"));
	    homeButton.click();
	}

}
