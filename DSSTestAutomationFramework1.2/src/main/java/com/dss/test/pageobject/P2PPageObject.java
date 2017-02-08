package com.dss.test.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P2PPageObject {
	
	/**** Login Page*****/
	
	@FindBy(css="#login > div.saveButtons > button")
	public static WebElement btn_login;
	
	@FindBy(id="login_username")
	public static WebElement text_P2p_Username;
	
	@FindBy(id="login_password")
	public static WebElement text_P2p_Password;
	
	
	
	/*************Login Page*****************/
	
	@FindBy(xpath="//*[@id='navLinks']/li[6]/a")
	public static WebElement link_TopNav_Registration;
	
	@FindBy(xpath="//*[@id='functionContainer']/ul/li[3]/a")
	public static WebElement link_SubNav_Consumer_Search;
	
	/*******Consumer Search Page*********/
	
	@FindBy(id="email")
	public static WebElement text_ConsumerSearch_Emailid;
	
	@FindBy(name="commit")
	public static WebElement btn_ConsumerSearch_Search;
	
	@FindBy(xpath="//*[@id='ssor_delete_consumer_button']/span")
	public static WebElement btn_ConsumerSearch_BatchDelete;
	
	@FindBy(xpath="//*[@id='ssor_delete_consumer_form']/div[4]/table/tbody/tr/td[1]")
	public static List<WebElement> Checkbox_ConsumerSearch_resultSet;
	
	
	/*******Confirmation Pop Up*******/
	
	@FindBy(xpath="//*[@id='hud_prompt_Confirm']")
	public static WebElement btn_Delete_Confirmation;
	
	
}
