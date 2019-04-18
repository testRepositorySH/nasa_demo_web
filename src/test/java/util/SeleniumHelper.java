package util;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actionClass.CommonActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Capabilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.remote.RemoteWebDriver;


import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;



public class SeleniumHelper {
	
	
private static WebDriver driver;
public static int TIMEOUT = 30;
public static int PAGE_LOAD_TIMEOUT = 50;
public static String reportNameFinal;
public static String reportFolderNameFinal;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() throws Exception {
		CommonActions commonAction = new CommonActions();
        System.setProperty("webdriver.chrome.driver", commonAction.getDriverPath());
        driver = new ChromeDriver();
        driver.get("https://images.nasa.gov/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

	 public static void takeScreenshot(Scenario scenario){
	    	File scrFile = ((TakesScreenshot)SeleniumHelper.getDriver()).getScreenshotAs(OutputType.FILE);
		    try {
		    	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
				Date curDate = new Date();
				String strDate = sdf.format(curDate);
		    	String imagePath =  scenario.getName() + "target/Extent-report"+ ".png";
		    	FileUtils.copyFile(scrFile, new File(imagePath));
		    	Reporter.addScreenCaptureFromPath(imagePath);
				//reportFolderNameFinal + "/" +
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
	    	
	    }
	    public static void setupExtentReport(){
	    	ConfigFileReader configFileReader;
			
	        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
			Date curDate = new Date();
			String strDate = sdf.format(curDate);
			
			configFileReader= new ConfigFileReader();
			
			String fileName = System.getProperty("user.dir")+configFileReader.getReportPath()+ strDate + "\\"+ strDate +".html";
			reportNameFinal =fileName;
			reportFolderNameFinal = System.getProperty("user.dir")+configFileReader.getReportPath()+ strDate;
			ExtentProperties extentProperties = ExtentProperties.INSTANCE;
			extentProperties.setReportPath(fileName);
		
	    }
	    
	    public static void tearDownReport() throws Exception{
	    	try{
	    	Reporter.loadXMLConfig(new File("src/test/resources/runner/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", System.getProperty("os.name"));
	        Reporter.setSystemInfo("java version", System.getProperty("java.version"));
	        
	        Capabilities capa = ((RemoteWebDriver)SeleniumHelper.getDriver()).getCapabilities();
	        Reporter.setSystemInfo("browser", capa.getBrowserName());        
	        Reporter.setSystemInfo("os", System.getProperty("os.name"));
	        Reporter.setTestRunnerOutput(capa.toString());
	    	}
	    	catch(Exception e){
	    		
	    	}

	    }
	    public static void tearDown() {
	         
	            driver.close();
	            driver.quit();
	        }
	        
	    
	  
}
