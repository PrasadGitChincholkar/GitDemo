package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[]) throws Exception{
    //Test Steps
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
//Enter into frame
driver.switchTo().frame("rightMenu");

Select st = new Select(driver.findElement(By.name("loc_code")));

//st.selectByVisibleText("Emp. ID");
//st.selectByIndex(0);
st.selectByValue("0");
Thread.sleep(300);
driver.findElement(By.name("loc_name")).sendKeys("0404");
Thread.sleep(300);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(300);
driver.findElement(By.name("chkLocID[]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(300);
//Exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(300);
System.out.println("Logout completed");
driver.close();
}
}