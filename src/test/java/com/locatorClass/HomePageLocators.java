package com.locatorClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"large-search_input\"]")
	public WebElement searchBox;
	

	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Images')]")
	public WebElement imageVel;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Audio')]")
	public WebElement audioOption;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Videos')]")
	public WebElement videoOption;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@class='video-asset']")
	public WebElement videoAllVel;

	@FindBy(how=How.XPATH,using="//*[@class='audio-asset']")
	public WebElement audioAllVel;
	
	@FindBy(how=How.XPATH,using="//*[@class='image-asset']")
	public WebElement imageAllVel;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@class=\"button\"]")
	public WebElement buttonSearch;
}
