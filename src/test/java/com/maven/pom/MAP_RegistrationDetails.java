package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAP_RegistrationDetails {

	static WebDriver driver;
	
	@FindBy(id="id_gender1")
	private WebElement genderMr;
	
	@FindBy(id="id_gender2")
	private WebElement genderMrs;
	
	@FindBy(id="customer_firstname")
	private WebElement firstName;
	
	@FindBy(id="customer_lastname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;

	@FindBy(id="days")
	private WebElement daysInDOB;

	@FindBy(id="months")
	private WebElement monthInDOB;

	@FindBy(id="years")
	private WebElement yearInDOB;

	@FindBy(id="newsletter")
	private WebElement subscribeNewsletter;

	@FindBy(id="optin")
	private WebElement subscribeOthers;

	@FindBy(id="address1")
	private WebElement address1Field;

	@FindBy(id="city")
	private WebElement cityField;

	@FindBy(id="id_state")
	private WebElement stateField;

	@FindBy(id="postcode")
	private WebElement postcodeField;

	@FindBy(id="phone_mobile")
	private WebElement mobileNoField;

	@FindBy(id="alias")
	private WebElement aliasField;

	@FindBy(xpath="//button[@id='submitAccount']/span")
	private WebElement submitButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement errorMessaeRegistrationPage;

	public WebElement getErrorMessaeRegistrationPage() {
		return errorMessaeRegistrationPage;
	}

	public WebElement getGenderMr() {
		return genderMr;
	}

	public WebElement getGenderMrs() {
		return genderMrs;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDaysInDOB() {
		return daysInDOB;
	}

	public WebElement getMonthInDOB() {
		return monthInDOB;
	}

	public WebElement getYearInDOB() {
		return yearInDOB;
	}

	public WebElement getSubscribeNewsletter() {
		return subscribeNewsletter;
	}

	public WebElement getSubscribeOthers() {
		return subscribeOthers;
	}

	public WebElement getAddress1Field() {
		return address1Field;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public WebElement getStateField() {
		return stateField;
	}

	public WebElement getPostcodeField() {
		return postcodeField;
	}

	public WebElement getMobileNoField() {
		return mobileNoField;
	}

	public WebElement getAliasField() {
		return aliasField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public MAP_RegistrationDetails(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
	}
}
