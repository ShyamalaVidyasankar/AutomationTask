package com.maven.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MAP_MyAccountPage {
	
	static WebDriver driver;
	
	@FindBy(xpath="//a[@title='View my customer account']/span")
	private WebElement customerName;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signOut;
	
	@FindBy(xpath="//a[@title='Information']")
	private WebElement myInformationButton;
	
	@FindBy(xpath="//a[@title='Orders']")
	private WebElement orderHistoryButton;
	
	@FindBy(xpath="//a[@title='Credit slips']")
	private WebElement creditSlipsButton;
	
	@FindBy(xpath="//a[@title='Addresses']")
	private WebElement addressesButton;
	
	@FindBy(xpath="//a[@title='My wishlists']")
	private WebElement WishlistsButton;
	
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	private WebElement orderHistoryPage;
	
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	private WebElement creditListPage;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement myAddressesPage;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement myWishlistPage;
	
	@FindBy(xpath="//h1[@class='page-subheading']")
	private WebElement personalInformationPage;
	
	public WebElement getOrderHistoryPage() {
		return orderHistoryPage;
	}

	public WebElement getCreditListPage() {
		return creditListPage;
	}

	public WebElement getMyAddressesPage() {
		return myAddressesPage;
	}

	public WebElement getMyWishlistPage() {
		return myWishlistPage;
	}

	public WebElement getPersonalInformationPage() {
		return personalInformationPage;
	}

	public WebElement getSignOut() {
		return signOut;
	}


	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getMyInformationButton() {
		return myInformationButton;
	}
	
	public WebElement getOrderHistoryButton() {
		return orderHistoryButton;
	}

	public WebElement getCreditSlipsButton() {
		return creditSlipsButton;
	}

	public WebElement getAddressesButton() {
		return addressesButton;
	}

	public WebElement getWishlistsButton() {
		return WishlistsButton;
	}

	public MAP_MyAccountPage(WebDriver ndriver) {
		this.driver = ndriver;
		PageFactory.initElements(driver, this);
	}
	

}
