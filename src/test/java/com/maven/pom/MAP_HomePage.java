package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAP_HomePage {

	static WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signInText;
	
	@FindBy(id="search_query_top")
	private WebElement searchQuery;
	
	@FindBy(xpath="//span[@class='lighter']")
	private WebElement searchResultHeader;
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchQuery() {
		return searchQuery;
	}

	public WebElement getSearchResultHeader() {
		return searchResultHeader;
	}

	public WebElement getSignInText() {
		return signInText;
	}

	public MAP_HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}
