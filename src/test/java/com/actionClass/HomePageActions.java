package com.actionClass;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.locatorClass.HomePageLocators;

import util.SeleniumHelper;

public class HomePageActions {
	HomePageLocators homePageLocators = null;
	CommonActions commonActions = new CommonActions();
	HomePageActions homePageAction = null;

	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumHelper.getDriver(), homePageLocators);
	}
	
	public void pageTitle() {
		   System.out.println(">>>>> Verifying page title");
		   Reporter.addStepLog("Verifying page title");
		   commonActions.sleepTime(5000);
		   String expected = "NASA Image and Video Library ";
		   System.out.println("Expected Page Title : " + expected);
		   Reporter.addStepLog("Expected Page Title : " + expected);
		   String actual = commonActions.verifyTitle();
		   System.out.println("Actual Page Title : " + actual);
		   Reporter.addStepLog("Actual Page Title : " + actual);
		   commonActions.sleepTime(5000);
		   Assert.assertEquals(actual, expected);
	}
	public void clickOnSearch() {
		CommonActions.waitAndClickOnElementJs(homePageLocators.searchBox, SeleniumHelper.getDriver(), 15);
		System.out.println(">>>clicked on Search Box");
		Reporter.addStepLog("clicked on Search Box");
	}
	
	public void sendKeySearch() throws InterruptedException {
		Thread.sleep(5000);
		homePageLocators.searchBox.sendKeys("rocket");
		System.out.println(">>>Put <rocket> in searchbox");
		Reporter.addStepLog("Put <rocket> in searchbox");
		
	}
	
	public void sendKeyValue(String value) throws InterruptedException {
		commonActions.sleepFor(10000);
		homePageLocators.searchBox.sendKeys(value);
	
	}
	
	public void clickImageOption() {
		CommonActions.waitAndClickOnElementJs(homePageLocators.imageVel, SeleniumHelper.getDriver(), 15);
		System.out.println(">>>Clicked on Image Option");
		Reporter.addStepLog("Clicked on Image Option");
	}
	public void clickAudioOption() {
		commonActions.sleepTime(5000);
		homePageLocators.audioOption.click();
		System.out.println(">>>Clicked on Audio Option");
		Reporter.addStepLog("Clicked on Audio Option");
		
	}
	public void clickVideoOption() {
		commonActions.sleepTime(5000);
		homePageLocators.videoOption.click();
		System.out.println(">>>Clicked on Video Option");
		Reporter.addStepLog("Clicked on Video Option");
		
	}
	
	public void clickOnSearchButton() {
		commonActions.sleepTime(5000);
		homePageLocators.buttonSearch.click();
		Reporter.addStepLog("Clicked on Search Button");
		
	}
	
	
	
	

	
	public void validateImageContent() {
		boolean imageDisplay;
		boolean audioDisplay;
		boolean videoDisplay;
		commonActions.sleepTime(10000);
		
		try{
			if(imageDisplay= homePageLocators.imageAllVel.isDisplayed()) {
				imageDisplay=true;
			}
		}catch(Exception e) {
			imageDisplay=false;
		}
		
		try{
			if(audioDisplay= homePageLocators.audioAllVel.isDisplayed()) {
				audioDisplay=true;
			}
		}catch(Exception e){
			audioDisplay=false;
		}
		try{
			if(videoDisplay= homePageLocators.videoAllVel.isDisplayed()) {
				videoDisplay=true;
			}
			
		}catch(Exception e){
			videoDisplay=false;
		}
		
		
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == true) {
			System.out.println(">>>> Search returning Video content ONLY");	
			Assert.fail();
		}
		
		if( imageDisplay==true && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> Search returning Image content ONLY");
			Reporter.addStepLog("Search returning Image content ONLY");
		}
		
		if( imageDisplay==false && audioDisplay ==true &&  videoDisplay == false) {
				System.out.println(">>>> Search returning audio content ONLY");
				Assert.fail();
		}
		if(imageDisplay==false && audioDisplay ==true && videoDisplay == true) {
			System.out.println(">>>> Search returning Video content and audio content");
			Assert.fail();
			
		}
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> No content available");
			
		}if(imageDisplay==true && audioDisplay ==false && videoDisplay == true) {
			System.out.println(">>>Search returning Image content and video content");
			Assert.fail();	
		}
		if(imageDisplay==true && audioDisplay ==true && videoDisplay == false) {
			System.out.println(">>>Search returning Image content and audio content");
			Assert.fail();
			
		}
		if(imageDisplay==true && audioDisplay ==true &&  videoDisplay == true) {
			System.out.println("Search returning video,image and audio content");
			Assert.fail();
		}
}
	
	public void validateVideoContent() {
		boolean imageDisplay;
		boolean audioDisplay;
		boolean videoDisplay;
		commonActions.sleepTime(10000);
		
		try{
			if(imageDisplay= homePageLocators.imageAllVel.isDisplayed()) {
				imageDisplay=true;
			}
		}catch(Exception e) {
			imageDisplay=false;
		}
		
		try{
			if(audioDisplay= homePageLocators.audioAllVel.isDisplayed()) {
				audioDisplay=true;
			}
		}catch(Exception e){
			audioDisplay=false;
		}
		try{
			if(videoDisplay= homePageLocators.videoAllVel.isDisplayed()) {
				videoDisplay=true;
			}
			
		}catch(Exception e){
			videoDisplay=false;
		}
		
		
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == true) {
			System.out.println(">>>> Search returning Video content ONLY");
			Reporter.addStepLog("Search returning Video content ONLY");
		}
		
		if( imageDisplay==true && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> Search returning Image content ONLY");
			Assert.fail();
		}
		
		if( imageDisplay==false && audioDisplay ==true &&  videoDisplay == false) {
				System.out.println(">>>> Search returning audio content ONLY");
				Assert.fail();
		}
		if(imageDisplay==false && audioDisplay ==true && videoDisplay == true) {
			System.out.println(">>>> Search returning Video content and audio content");
			Assert.fail();
			
		}
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> No content available");
			Assert.fail();
			
		}if(imageDisplay==true && audioDisplay ==false && videoDisplay == true) {
			System.out.println(">>>Search returning Image content and video content");
			Assert.fail();	
		}
		if(imageDisplay==true && audioDisplay ==true && videoDisplay == false) {
			System.out.println(">>>Search returning Image content and audio content");
			Assert.fail();
			
		}
		if(imageDisplay==true && audioDisplay ==true &&  videoDisplay == true) {
			System.out.println("Search returning video,image and audio content");
			Assert.fail();
		}
}
	
	public void validateAudioContent() {
		boolean imageDisplay;
		boolean audioDisplay;
		boolean videoDisplay;
		commonActions.sleepTime(10000);
		
		try{
			if(imageDisplay= homePageLocators.imageAllVel.isDisplayed()) {
				imageDisplay=true;
			}
		}catch(Exception e) {
			imageDisplay=false;
		}
		
		try{
			if(audioDisplay= homePageLocators.audioAllVel.isDisplayed()) {
				audioDisplay=true;
			}
		}catch(Exception e){
			audioDisplay=false;
		}
		try{
			if(videoDisplay= homePageLocators.videoAllVel.isDisplayed()) {
				videoDisplay=true;
			}
			
		}catch(Exception e){
			videoDisplay=false;
		}
		
		
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == true) {
			System.out.println(">>>> Search returning Video content ONLY");	
			Assert.fail();
		}
		
		if( imageDisplay==true && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> Search returning Image content ONLY");
			Assert.fail();
		}
		
		if( imageDisplay==false && audioDisplay ==true &&  videoDisplay == false) {
				System.out.println(">>>> Search returning audio content ONLY");
				Reporter.addStepLog("earch returning audio content ONLY");
		}
		if(imageDisplay==false && audioDisplay ==true && videoDisplay == true) {
			System.out.println(">>>> Search returning Video content and audio content");
			Assert.fail();
			
		}
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> No content available");
			Assert.fail();
			
		}if(imageDisplay==true && audioDisplay ==false && videoDisplay == true) {
			System.out.println(">>>Search returning Image content and video content");
			Assert.fail();	
		}
		if(imageDisplay==true && audioDisplay ==true && videoDisplay == false) {
			System.out.println(">>>Search returning Image content and audio content");
			Assert.fail();
			
		}
		if(imageDisplay==true && audioDisplay ==true &&  videoDisplay == true) {
			System.out.println("Search returning video,image and audio content");
			Assert.fail();
		}
}
	
	public void validateImageAndVideoContent() {
		boolean imageDisplay;
		boolean audioDisplay;
		boolean videoDisplay;
		commonActions.sleepTime(10000);
		
		try{
			if(imageDisplay= homePageLocators.imageAllVel.isDisplayed()) {
				imageDisplay=true;
			}
		}catch(Exception e) {
			imageDisplay=false;
		}
		
		try{
			if(audioDisplay= homePageLocators.audioAllVel.isDisplayed()) {
				audioDisplay=true;
			}
		}catch(Exception e){
			audioDisplay=false;
		}
		try{
			if(videoDisplay= homePageLocators.videoAllVel.isDisplayed()) {
				videoDisplay=true;
			}
			
		}catch(Exception e){
			videoDisplay=false;
		}
		
		
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == true) {
			System.out.println(">>>> Search returning Video content ONLY");	
			Assert.fail();
		}
		
		if( imageDisplay==true && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> Search returning Image content ONLY");
			Assert.fail();
		}
		
		if( imageDisplay==false && audioDisplay ==true &&  videoDisplay == false) {
				System.out.println(">>>> Search returning audio content ONLY");
				Assert.fail();
		}
		if(imageDisplay==false && audioDisplay ==true && videoDisplay == true) {
			System.out.println(">>>> Search returning Video content and audio content");
			Assert.fail();
			
		}
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> No content available");
			Assert.fail();
			
		}if(imageDisplay==true && audioDisplay ==false && videoDisplay == true) {
			System.out.println(">>>Search returning Image content and video content");
			Reporter.addStepLog("Search returning Image content and video content");
				
		}
		if(imageDisplay==true && audioDisplay ==true && videoDisplay == false) {
			System.out.println(">>>Search returning Image content and audio content");
			Assert.fail();
			
		}
		if(imageDisplay==true && audioDisplay ==true &&  videoDisplay == true) {
			System.out.println("Search returning video,image and audio content");
			Assert.fail();
		}
}
	
	public void validateImageAndAudioContent() {
		boolean imageDisplay;
		boolean audioDisplay;
		boolean videoDisplay;
		commonActions.sleepTime(10000);
		
		try{
			if(imageDisplay= homePageLocators.imageAllVel.isDisplayed()) {
				imageDisplay=true;
			}
		}catch(Exception e) {
			imageDisplay=false;
		}
		
		try{
			if(audioDisplay= homePageLocators.audioAllVel.isDisplayed()) {
				audioDisplay=true;
			}
		}catch(Exception e){
			audioDisplay=false;
		}
		try{
			if(videoDisplay= homePageLocators.videoAllVel.isDisplayed()) {
				videoDisplay=true;
			}
			
		}catch(Exception e){
			videoDisplay=false;
		}
		
		
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == true) {
			System.out.println(">>>> Search returning Video content ONLY");	
			Assert.fail();
		}
		
		if( imageDisplay==true && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> Search returning Image content ONLY");
			Assert.fail();
		}
		
		if( imageDisplay==false && audioDisplay ==true &&  videoDisplay == false) {
				System.out.println(">>>> Search returning audio content ONLY");
				Assert.fail();
		}
		if(imageDisplay==false && audioDisplay ==true && videoDisplay == true) {
			System.out.println(">>>> Search returning Video content and audio content");
			Assert.fail();
			
		}
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> No content available");
			Assert.fail();
			
		}if(imageDisplay==true && audioDisplay ==false && videoDisplay == true) {
			System.out.println(">>>Search returning Image content and video content");
			Assert.fail();	
		}
		if(imageDisplay==true && audioDisplay ==true && videoDisplay == false) {
			System.out.println(">>>Search returning Image content and audio content");
			Reporter.addStepLog("Search returning Image content and audio content");
			
		}
		if(imageDisplay==true && audioDisplay ==true &&  videoDisplay == true) {
			System.out.println("Search returning video,image and audio content");
			Assert.fail();
		}
}
	public void validateAudioAndVideoContent() {
		boolean imageDisplay;
		boolean audioDisplay;
		boolean videoDisplay;
		commonActions.sleepTime(10000);
		
		try{
			if(imageDisplay= homePageLocators.imageAllVel.isDisplayed()) {
				imageDisplay=true;
			}
		}catch(Exception e) {
			imageDisplay=false;
		}
		
		try{
			if(audioDisplay= homePageLocators.audioAllVel.isDisplayed()) {
				audioDisplay=true;
			}
		}catch(Exception e){
			audioDisplay=false;
		}
		try{
			if(videoDisplay= homePageLocators.videoAllVel.isDisplayed()) {
				videoDisplay=true;
			}
			
		}catch(Exception e){
			videoDisplay=false;
		}
		
		
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == true) {
			System.out.println(">>>> Search returning Video content ONLY");	
			Assert.fail();
		}
		
		if( imageDisplay==true && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> Search returning Image content ONLY");
			Assert.fail();
		}
		
		if( imageDisplay==false && audioDisplay ==true &&  videoDisplay == false) {
				System.out.println(">>>> Search returning audio content ONLY");
				Assert.fail();
		}
		if(imageDisplay==false && audioDisplay ==true && videoDisplay == true) {
			System.out.println(">>>> Search returning Video content and audio content");
			Reporter.addStepLog("Search returning Video content and audio content");
			
		}
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> No content available");
			Assert.fail();
			
		}if(imageDisplay==true && audioDisplay ==false && videoDisplay == true) {
			System.out.println(">>>Search returning Image content and video content");
			Assert.fail();	
		}
		if(imageDisplay==true && audioDisplay ==true && videoDisplay == false) {
			System.out.println(">>>Search returning Image content and audio content");
			Assert.fail();
			
		}
		if(imageDisplay==true && audioDisplay ==true &&  videoDisplay == true) {
			System.out.println("Search returning video,image and audio content");
			Assert.fail();
		}
}
	
	public void validateAllContent() {
		boolean imageDisplay;
		boolean audioDisplay;
		boolean videoDisplay;
		commonActions.sleepTime(10000);
		
		try{
			if(imageDisplay= homePageLocators.imageAllVel.isDisplayed()) {
				imageDisplay=true;
			}
		}catch(Exception e) {
			imageDisplay=false;
		}
		
		try{
			if(audioDisplay= homePageLocators.audioAllVel.isDisplayed()) {
				audioDisplay=true;
			}
		}catch(Exception e){
			audioDisplay=false;
		}
		try{
			if(videoDisplay= homePageLocators.videoAllVel.isDisplayed()) {
				videoDisplay=true;
			}
			
		}catch(Exception e){
			videoDisplay=false;
		}
		
		
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == true) {
			System.out.println(">>>> Search returning Video content ONLY");
			Assert.fail();
		}
		
		if( imageDisplay==true && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> Search returning Image content ONLY");
			//Reporter.addStepLog(message);
			Assert.fail();
		}
		
		if( imageDisplay==false && audioDisplay ==true &&  videoDisplay == false) {
				System.out.println(">>>> Search returning audio content ONLY");
				Assert.fail();
		}
		if(imageDisplay==false && audioDisplay ==true && videoDisplay == true) {
			System.out.println(">>>> Search returning Video content and audio content");
			Assert.fail();
			
		}
		if( imageDisplay==false && audioDisplay ==false &&  videoDisplay == false) {
			System.out.println(">>>> No content available");
			Assert.fail();
			
		}if(imageDisplay==true && audioDisplay ==false && videoDisplay == true) {
			System.out.println(">>>Search returning Image content and video content");
			Assert.fail();	
		}
		if(imageDisplay==true && audioDisplay ==true && videoDisplay == false) {
			System.out.println(">>>Search returning Image content and audio content");
			Assert.fail();
			
		}
		if(imageDisplay==true && audioDisplay ==true &&  videoDisplay == true) {
			System.out.println(">>>Search returning video,image and audio content");
			Reporter.addStepLog("Search returning video,image and audio content");
		}
}
}		
