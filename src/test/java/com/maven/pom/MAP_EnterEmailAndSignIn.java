package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAP_EnterEmailAndSignIn {
static WebDriver driver;
	
	@FindBy(name="email_create")
	private WebElement emailField;
	
	@FindBy(name="SubmitCreate")
	private WebElement submitEmailButton;
	
	@FindBy(xpath="//div[@id='create_account_error']/ol/li")
	private WebElement errorMessage;
	
	@FindBy(id="email")
	private WebElement emailfield2;
	
	@FindBy(id="passwd")
	private WebElement passwordField;
	
	@FindBy(xpath="//div[@class='alert alert-danger']/ol/li")
	private WebElement loginError;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitLogin;
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getEmailfield2() {
		return emailfield2;
	}

	public WebElement getSubmitLogin() {
		return submitLogin;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginError() {
		return loginError;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getSubmitEmailButton() {
		return submitEmailButton;
	}

	public MAP_EnterEmailAndSignIn(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
	
	}

}
