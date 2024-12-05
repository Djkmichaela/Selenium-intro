import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		// get the amount of links on the entire page

		System.out.println(driver.findElements(By.cssSelector("a")).size());

		WebElement footer = driver.findElement(By.xpath("//*[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.cssSelector("a")).size());

		WebElement columnFooter = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(columnFooter.findElements(By.cssSelector("a")).size());

		for (int i = 1; i < columnFooter.findElements(By.cssSelector("a")).size(); i++) {

			String clickonlinks = Keys.chord(Keys.COMMAND, Keys.ENTER);

			columnFooter.findElements(By.cssSelector("a")).get(i).sendKeys(clickonlinks);

		}

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		Thread.sleep(5000);
		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
