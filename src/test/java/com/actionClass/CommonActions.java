package com.actionClass;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ExcelUtils;
import util.SeleniumHelper;

public class CommonActions {
	//CommonActions commonAction = new CommonAction();
	public XSSFRow row;
	public String getDriverPath() throws Exception{
		
		
			Properties prop = new Properties();
			InputStream input = new FileInputStream("src/test/resources/configs/Configuation.properties");
			prop.load(input);
			String browserValue =prop.getProperty("chromeDriverPath");
			System.out.println(browserValue);

	return browserValue;
	
	}
	public String verifyTitle() {
		String actualTitle = SeleniumHelper.getDriver().getTitle();
		return actualTitle;
	}
	
	public void sleepTime(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	  public static void openPage(String url) {
	    	System.out.println(url);
	    	System.out.println(SeleniumHelper.getDriver());
	    	SeleniumHelper.getDriver().get(url);
	    }
	
	public void nasaUrl(int url) throws Throwable {
		//Assign Sheet Name
				ExcelUtils.setExcelFileSheet("Sheet1");
				//fetch data from excel with # row
				row = ExcelUtils.getRowData(url);
				openPage(row.getCell(0).toString());
				
	}
	
	public static void waitAndClickOnElementJs(WebElement element,WebDriver driver,int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		
		try {
			element.click();
		}
		catch(Exception E) {
			
			JavascriptExecutor executor = (JavascriptExecutor)SeleniumHelper.getDriver();
			executor.executeScript("arguments[0].click;", element);
		}
	}
	
	 //navigate
    public void navigateBack() {
        SeleniumHelper.getDriver().navigate().back();
    }
    public void navigateForward() {
    	SeleniumHelper.getDriver().navigate().forward();
    }
    //sleep
    public void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

//    //webElements
//    public List<String> getTextFromWebElements(String type, String locator) {
//        List<WebElement> element;
//        List<String> text = new ArrayList<String>();
//        element = getElementList(type, locator);
//        for (WebElement we : element) {
//            text.add(we.getText());
//        }
//        return text;
//    }
    //new tab
    public void openNewTab(String urlLink)
    {   String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        SeleniumHelper.getDriver().findElement(By.linkText(urlLink)).sendKeys(selectLinkOpeninNewTab);
        ArrayList<String> tabs = new ArrayList<String>(SeleniumHelper.getDriver().getWindowHandles());
        SeleniumHelper.getDriver().switchTo().window(tabs.get(0));

    }
    
    public void validateSearchPage() {
    	
    }
    
    public void clickAction(WebElement wEm) {
    	Actions action = new Actions(SeleniumHelper.getDriver());
    	action.moveToElement(wEm).build().perform();
    	//action.click(homePageLocators.imageOption).build().perform();
    }
	
}
