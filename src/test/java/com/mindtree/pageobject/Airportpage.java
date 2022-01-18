package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.AirportPageUI;
import com.mindtree.utility.Logs;

public class Airportpage {
	static WebDriverHelper helper;
	static Logs loggerUtil;
	static Logger log;
	static AirportPageUI airpage;

	public Airportpage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	
	  public void airport() throws WebDriverHelperException {
		  log = loggerUtil.createLog("AirportPage.java");
		  helper.applicationWait(5000);
		  helper.javascriptclick(AirportPageUI.airport);
	  
	 } 
	  
	  public void from(String s) throws WebDriverHelperException {  
		  helper.switchHandles(1);
		  helper.applicationWait(1000);
	     helper.sendText(AirportPageUI.from, s); 
	     helper.applicationWait(1000);
	     helper.clickButton(AirportPageUI.fromclick);
	     
	     log.info("fromcitydetailsentered");
	  }
	  

	  public void trip(String s) throws WebDriverHelperException {
	  helper.select(AirportPageUI.trip,s);
	  helper.applicationWait(1000);
	  
	  } 
	  
	  public void dropaddress(String s) throws WebDriverHelperException{
		  
	  helper.clickButton(AirportPageUI.drop);
	  helper.sendText(AirportPageUI.drop, s);
	  helper.applicationWait(1000);
	  helper.clickButton(AirportPageUI.destclick);
	  
	  }
	  
	  public void pickupdate(String s1,String s2) throws InterruptedException, WebDriverHelperException  { 
	   helper.selectdate(AirportPageUI.calender,AirportPageUI.dMonth,AirportPageUI.Month,AirportPageUI.date,s1,s2); 
	   helper.applicationWait(3000); 
	   log.info("Date  selected");
	   }
	  
	 
	public void pickuptime(String s) throws WebDriverHelperException  {
	  helper.clickButton(AirportPageUI.time);
	  helper.select(AirportPageUI.time, s);
	  log.debug("select Pickuptime ");
	 }

	public void selectcarbutton() throws WebDriverHelperException {
		helper.clickButton(AirportPageUI.select);
		log.info("selectcar");
	}

	public void firstcar() throws WebDriverHelperException {
		helper.applicationWait(3000);
		helper.clickButton(AirportPageUI.selectfirstcar);
		log.info("firstcar");
	}

	public void validate() throws WebDriverHelperException {

		String Actualprice = helper.getText(AirportPageUI.booking);
		log.info("Price  : " + Actualprice);
		}

	

	}

