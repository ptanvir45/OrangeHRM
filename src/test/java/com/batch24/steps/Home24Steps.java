package com.batch24.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.batch24.pages.Home24Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home24Steps {
	WebDriver driver;
	Home24Page obj;

	@Given("^user go to Orange HRM home page from batch (\\d+)$")
	public void user_go_to_Orange_HRM_home_page_from_batch(int arg1) throws Throwable {

		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);///---->
		// Implicit wait
		driver.manage().window().maximize();
		obj = new Home24Page(driver);

	}

	@When("^user type the username$")
	public void user_type_the_username() throws Throwable {
		// WebElement Username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		obj.getUsername().sendKeys("Admin");

	}

	@When("^user also type password$")
	public void user_also_type_password() throws Throwable {
		// WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		obj.getPassword().sendKeys("admin123");
	}

	@Then("^user click on the Login button$")
	public void user_click_on_the_Login_button() throws Throwable {
		// WebElement ClickLogin = driver.findElement(By.xpath("//*[@id='btnLogin']"));

		obj.getLogin_button().click();

	}

	@Then("^user verify the welcome screen$")
	public void user_verify_the_welcome_screen() throws Throwable {
		String expected = "Welcome";
		// String actual = driver.findElement(By.id("welcome")).getText();
		String actual = obj.getWelcomeTxt().getText();
		Assert.assertTrue("Welcome message is not found", actual.contains(expected));
	}

}
