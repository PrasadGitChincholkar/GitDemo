package WebdriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_Windhand {
public static void main(String args[]) throws Exception{
    //Test Steps
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//1st wind
driver.get("file:///D://multiplewindows.html");
Thread.sleep(40);
//2nd wind
driver.findElement(By.id("btn2")).click();
Thread.sleep(40);
//3rd wind
driver.findElement(By.id("btn3")).click();
Thread.sleep(40);
ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(windinfo.get(0));
Thread.sleep(40);
//driver.close();
driver.quit();
}
}