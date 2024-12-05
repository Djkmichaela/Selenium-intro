import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DateSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//lets block popups
		//ChromeOptions options = new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'][1]")).click();

		System.out.println(
				driver.findElement(By.cssSelector(".r-18u37iz.r-117bsoe.r-1otgn73 svg :nth-child(2)")).isSelected());
		// driver.findElement(By.cssSelector(".r-18u37iz.r-117bsoe.r-1otgn73 svg
		// :nth-child(2)")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
		// System.out.println( driver.findElement(By.xpath("(//div[@class='css-1dbjc4n
		// r-zso239'])[2]")).isSelected());

		// driver.switchTo().alert().dismiss();

		Thread.sleep(3000);
		List<WebElement> dates = driver
				.findElements(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-1pi2tsx.r-1777fci.r-13qz1uu"));
		int dat = 0;
		for (WebElement date : dates) {

			if (date.getText().equalsIgnoreCase("23")) {
				dat = Integer.parseInt(date.getText());
				date.click();
				System.out.println(dat);
				break;

			}
		}
		Thread.sleep(3000);
		// System.out.println( driver.switchTo().alert().getText());
		// driver.switchTo().alert().dismiss();

	}

}
