
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Calendar {
    //lesson 99
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "17";
		String month = "12";
		String year = "2024";
		
		System.setProperty("webdriver.chrome.driver", "/Users/michaeldjamba/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button.react-date-picker__button")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		
	System.out.println(	driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input[1]")).getAttribute("value"));
	 
	String date = driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input[1]")).getAttribute("value");
		String[] dateArray = date.split("-");
		String  yearNew = dateArray[0];
		String  monthNew = dateArray[1];
		String  dayNew = dateArray[2];
		
		Assert.assertEquals(monthNew, month);
		Assert.assertEquals(dayNew, day);
		Assert.assertEquals(yearNew, year);
		//driver.findElement(By.xpath("//*[text()='January']")).click();

	}

}
