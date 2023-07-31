package nactet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPage {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com/");
		
	}
	@Test
	public void testup() throws InterruptedException
	{
		Page ob=new Page(driver);
		ob.click();
		Thread.sleep(3500);
		
		
	}

}
