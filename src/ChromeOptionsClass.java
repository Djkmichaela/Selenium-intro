import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
       // options.setAcceptInsecureCerts(true);
		 
		
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		
		
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://expired.badssl.com/");
	}

}
