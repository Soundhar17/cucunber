package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class medimain {
	
	private static WebDriver d;
	
	public medimain(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d,this);
		
	}
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}
	@FindBy(xpath="//span[text()=' Birth & Death Record']")
	private WebElement deathre;

	public WebElement getDeathre() {
		return deathre;
	}
	@FindBy(xpath="(//i[@class='fas fa-angle-right'])[1]")
	private WebElement birth;

	public WebElement getBirth() {
		return birth;
	}
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement Addbir;

	public WebElement getAddbir() {
		return Addbir;
	}
	@FindBy(id=("child_name"))
	
	private WebElement name;

	public WebElement getName() {
		return name;
	}
	
	}

	
	
	

