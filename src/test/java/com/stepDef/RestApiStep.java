package com.stepDef;

import com.RestapiRestAssured.CommonApi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestApiStep {
	
	CommonApi commonApi = new CommonApi();
	

	
	@Given("^End point$")
	public void end_point() throws Throwable {
	    System.out.println(">> End point was provided");
	}

	@When("^I provide the parameter$")
	public void i_provide_the_parameter() throws Throwable {
	    System.out.println(">> parameter was provided");
	}

	@Then("^I validate the Header, get call , status code and status line for media_type$")
	public void i_validate_the_Header_get_call_status_code_and_status_line_for_media_type() throws Throwable {
		commonApi.media_type();
	}

	@Then("^I validate the Header, get call , status code and status line for q$")
	public void i_validate_the_Header_get_call_status_code_and_status_line_for_q() throws Throwable {
		commonApi.testQ();
	}

	@Then("^I validate the Header, get call , status code and status line for year_End$")
	public void i_validate_the_Header_get_call_status_code_and_status_line_for_year_End() throws Throwable {
		commonApi.yearEnd();
	}

	@Then("^I validate the Header, get call , status code and status line for year_start$")
	public void i_validate_the_Header_get_call_status_code_and_status_line_for_year_start() throws Throwable {
	   commonApi.year_start();
	}
}
