import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class childwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?src=ym&lang=en-US&intl=us&done=https%3A%2F%2Fmail.yahoo.com%2Fd&specId=yidReg");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/form[1]/p[1]/a[1]")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();	
	    String parent=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(parent);
        System.out.println("Switching Back to Parent");
        System.out.println(driver.getTitle());
        
        
	}

}
