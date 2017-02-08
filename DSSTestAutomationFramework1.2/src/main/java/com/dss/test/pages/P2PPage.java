package com.dss.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.dss.test.apputilities.Config;
import com.dss.test.pageobject.HomePageObject;
import com.dss.test.pageobject.P2PPageObject;
import com.sun.jna.platform.win32.OpenGL32Util;

public class P2PPage {
	
	private static WebDriver driver;
	public final static String setbrowser="firefox";
	public final static String setPlatform="windows";
	public final static String setP2PStageURL="https://core.p2p.tribstage.com/login?url=https%3A%2F%2Fcontent.p2p.tribstage.com%2F";
	public final String setP2PProdURL="https://core.p2p.tribstage.com/login?url=https%3A%2F%2Fcontent.p2p.tribstage.com%2F";
	
	
	
	public static boolean deleteEmailIDFromP2P(String emailID) throws InterruptedException{
		
		driver = new Config().selectBrowser(setbrowser, setPlatform);
		PageFactory.initElements(driver, P2PPageObject.class);
		OpenUrl(setP2PStageURL);
		Thread.sleep(5000);
		EnterUsername("DSStester");
		Thread.sleep(5000);
		EnterPassword("Tribune17");
		Thread.sleep(5000);
		ClickLogin();
		Thread.sleep(5000);
		ClickRegistration_TopNav();
		Thread.sleep(5000);
		ClickConsumerSearch_SubNav();
		
		boolean emailIdExist=false;
		
		return emailIdExist;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






	/*********************Private Methods******************************/
	
	
	private static void ClickRegistration_TopNav() {
		
	P2PPageObject.link_TopNav_Registration.click();
	}

	private static void ClickConsumerSearch_SubNav() {
	
		P2PPageObject.link_SubNav_Consumer_Search.click();
	}
	
	private static void OpenUrl(String P2PURL){
		driver.get(P2PURL);
	}
	
	private static void EnterUsername(String p2pUserName){
		P2PPageObject.text_P2p_Username.sendKeys(p2pUserName);
		
	}
		
		private static void EnterPassword(String p2pUserPassword){
			P2PPageObject.text_P2p_Username.sendKeys(p2pUserPassword);
	}

		private static void ClickLogin(){
			P2PPageObject.btn_login.click();
			
	}
}
