import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //chromedriver.exe
System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe");
 WebDriver driver =new ChromeDriver();
 driver.get("https://login.salesforce.com/");
 driver.findElement(By.id("username")).sendKeys("Hello");
 driver.findElement(By.name("pw")).sendKeys("123456");
 //driver.findElement(By.className("button r4 wide primary")).click();
 driver.findElement(By.xpath("//*[@id='Login']")).click();
 System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	
	
	
	
	}

}
