import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

        
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("/Users/michaeldjamba/Downloads/ScreenShot.png"));
	}

}
