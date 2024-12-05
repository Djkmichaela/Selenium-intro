import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver(options);
		Actions a = new Actions(driver);
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		//WebDriverWait w = new WebDriverWait(driver,5);
		
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		a.moveToElement(driver.findElement(By.cssSelector("span[class='icp-nav-link-inner']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();
		
	}

}
