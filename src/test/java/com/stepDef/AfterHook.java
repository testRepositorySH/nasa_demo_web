package com.stepDef;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Command;

import com.actionClass.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import util.SeleniumHelper;



public class AfterHook {
	
	
	@After
public static void tearDown(Scenario scenario) {
		
		CommonActions commonActions = new CommonActions();
		commonActions.sleepTime(8000);
		
    	final Log log = LogFactory.getLog(AfterHook.class.getName());
    	
    	log.info(scenario.isFailed());
    	
    	if (scenario.isFailed()) {
            SeleniumHelper.takeScreenshot(scenario);;
         
        }
	   	else
	   	 {
	   		
	   	 }
        
     
    	SeleniumHelper.tearDown();
    log.info("------------------");
    String scenarioStatus;
    if(scenario.getStatus().equals("passed")){
    	scenarioStatus = "Passed";
    }
    else {
    	scenarioStatus = "Failed";
    }
    //scenarioList.add(new String[]{scenario.getName(),scenarioStatus});
    
   
    }
}
