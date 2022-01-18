package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.outstationui;
import com.mindtree.utility.Logs;

public class outstationpageobject {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	outstationui outui;
	public outstationpageobject() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	
	
	public void clickonoutstation() throws WebDriverHelperException {
		log = loggerUtil.createLog("outstationpageobject.java");
		helper.clickButton(outstationui.outstation);
		helper.switchHandles(1);
		log.info("clickedonoutstation");
	}
	public void clickoneway()
	{
		helper.radiobutton(outstationui.oneradio,0);
		log.info("clickedononeway");
	}
	public void roundtrip()
	{
		helper.radiobutton(outstationui.oneradio,1);
		log.info("clickedonroundtrip");
	}
	
	public void fromcityname(String s) throws WebDriverHelperException, InterruptedException
	{
		
	helper.sendText(outstationui.fromcity,s);
	Thread.sleep(5000);
	helper.clickButton(outstationui.fromcityclick);
	log.info("cityentered");
	}
	public void tocityname(String s) throws WebDriverHelperException, InterruptedException
	{
		
	helper.sendText(outstationui.tocity,s);
	Thread.sleep(1000);
	helper.clickButton(outstationui.tocityclick);
	log.info("tocityentered");
	}
	public void roundtocityname(String s) throws WebDriverHelperException, InterruptedException
	{
		
	helper.sendText(outstationui.tocity,s);
	Thread.sleep(1000);
	helper.clickButton(outstationui.roundtocity);
	log.info("roundcityname");
	}
	
	public void date(String s1,String s2) throws InterruptedException
	{
		helper.selectdate(outstationui.calender,outstationui.dmonth,outstationui.Month,outstationui.date,s1,s2);
		log.info("clickedondate");
	}
	
	public void returndate(String s1,String s2) throws InterruptedException
	{
		helper.selectdate(outstationui.calender2,outstationui.dmonth2,outstationui.Month,outstationui.date,s1,s2);
		log.info("clickedonreturndate");
	}
	
	public void time(String s) {
		helper.select(outstationui.time,s);
		log.info("clickedontime");
		
	}
	public void selectcarbutton() throws WebDriverHelperException {
		helper.clickButton(outstationui.selectbutton);
		log.info("clickedonselectcar");
	}
	public void firstcarselect() throws InterruptedException, WebDriverHelperException {
		Thread.sleep(5000);
		helper.clickButton(outstationui.selectcar);
		log.info("clickedonfirstcar");
	}
	public void validate() throws WebDriverHelperException {
		  
		   String Actual = helper.getText(outstationui.price);
			   log.info("the booked car price " +Actual);
	   }
	}

	


