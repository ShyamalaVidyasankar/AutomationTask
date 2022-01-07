package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAP_CartPage {
	static WebDriver driver;

	public WebElement getTotalPriceOfPurchase() {
		return totalPriceOfPurchase;
	}

	public WebElement getProceedToCheckoutFromCart() {
		return ProceedToCheckoutFromCart;
	}

	public WebElement getProcessAddButton() {
		return processAddButton;
	}

	public WebElement getTermsConditionsCheckbox() {
		return termsConditionsCheckbox;
	}

	public WebElement getProcessCarrierButton() {
		return processCarrierButton;
	}

	public WebElement getPayByCheckOption() {
		return payByCheckOption;
	}

	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}

	public WebElement getPrice() {
		return price;
	}

	@FindBy(id="total_price")
	private WebElement totalPriceOfPurchase;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/a[1]")
	private WebElement ProceedToCheckoutFromCart;
	
	@FindBy(name="processAddress")
	private WebElement processAddButton;
	
	@FindBy(id="cgv")
	private WebElement termsConditionsCheckbox;
	
	@FindBy(xpath="//p[@class='fancybox-error']")
	private WebElement termsConditionsError;
	
	@FindBy(xpath="//a[@title=\"Add\"]")
	private WebElement addIcon;
	
	@FindBy(xpath="//a[@title=\"Subtract\"]")
	private WebElement subtractIcon;
	
	@FindBy(xpath="//input[@name='quantity_3_13_0_0_hidden']")
	private WebElement quantityInputCart;
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getQuantityInputCart() {
		return quantityInputCart;
	}

	public WebElement getAddIcon() {
		return addIcon;
	}

	public WebElement getSubtractIcon() {
		return subtractIcon;
	}

	public WebElement getTermsConditionsErrorClose() {
		return termsConditionsErrorClose;
	}

	@FindBy(xpath="//a[@title='Close']")
	private WebElement termsConditionsErrorClose;
	
	public WebElement getTermsConditionsError() {
		return termsConditionsError;
	}

	@FindBy(name="processCarrier")
	private WebElement processCarrierButton;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement payByCheckOption;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payByBankWireOption;
	
	public WebElement getPayByBankWireOption() {
		return payByBankWireOption;
	}

	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirmOrderButton;
	
	@FindBy(xpath="//span[@class='price']")
	private WebElement price;
	
	
	public MAP_CartPage(WebDriver ndriver) {
		this.driver = ndriver;
		PageFactory.initElements(driver, this);
	}
}
