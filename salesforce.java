import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='sign in]")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("122345");
        driver.findElement(By.xpath("//input[contains(@name,'procee)]")).click();
        
	}

}