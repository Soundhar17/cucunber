package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class main2 {
	
	private static WebDriver d;
	
	public main2 (WebDriver d){
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="//*[@id=\"txt_unam\"]")
	
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	@FindBy(xpath="//*[@id=\"txt_pass\"]")
	
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@id=\"Button3\"]")
	private WebElement button;

	public WebElement getButton() {
		return button;
	}
	@FindBy(xpath="//a[text()=\"Supplier  Management\"]")
	
	private WebElement supplier;

	public WebElement getSupplier() {
		return supplier;
	}
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_ddl_state\"]")
	private  WebElement state;

	public WebElement getState() { 
		return state;
	}
	
	
	}

	
	
	
	

