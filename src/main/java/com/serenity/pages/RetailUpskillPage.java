package com.serenity.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetailUpskillPage extends Page{
	
	
	@FindBy(xpath = "//li[@class='tb_link dropdown tb_menu_system_account_account']/a")
	public WebElement accounticon;
	
	@FindBy(xpath = "//a[contains(@href,'account')]//span[contains(text(),'LOGIN')]")
	public WebElement Login;

	@FindBy(xpath = "//a[contains(@href,'account')]//span[contains(text(),'REGISTER')]")
	public WebElementFacade Register;

	@FindBy(xpath = "//a[contains(@href,'register')]")
	public WebElementFacade registerbtn;

	@FindBy(xpath = "//input[@id='input-firstname']")
	public WebElementFacade firstname;


	@FindBy(xpath = "//input[@id='input-lastname']")
	public WebElementFacade lastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	public WebElementFacade email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	public WebElementFacade telephone;
	
	@FindBy(xpath = "//input[@id='input-address-1']")
	public WebElementFacade address1;
	
	@FindBy(xpath = "//input[@id='input-address-2']")
	public WebElementFacade address2;
	
	@FindBy(xpath = "//input[@id='input-city']")
	public WebElementFacade city;
	
	@FindBy(xpath = "//input[@id='input-postcode']")
	public WebElementFacade postcode;
	
	@FindBy(xpath = "//select[@id='input-country']")
	public WebElementFacade country;
	
	@FindBy(xpath = "//select[@id='input-zone']")
	public WebElementFacade region;

	@FindBy(xpath = "//input[@id='input-password']")
	public WebElementFacade password;

	@FindBy(xpath = "//input[@id='input-confirm']")
	public WebElementFacade confirmpwd;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElementFacade policychk;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElementFacade Continue;
	
	@FindBy(xpath = "//input[@value='Login']")
	public WebElementFacade login;
	
	@FindBy(xpath = "//p[contains(text(),'Congratulations')]")
	public WebElementFacade congratulations;

	@FindBy(xpath = "//a[contains(@href,'logout')]//span[contains(text(),'LOGOUT')]")
	public WebElementFacade logoutbtn;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	public WebElementFacade myaccount;
	


	
	

	

}
