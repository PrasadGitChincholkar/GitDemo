package com.java.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Assessment6 {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		checkAlertBox(driver);
	}

	public static void checkAlertBox(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> labels = driver.findElements(By.xpath("//*[@id='checkbox-example']/fieldset/label"));
		int min = 1;
		int max = labels.size();
		int randomIndex = (int) Math.floor(Math.random() * (max - min + 1) + min);
		labels.get(randomIndex - 1).findElement(By.xpath("//*[@type='checkbox']")).click();
		String input = labels.get(randomIndex - 1).getText();
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(input);
		driver.findElement(By.id("name")).sendKeys(input);
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		Assert.assertTrue(driver.switchTo().alert().getText().contains(input));
	}
}