import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static <X> void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code-
		
		//create Driver object for chrome Browser\
		
		//We will strictly implement methods of webdriver
		
		/*  class name= ChromeDriver,
		 X driver=new X();	   */
		System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")).sendKeys("Nicole Kidman");
		
		
		
		
		


	}

	
		
	}


