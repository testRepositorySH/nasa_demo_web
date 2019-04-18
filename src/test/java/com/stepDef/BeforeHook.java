package com.stepDef;


import cucumber.api.Scenario;
import cucumber.api.java.Before;
import util.SeleniumHelper;


public class BeforeHook {
	

	public Scenario scenario;
	@Before
	public void setUp(Scenario scenario) throws Exception {
		this.scenario = scenario;
		//SeleniumHelper.setUpDriver();
		System.out.println("Scenario Name : " + scenario.getName());
		
	}
	
	

}
