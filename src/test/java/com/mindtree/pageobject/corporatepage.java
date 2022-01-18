package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.corporateui;
import com.mindtree.utility.Logs;

public class corporatepage {
	
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log ;
	corporateui corporate;
	
	public corporatepage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	
	public void clickoncorporate() throws WebDriverHelperException {
		log = loggerUtil.createLog("CorporateCarRental.java");
		helper.clickButton(corporateui.service);
		
		helper.switchHandles(1);
		helper.applicationWait(1000);
	}

	public void cname(String string) throws WebDriverHelperException{
		helper.sendText(corporateui.name, string);
		helper.applicationWait(1000);
		log.info("name");
	}
	public void companyname(String string) throws WebDriverHelperException {
	helper.sendText(corporateui.company, string);
	helper.applicationWait(1000);
	log.info("comapny");
	}
	public void cemail(String string) throws WebDriverHelperException {
		
	helper.sendText(corporateui.email, string);
	helper.applicationWait(1000);
	log.info("email");
	}
	
	public void cphone(String string) throws WebDriverHelperException{
	helper.sendText(corporateui.phone, string);
	helper.applicationWait(1000);
	log.info("Phone no");
	}
	
	public void sele(String string) throws  WebDriverHelperException {
		helper.select(corporateui.vol, string);
		helper.applicationWait(1000);
		log.info("Volumn selected");
	}
	public void submit() throws WebDriverHelperException {
		helper.actionClick(corporateui.account);
		log.info("Submit button clicked");
	}
	public void validate(String string) throws WebDriverHelperException {
		helper.applicationWait(5000);
		String s = helper.getText(corporateui.text);
		if(s.contains(s)) {
			log.info("text validates");
		}
	}
	
}


