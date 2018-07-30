import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
        /*driver.findElement(By.xpath("//*[@type='email']")).sendKeys("xpath");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own css");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}
