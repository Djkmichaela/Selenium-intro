
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement drop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        
        Select dropdown = new Select(drop);
        
        dropdown.selectByIndex(1);
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByValue("AED");
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByVisibleText("USD");
       System.out.println(dropdown.getFirstSelectedOption().getText());
       
       
       
       driver.findElement(By.id("divpaxinfo")).click();
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       Thread.sleep(1000);
       
       for(int i=0; i<4;i++) {
       driver.findElement(By.id("hrefIncAdt")).click();
       }
       
       driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       
       // dynamic dropdown section
       
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      
       
       driver.findElement(By.xpath("//a[@value='MAA']")).click();
       Thread.sleep(1000L);
       //driver.findElement(By.xpath("(//a[@value='PBD'])[2]")).click();
       // below i will use the parent child option
       
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PBD']")).click();
       
       
       
       
	}

}
