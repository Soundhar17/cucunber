package com.test;

import org.testng.annotations.Test;

import com.base.medibase;
import com.main.medimain;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class medirunner extends medibase {
	
	medimain s;
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  user(s.getUsername(),"jason@gmail.com");
	  pass(s.getPassword(),"password");
	  login(s.getClick());
	  wait(3000);
	  death(s.getDeathre());
	  wait(3000);
	  birth(s.getBirth());
	  wait(3000);
	  windowhandle();
	  wait(3000);
	  addbirth(s.getAddbir());
	  wait(3000);
	  windowhandles();
	  wait(3000);
	  child(s.getName(),"ravi");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  browserlaunch("chrome");
	  s=new medimain(d);
  }

  @AfterClass
  public void afterClass() {
  }

}
