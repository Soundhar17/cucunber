package com.base;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class medibase {
	public static WebDriver d;

	public static void browserlaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\chrom c\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://demo.smart-hospital.in/site/login");
			
		}
		if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\firefox\\geckodriver.exe");
			d=new FirefoxDriver();
			d.get("https://demo.smart-hospital.in/site/login");
			
		}
		if (name.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver","C:\\edge\\msedgedriver.exe");
			d=new EdgeDriver();
			d.get("https://demo.smart-hospital.in/site/login");
			
		}
	}


public static void wait(int s) throws InterruptedException {
	
	Thread.sleep(3000);
	

}

public static void user(WebElement element, String value ) {
	element.sendKeys(value);
}

public static void pass(WebElement element, String value ) {
	element.sendKeys(value);
	
	
}
public static void login(WebElement element ) {
	element.click();
	
	
}
public static void death(WebElement element ) {
	element.click();
}
public static void birth(WebElement element ) {
	element.click();

	
}
public static void windowhandle(){
	
    String oldwindow = d.getWindowHandle();
    
}
public static void windowhandles() {
	
	Set<String> childwindow =d.getWindowHandles();
}

public static void addbirth(WebElement element ) {
	element.click();

}
public static void child(WebElement element,String value) {
	
	element.sendKeys(value);
}

}






