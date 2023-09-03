package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Mouseover {
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(300);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(300);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(300);
//mouseover to Leave
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("Leave"))).perform();
System.out.println("mouseover completed");
Thread.sleep(3000);
driver.findElement(By.linkText("LEAVE LIST")).click();
System.out.println("Clicked on Submenu");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
Thread.sleep(3000);
driver.close();
}
}