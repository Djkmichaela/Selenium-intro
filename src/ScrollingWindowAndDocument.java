import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWindowAndDocument {
    //  lesson 101
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");  // this line scrolls the window
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); // this scrolls the document the elements in the window must use cssSelector

		 
	List<WebElement> skd =	driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int sum = 0;
	for(int i=0;i<skd.size();i++) {
		
	sum = sum + 	Integer.parseInt(skd.get(i).getText());
	}
	 
	System.out.println(sum);
	
	String total = driver.findElement(By.cssSelector(".totalAmount")).getText();
	 String[] finalTotal = total.split(":");
	  Assert.assertEquals(Integer.parseInt(finalTotal[1].trim()),sum);
	
	}

}
