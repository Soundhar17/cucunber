package com.test;

import org.testng.annotations.Test;

import com.base.Baseclass;
import com.main.mainclass;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterClass;

public class runner extends Baseclass  {
	String xpath = "C:\\Users\\soundhararaj\\pictures\\POI.xlsx";
	String path =  "C:\\Users\\soundhararaj\\Pictures\\POI 2.xlsx";
	mainclass c;
	
	
  @Test(priority=1)
  public void fvalid() throws InterruptedException, IOException {
	  
	  FileInputStream src = new FileInputStream(xpath);
	  XSSFWorkbook WorkBook = new XSSFWorkbook(src);
	  XSSFSheet Sheet = WorkBook.getSheetAt(0);
	  XSSFCell cell;
	  
	  for (int i = 1; i <2; i++) {
		  
		cell = Sheet.getRow(i).getCell(0);
		
		String user = cell.getStringCellValue();
		username(c.getUser(),user);
		
		cell = Sheet.getRow(i).getCell(1);
		
		String pass = cell.getStringCellValue();
		password(c.getPass(),pass);
		 
	   login(c.getLogin());
	   logout(c.getLogout());
	   
	  }
  }
  @Test(priority=2)
  public void finvalid() throws InterruptedException, IOException {
	  
	  FileInputStream src = new FileInputStream(path);
	  XSSFWorkbook WorkBook = new XSSFWorkbook(src);
	  XSSFSheet Sheet = WorkBook.getSheetAt(0);
	  XSSFCell cell;
	  
	  for (int i = 1; i <5; i++) {
		  
		cell = Sheet.getRow(i).getCell(0);
		
		String user = cell.getStringCellValue();
		username(c.getUser(),user);
		
		cell = Sheet.getRow(i).getCell(1);
		
		String pass = cell.getStringCellValue();
		password(c.getPass(),pass);
		 
	   login(c.getLogin());
	   alert("Accept");
	  }
  }
		   
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  setproperty();
	  c=new mainclass(d);
	  url();	  
	    
	}

  @AfterClass
  public void afterClass() {
	  d.close();	  
	
  }

}
