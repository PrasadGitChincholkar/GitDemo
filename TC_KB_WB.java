package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_KB_WB {
public static void main(String args[]) throws Exception{
    //Test Steps
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.google.com");
Thread.sleep(10);
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(10);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(10);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(10);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
driver.close();


}
}