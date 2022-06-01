package com.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		Username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		password.sendKeys("admin123");

		WebElement ClickLogin = driver.findElement(By.xpath("//*[@id='btnLogin']"));

		ClickLogin.click();

	}

}
