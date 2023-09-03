package com.java.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssessment {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		   driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println(  driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
	        driver.navigate().refresh();
	        System.out.println(  driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
	        
		System.out.println(	driver.findElement(By.xpath("//div[@id='checkbox-example']")).isSelected());
	 
	    
	    
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	    
	    
	}
	
}
