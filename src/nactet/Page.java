package nactet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	public Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	WebDriver driver;
	By resources = By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span");
	By technologies = By.xpath("//*[@id=\"list-item-50\"]/div/div[1]");
	By shopify = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span");
	By leadlist = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span");
	By technology = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div[1]/div/div[1]/button/span");
			
	
	
	
	
	
	public void click() throws InterruptedException
	{
		driver.findElement(resources).click();
		driver.findElement(technologies).click();
		Thread.sleep(3000);
		driver.findElement(shopify).click();
		driver.findElement(leadlist).click();
		Thread.sleep(3000);
		driver.findElement(technology).click();

}

	

}
