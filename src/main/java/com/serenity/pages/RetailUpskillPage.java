package com.serenity.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetailUpskillPage extends Page{
	
	
	@FindBy(xpath = "//div[@class='minContainer']//li[@data-cy='oneWayTrip']")
	public WebElement onewayTrip;
	
	@FindBy(xpath = "//div[@class='minContainer']//li[@data-cy='roundTrip']")
	public WebElement roundTrip;

	@FindBy(xpath = "//label[@for='fromCity']//following::input[2]")
	public WebElementFacade fromCity;

	@FindBy(xpath = "//label[@for='toCity']//following::input[2]")
	public WebElementFacade toCity;

	@FindBy(xpath = "//a[text()='Search']")
	public WebElementFacade Search;


	@FindBy(xpath = "//div[@class='listingRhs']/p")
	public WebElementFacade onewaySearch; 
	

	

}
