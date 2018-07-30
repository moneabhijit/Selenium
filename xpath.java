
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath 

{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		WebDriverWait d=new WebDriverWait(driver,20); 
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//article[@id='8354']//a[contains(@class,'flex-link')]")));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//article[@id='8354']//a[contains(@class,'flex-link')]")));
	    driver.findElement(By.xpath("//article[@id='8354']//a[contains(@class,'flex-link')]")).click();	
	    /*Thread.sleep(5000L);*/
	
	}

}
