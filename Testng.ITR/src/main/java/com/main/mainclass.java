package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainclass {
	
	private static WebDriver d;
	
	public mainclass (WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//*[@id=\"txt_unam\"]")
	private WebElement user;
    public WebElement getUser() {
		return user;
	}
	
	@FindBy(xpath = "//*[@id=\"txt_pass\"]")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	@FindBy(xpath = "//*[@id=\"Button3\"]")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath = "//*[@id=\"LinkButton1\"]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	
	}
	
	

