package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver d;
	

	public static WebDriver setproperty () {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrom c\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		return(d);
		
		}
	
	public static void url(){
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		
	}
	
	public static void wait(int s) throws InterruptedException {
		Thread.sleep(s);
	}
	public static void username(WebElement element, String value ) {
		element.sendKeys(value);
		
		
	}
	
	public static void password(WebElement element, String Value) {
		element.sendKeys(Value);
		
	}
	
	public static void login(WebElement element) {
		element.click();
	}
public static void logout(WebElement element) {
	element.click();
}
	
	public static void alert(String method) {
		if (method.equalsIgnoreCase("accept")) {
			d.switchTo().alert().accept();	
		} else {
           if (method.equalsIgnoreCase("dismiss")) {
			d.switchTo().alert().accept();
		} else {
			if(method.equalsIgnoreCase("gettext")) {
            d.switchTo().alert().accept();
		}
		}
		}
		}
		public static void navigate(String method) {
			
			if (method.equalsIgnoreCase("refresh")) {
				d.navigate().refresh();
				
			} else {
				if (method.equalsIgnoreCase("back")) {
					d.navigate().back();
					
				} else {
					if (method.equalsIgnoreCase("forward")) {
						d.navigate().forward();
						
					}

				}

			}
	}
}
	