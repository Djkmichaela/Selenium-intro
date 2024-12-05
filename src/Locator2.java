import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		 String password = getPassword(driver);
	     driver.get("https://rahulshettyacademy.com/locatorspractice/");
	     
	     System.out.println("Title is: " + driver.getTitle());
	     
	   System.out.println(driver.getCurrentUrl());
	 
	   String name ="micheal";
	   driver.findElement(By.id("inputUsername")).sendKeys(name);
	   driver.findElement(By.name("inputPassword")).sendKeys(password);
	   
	   Thread.sleep(1000);
	   driver.findElement(By.id("chkboxOne")).click();
	   driver.findElement(By.cssSelector("button[class*='submit']")).click();
	      
	   Thread.sleep(1000);
	     System.out.println( driver.findElement(By.tagName("p")).getText());
	     Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	     System.out.println(driver.findElement(By.tagName("h2")).getText());
	     Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
	     
	     driver.findElement(By.xpath("//button[text()='Log Out']")).click();
     driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArr = passwordtext.split("'");
		String password = passwordArr[1];
		String[] passwordA = password.split("'");
		String passord = passwordA[0];
		
		return passord;
	}

}
