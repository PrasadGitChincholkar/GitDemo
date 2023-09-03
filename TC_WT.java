package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_WT {
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///C:\\Users\\Admin\\Downloads/WebTable.html");
//Count
int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

System.out.println("rowcount "+ row);
System.out.println("colcount "+ col);
System.out.println("row_colcount "+ row_col);
//Data--cell
String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
System.out.println(celldata);
//Data--table
//  DT var vv
for(int i= 1; i<=row;i++) {
String data = driver.
findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
System.out.println(data);
Thread.sleep(4000);
}
driver.close();
}
}