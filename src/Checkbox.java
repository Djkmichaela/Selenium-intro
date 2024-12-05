import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
       Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);

	}

}
