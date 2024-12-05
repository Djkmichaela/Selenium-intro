
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import java.net.MalformedURLException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APILinksAndSoftAlert {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		// SoftAssert a = new SoftAssert();
		int tellUs = 0;
		for (WebElement link : links) {

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();

			int respCode = conn.getResponseCode();

			System.out.println(respCode);

			if (respCode > 403) {

				tellUs = 1;
				System.out.println("The link with Text " + link.getText() + " is broken with code " + respCode);
			}

		}

		// a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken
		// with code" +respCode);
		Assert.assertEquals(0, tellUs);

	}

}
