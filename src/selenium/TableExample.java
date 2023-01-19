package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "D:\\selenium training\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> coulmns=driver.findElements(By.tagName("th"));
		int coulmnscount=coulmns.size();
		System.out.println("Number of columns"+ coulmnscount);
				
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowsCount=rows.size();
		System.out.println("Number of rows"+ rowsCount);
		
		WebElement getpercent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));

		String percent=getpercent.getText();
		System.out.println("Percentage is "+percent);
		
		List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList=new ArrayList<Integer>();
		
		for (WebElement webelement  : allProgress) {
		String individualvalue=webelement.getText().replace("%", "");
		numberList.add(Integer.parseInt(individualvalue));
		
		}
		
		System.out.println("Final List"+ numberList);
		
		int smallValue=Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallValueString=Integer.toString(smallValue)+"%";
		
		String finalXpath="//td[normalize-space()="+"\""+smallValueString + "\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
		
	}

}
