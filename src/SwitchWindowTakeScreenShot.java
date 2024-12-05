import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SwitchWindowTakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stu

		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		// driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.google.com/");

		Set<String> it = driver.getWindowHandles();
		Iterator<String> is = it.iterator();
		String parentWindow = is.next();
		String childWindow = is.next();

		driver.switchTo().window(childWindow);

		System.out.println(driver.findElement(By.cssSelector("div#SIvCob")).getText());
		String text = driver.findElement(By.cssSelector("div#SIvCob")).getText();
		driver.switchTo().window(parentWindow);

		WebElement inputt = driver.findElement(By.cssSelector("[name='name']"));
		inputt.sendKeys(text);

		// get screenshot of the input element

		File file = inputt.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("/Users/michaeldjamba/Downloads/ElementPic.png"));

		// get the height and width of the input element

		System.out.println(inputt.getRect().getDimension().getHeight());
		System.out.println(inputt.getRect().getDimension().getWidth());

	}

}
