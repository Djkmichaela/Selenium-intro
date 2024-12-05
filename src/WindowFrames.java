import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lesson 89
		// very good debug lesson
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentWindowID = it.next();
		String childWindowId = it.next();

		driver.switchTo().window(childWindowId);

		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());

		String email = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim()
				.split(" ")[0];

		// System.out.println( driver.findElement(By.xpath("//p[@class='im-para
		// red']/strong/a")).getText());
		// String email = driver.findElement(By.xpath("//p[@class='im-para
		// red']/strong/a")).getText();
		driver.switchTo().window(parentWindowID);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);

	}

}
