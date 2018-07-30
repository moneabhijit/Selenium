import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sonyliv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.sonyliv.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.cssSelector("#userMobileEmail")).sendKeys("mone.abhijit@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

	}

}
