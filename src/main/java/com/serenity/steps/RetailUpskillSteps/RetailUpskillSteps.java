package com.serenity.steps.RetailUpskillSteps;

import com.serenity.pages.HomePage;
import com.serenity.pages.RetailUpskillPage;
import com.serenity.steps.CommonStep;

import net.thucydides.core.annotations.Step;

public class RetailUpskillSteps extends CommonStep {

	RetailUpskillPage fb;
	HomePage home;

	@Step
	public void geturl(String url) {
		fb.getDriver().get(url);
		
	}

	@Step
	public void Register(String userid, String password) throws InterruptedException {
		System.out.println("registration in progress");
		
		//fb.wait(100);
		fb.accounticon.click();
		System.out.println("after click");
		
		//fb.wait(3);
		fb.registerbtn.waitUntilClickable().click();
		//fb.wait(3);
		System.out.println("registration page");
		fb.firstname.waitUntilVisible().sendKeys(userid);
		fb.lastname.sendKeys(userid);
		fb.email.sendKeys(userid);
		fb.telephone.sendKeys("999999999");
		fb.address1.sendKeys(userid);
		fb.address2.sendKeys(userid);
		fb.city.sendKeys(userid);
		fb.postcode.sendKeys("560103");
		fb.country.sendKeys("India");
		fb.region.sendKeys("Karnataka");
		fb.password.sendKeys(password);
		fb.confirmpwd.sendKeys(password);
		fb.policychk.click();
		fb.Continue.click();
		System.out.println("after click continue");
		
	}

	@Step
	public void Login(String userid, String password) throws InterruptedException {
		System.out.println("registration in progress");
		//fb.wait(100);
		fb.accounticon.click();
		
		//fb.wait(3);
		fb.email.sendKeys(userid);
		fb.password.sendKeys(password);
		fb.login.click();
		
		
	}

	@Step
	public boolean registrationsuccess() throws InterruptedException {
		//fb.wait(3);
		boolean registered= fb.congratulations.isVisible();
		return registered;
	}

	@Step
	public Object loginsuccess() throws InterruptedException {
		//fb.wait(3);
		boolean login= fb.congratulations.isVisible();
		return login;
	}

}
