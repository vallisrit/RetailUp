package com.serenity.steps.RetailUpskillSteps;

import java.util.Map;


import com.serenity.pages.HomePage;
import com.serenity.pages.flightbooking.FlightBookingPage;
import com.serenity.steps.CommonStep;

import net.thucydides.core.annotations.Step;

public class RetailUpskillSteps extends CommonStep {

	FlightBookingPage fb;
	HomePage home;

	@Step
	public void booking_one_way_flight(Map<String, String> userDetails) {
		//home.lnk_flight.click();
		fb.one_way_booking_flight(userDetails);
	}

}
