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
		driver.get("http://www.facebook.com/");
		/*driver.findElement(By.className("inputtext")).sendKeys("This is my first code");
		/*driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		driver.findElement(By.cssSelector("#email")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("xyzasd");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
		
		


	}

	
		
	}
