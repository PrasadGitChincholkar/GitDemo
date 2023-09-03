package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Frames {
public static void main(String args[]) throws Exception{
    // Test Steps
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(5000);
//Enter into frame
driver.switchTo().frame("rightMenu");
//Click on Add btn
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(3000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3000);
System.out.println("new emp added");
//Exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();
}
}