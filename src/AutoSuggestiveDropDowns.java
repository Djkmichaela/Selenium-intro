import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		 
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     
	     
	     driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
	     
	   Thread.sleep(3000);  
	  List<WebElement> options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // you cant get text of a list only when you iterate you can get per element
	
	 for(WebElement option :options) {
		 
		 if(option.getText().equalsIgnoreCase("india")) {
			 option.click();
			 break;
		 }
	 }
	
	}

}
