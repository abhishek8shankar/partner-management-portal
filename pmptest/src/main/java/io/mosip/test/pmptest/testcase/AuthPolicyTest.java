package io.mosip.test.pmptest.testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
// Generated by Selenium IDE
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.mosip.test.pmptest.utility.BaseClass;
import io.mosip.test.pmptest.utility.Commons;
import io.mosip.test.pmptest.utility.JsonUtil;

public class AuthPolicyTest extends BaseClass {

	@Test(groups = "AP")
	public void authPolicyCRUD() throws InterruptedException{
		
		Commons.click(driver, By.xpath("//span[contains(text(),'Policy')]"));

		Commons.click(driver, By.xpath("//a[@href='#/pmp/resources/authpolicy/view']"));
		
        Commons.click(driver, By.xpath("//button[@id='Create Policy']"));
		
		Commons.enter(driver, By.xpath("//input[@placeholder='Name']"), data);
		Commons.enter(driver, By.xpath("//input[@placeholder='Description']"), data);
		Commons.dropdown(driver, By.xpath("//mat-select[@id='policyGroupName']"));
		
		
		
		String policyData;
		try {
			policyData = JsonUtil.JsonObjParsing(Commons.getTestData(),"policyData");
			Commons.enter(driver, By.xpath("//textarea[@placeholder='Policies Data']"), policyData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Commons.click(driver, By.xpath("//button[@id='createButton']"));
	
		Commons.click(driver, By.xpath("//span[contains(text(),'Ok')]"));
		
		
		Commons.filter(driver, By.xpath("(//input[@id='name'])[1]"), data); 
		Commons.click(driver, By.id("ellipsis-button0"));
		Commons.click(driver, By.id("Edit0"));
		Commons.enter(driver, By.xpath("//input[@placeholder='Name']"), data+1);
		
		
		Commons.click(driver, By.xpath("//button[@id='createButton']"));
		Commons.click(driver, By.xpath("//button[@id='confirmmessagepopup']"));

		
		Commons.filter(driver, By.xpath("(//input[@id='name'])[1]"), data+1);
		Commons.click(driver, By.id("ellipsis-button0"));
		Commons.click(driver, By.id("Activate0"));

		Commons.click(driver, By.xpath("//button[@id='confirmpopup']"));
		Commons.click(driver, By.xpath("//button[@id='confirmmessagepopup']"));
		
		
	}
}
