package com.java.RahulShetti;


import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class DropdownRahul {
	
	public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

	driver.findElement(By.id("divpaxinfo")).click();

	   Thread.sleep(2000L);

	   int i=1;

	while(i<5)

	{

	driver.findElement(By.id("hrefIncAdt")).click();

	i++;
	}
	

	 
	driver.findElement(By.id("btnclosepaxoption")).click();

	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	}
}
