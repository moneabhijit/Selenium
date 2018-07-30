import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code-
		
				//create Driver object for chrome Browser\
				
				//We will strictly implement methods of webdriver
				
				/*  class name= ChromeDriver,
				 X driver=new X();	   */
				System.setProperty("webdriver.ie.driver", ("C:\\Users\\Abhijit\\Downloads"));
				WebDriver driver=new InternetExplorerDriver();
				driver.get("https://www.seleniumhq.org");
				System.out.println(driver.getTitle());
		         
			}

		

	}


