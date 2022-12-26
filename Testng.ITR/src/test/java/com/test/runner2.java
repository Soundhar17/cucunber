package com.test;

import org.testng.annotations.Test;

import com.base.base2;
import com.main.main2;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class runner2 extends base2 {
    
	main2 r;
	 
	 
	
  @Test
  public void f() throws InterruptedException {
	user(r.getUsername(),"sylix");
	pass(r.getPassword(),"admin");
	login(r.getButton());
	sleep(5000);
	supp(r.getSupplier());
	sleep(5000);
	drop(r.getState(),"visible text","Kerala");
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  setproperty("edge");
	  r= new main2(d);
	  sleep(5000);
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  d.close();
	 
  }

}
