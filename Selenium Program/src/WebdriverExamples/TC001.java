package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	driver.close();
	
	
	}
}