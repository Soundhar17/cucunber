package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class base2 {
	
	public static WebDriver d;
	

	public static void setproperty(String name) {
		
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\chrom c\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("http://www.brm.tremplintech.in/web_pages/ord_reg.aspx");
			
		}
		if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\firefox\\geckodriver.exe");
			d=new FirefoxDriver();
			d.get("http://www.brm.tremplintech.in/web_pages/ord_reg.aspx");
			
		}
		if (name.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver","C:\\edge\\msedgedriver.exe");
			d=new EdgeDriver();
			d.get("http://www.brm.tremplintech.in/web_pages/ord_reg.aspx");
			
		}
    
	
	}
	
	public static void sleep(int s) throws InterruptedException {
		Thread.sleep(s);
	}
	public static void user(WebElement element , String value) {
		element.sendKeys(value);
	}
	
	public static void pass(WebElement element , String value) {
		element.sendKeys(value);
	}
	
	public static void login(WebElement element) {
		element.click();
	}
	public static void supp(WebElement element) {
		element.click();
	}
	public static void drop(WebElement element,String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(value);
			
		} else {
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
				
			} else {
				if(option.equalsIgnoreCase("index")) {
					s.selectByIndex(Integer.parseInt("value"));
				}

			}

		}
	}
	
		}
