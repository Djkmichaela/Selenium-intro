import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForLoopsSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		WebDriverWait w = new WebDriverWait(driver, 5);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] veggies = { "Brocolli", "Cucumber", "Tomato", "Beans", "Apple" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItemsToCart(driver, veggies);

		driver.findElement(By.cssSelector("a[class='cart-icon'] img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
        
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();

		// driver.findElement(By.cssSelector("span[class='promoInfo']")).getText()
		// Thread.sleep(5000);

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		Assert.assertEquals(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText(),
				"Code applied ..!");

	}

	public static void addItemsToCart(WebDriver driver, String[] veg) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

		List<String> list = Arrays.asList(veg);

		int j = 0;
		// List can use the contains method
		for (int i = 0; i < products.size(); i++) {

			String[] product = products.get(i).getText().split("-");
			String readyProduct = product[0].trim();

			if (list.contains(readyProduct)) {// this line looks at the whole list at once and compairs it with the
												// items List elements which are being iterated
				j++;

				System.out.println(readyProduct);
				System.out.println(products.get(i).getText());
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();

				if (j == products.size()) {
					break;
				}
			}
		}
		// driver.quit();
	}

}
