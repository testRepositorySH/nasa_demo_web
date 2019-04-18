package runner;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Extent-report/extentReport.html"},
        features = "src/test/resources/FeaturesFiles",
        glue = {"com/stepDef"},
        tags = {"@Api"},
        dryRun=false,
        monochrome = true
        )
public class baseRunner extends AbstractTestNGCucumberTests{
	
	

//@AfterClass
//public static void reportSetup() 
//	{
//
//    Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//    
//  
//	}
}