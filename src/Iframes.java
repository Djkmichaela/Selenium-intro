import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		//Lesson 91
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
//WebDriverWait w = new WebDriverWait(driver,5);
		
	driver.get("https://jqueryui.com/droppable/");	
	
	Actions a = new Actions(driver);
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe.demo-frame")));
	
	Thread.sleep(5000);
	//System.out.println(driver.findElements(By.cssSelector("iframe[class='demo-frame']")).size());
	driver.switchTo().frame(0);
	
	//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	
	WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
	
	a.dragAndDrop(source, target).build().perform();
	
	driver.switchTo().defaultContent(); // this statement takes you back to the original html outside of the frame

	}

}
