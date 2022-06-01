package com.batch24.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home24Page {
	WebDriver driver;

	public Home24Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
	private WebElement Username;

	@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='btnLogin']")

	private WebElement Login_button;

	@FindBy(how = How.ID, using = "welcome")

	private WebElement welcomeTxt;

	public WebElement getWelcomeTxt() {
		return welcomeTxt;
	}

	public void setWelcomeTxt(WebElement welcomeTxt) {
		this.welcomeTxt = welcomeTxt;
	}

	public WebElement getLogin_button() {
		return Login_button;
	}

	public void setLogin_button(WebElement login_button) {
		Login_button = login_button;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

}
