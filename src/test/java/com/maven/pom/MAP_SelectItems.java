package com.maven.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MAP_SelectItems {


	static WebDriver driver;
	
	public WebElement getAddDressesToCart() {
		return addDressesToCart;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getDressesMenu() {
		return dressesMenu;
	}

	public WebElement getEveningDresses() {
		return eveningDresses;
	}

	public WebElement getSummerDresses() {
		return summerDresses;
	}

	public WebElement gettShirts() {
		return tShirts;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
	

	public WebElement getWomenApparel() {
		return womenApparel;
	}

	public WebElement getCasualDressesOpt() {
		return casualDressesOpt;
	}

	@FindBy(xpath="//a[text()='Women']")
	private WebElement womenApparel;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li/ul/li[2]/ul/li[1]/a")
	private WebElement casualDressesOpt;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement casualDressImage;
	
	public WebElement getCasualDressImage() {
		return casualDressImage;
	}

	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement addDressesToCart;
	
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement continueShopping;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dressesMenu;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")
	private WebElement eveningDresses;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
	private WebElement summerDresses;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement tShirts;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckout;
	
	public MAP_SelectItems(WebDriver ndriver) {
		this.driver = ndriver;
		PageFactory.initElements(driver, this);
	}
	
}
