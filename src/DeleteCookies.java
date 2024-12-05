import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteCookie(null);
  driver.manage().getCookieNamed("SessionKey");
  driver.manage().deleteAllCookies();
	}

}
