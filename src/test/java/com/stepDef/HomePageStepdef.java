package com.stepDef;

import com.actionClass.CommonActions;
import com.actionClass.HomePageActions;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.SeleniumHelper;


public class HomePageStepdef {
	CommonActions commonAction = new CommonActions();
	HomePageActions homeActions = new HomePageActions();
	
	
	@Given("^nasa URL$")
	public void nasa_URL() throws Throwable {
		SeleniumHelper.setUpDriver();
	    System.out.println(">>>> Given nasa URL");
	    Reporter.addStepLog("Given nasa URL");
	}

	@When("^I Land on Homepage$")
	public void i_Land_on_Homepage() throws Throwable {
	 System.out.println(">>>>> Landing on home page");
	 Reporter.addStepLog("Landing on home page");
	 
	 
	 
	}
	@Then("^I validate the page title$")
	public void i_validate_the_page_title() throws Throwable {
		homeActions.pageTitle();
	   
	}

	
	@When("^I click on Search box$")
	public void i_click_on_Search_box() throws Throwable {
		homeActions.clickOnSearch();
	}

	@Then("^I am able to put input$")
	public void i_am_able_to_put_input() throws Throwable {
		homeActions.sendKeySearch();
	}

	
	@Then("^I click on video and audio features$")
	public void i_click_on_video_and_audio_features() throws Throwable {
		homeActions.clickVideoOption();
		homeActions.clickAudioOption();
		
	}
	@When("^I click on video and image features$")
	public void i_click_on_video_and_image_features() throws Throwable {
		homeActions.clickVideoOption();
		homeActions.clickImageOption();
	}

	@When("^I click on image and audio features$")
	public void i_click_on_image_and_audio_features() throws Throwable {
		homeActions.clickImageOption();
		homeActions.clickAudioOption();
	}
	
	@Then("^I Click on Search button$")
	public void i_Click_on_Search_button() throws Throwable {
	    homeActions.clickOnSearchButton();
	}
	
	@When("^I click on Image feature$")
	public void i_click_on_Image_feature() throws Throwable {
		homeActions.clickImageOption();
	}

	@When("^I put input in search box$")
	public void i_put_input_in_search_box() throws Throwable {
		homeActions.sendKeySearch();
	}

	@Then("^I am able to see search result for Image$")
	public void i_am_able_to_see_search_result_for_Image() throws Throwable {
		homeActions.validateImageContent();;
	}

	@When("^I click on Video feature$")
	public void i_click_on_Video_feature() throws Throwable {
		homeActions.clickVideoOption();
	}

	@Then("^I am able to see search result for Video$")
	public void i_am_able_to_see_search_result_for_Video() throws Throwable {	
		homeActions.validateVideoContent();;
	}

	@When("^I click on Audio feature$")
	public void i_click_on_Audio_feature() throws Throwable {
		homeActions.clickAudioOption();
	}

	@Then("^I am able to see search result for Audio$")
	public void i_am_able_to_see_search_result_for_Audio() throws Throwable {
		homeActions.validateAudioContent();;
	}
	
	@Then("^I validate the contants$")
	public void i_validate_the_contants() throws Throwable {
		homeActions.validateAllContent();;
	}
	
	@When("^I dont deselect any filter ,so by default all three filters are availble$")
	public void i_dont_deselect_any_filter_so_by_default_all_three_filters_are_availble() throws Throwable {
	    System.out.println("no filter was deselected");
	    Reporter.addStepLog("no filter was deselected");
	}
	
	@Then("^I validate the video and audio contants$")
	public void i_validate_the_video_and_audio_contants() throws Throwable {
		homeActions.validateAudioAndVideoContent();
	}

	@Then("^I validate the image and audio contants$")
	public void i_validate_the_image_and_audio_contants() throws Throwable {
		homeActions.validateImageAndAudioContent();
	}

	@Then("^I validate the video and image contants$")
	public void i_validate_the_video_and_image_contants() throws Throwable {
		homeActions.validateImageAndVideoContent();
	}
	
//	@Given("^nasa (\\d+)$")
//	public void nasa(int arg1) throws Throwable {
//		commonAction.nasaUrl(arg1);
//	}

}
