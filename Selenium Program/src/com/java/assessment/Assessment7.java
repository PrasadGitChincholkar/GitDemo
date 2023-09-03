package com.java.assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment7 {

	public static void main(String a[])
	
	{
		
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

	driver.manage().window().maximize();

	JavascriptExecutor obj = (JavascriptExecutor) driver;

	obj.executeScript("window.scrollBy(0,500)");

	// Print number of rows in a table

	System.out.println("Number of rows :"+driver.findElements(By.xpath("//table[@class='table-display']//tr")).size());

	// Print number of columns in a table

	System.out.println("Number of columns :"+driver.findElements(By.xpath("//table[@class='table-display']//tr//th")).size());

	// Print the values present in 2nd row

	List<WebElement> text =  driver.findElements(By.xpath("//table[@class='table-display']//tr[3]//td"));

	System.out.println(text.get(0).getText());

	System.out.println(text.get(1).getText());

	System.out.println(text.get(2).getText());
	
	
	
	
}
}