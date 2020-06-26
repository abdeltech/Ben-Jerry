package com.BenJerry.Steps;

import com.BenJerry.testBase.BaseClass;

import cucumber.api.java.After;


public class Hooks extends BaseClass { // This method executes after each scenario.
	
	@After
	public void afterScenario() {
		teardown();
	}
				

}
