package com.mindtree.pageobject;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.homepageui;
import com.mindtree.utility.Logs;

public class homepage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log ;
	homepageui home;
	String ActualTitle;
	String ExpectedCeoName;
	String number;
	
	
	public homepage() {
		
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	
	public void title() {
		log = loggerUtil.createLog("Homepage.java");
		 ActualTitle= helper.title();
	}
	public void validate(String s) {
		 if(ActualTitle.contains(s)) {
			 log.info("validated"+s);
 
		 }
		
	}
	
	public void aboutus() throws WebDriverHelperException {
		log = loggerUtil.createLog("Homepage.java");
		helper.clickButton(homepageui.about);
		helper.applicationWait(3000);
		helper.switchHandles(1);
	}
	public void ceoname(String s) throws WebDriverHelperException {
		helper.applicationWait(3000);
		ExpectedCeoName = helper.getText(homepageui.ceo);
		if(ExpectedCeoName.equals(s)) {
			 log.info("validated"+s);	
		}
		else {
			log.info("notfound");
		}
	}
	
	public void contactus() throws WebDriverHelperException {
		log = loggerUtil.createLog("Homepage.java");
		helper.actionClick(homepageui.contactus);
		helper.applicationWait(1000);
		helper.switchHandles(1);
	}
	public void validatephone(String string) throws WebDriverHelperException {
		helper.applicationWait(3000);
		number=helper.getText(homepageui.phoneno);
		assertEquals(string,number);
			
		
	}
		
	}
	


