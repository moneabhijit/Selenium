import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "J:\\Driver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
      driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
      driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/form[1]/input[1]")).click();
      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();//Accept = ok done yes
     
	}

}
