package com.mindtree.uistore;

import org.openqa.selenium.By;

public class AirportPageUI {

	public static By airport = By.xpath(".//*[@href='/airport-taxi']");
	public static By from = By.xpath(".//*[@id='fromCityList']");
	public static By fromclick = By.xpath(".//*[@class='ngb-highlight ng-star-inserted']");
	public static By drop = By.xpath(".//*[@id='search_places']");
	public static By destclick = By.xpath("(.//li[@class='ng-star-inserted'])[5]");
	
	public static By time = By.xpath(".//*[@id='pickUpTime']");
	public static By carprice =By.xpath(".//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div[1]/span");
	public static By select = By.xpath(".//*[@class='book-button btn']");
	//public static By select = By.xpath(".//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[5]/div/button");
	public static By selectfirstcar = By.xpath(".//*[@class='selectFareDetailsBlock']");
	//public static By selectfirstcar = By.xpath(".//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[1]/div/div[4]/div/button");
	public static By trip = By.xpath(".//*[@formcontrolname=\"frmLocalSubTripType\"]");
	public static By booking =By.xpath(".//*[@class='discountPrice']");
	public static By calender =By.xpath("//*[@class=\'ng-tns-c75-1 form-control p-inputtext p-component ng-star-inserted\']");
		
	public static By dMonth =By.xpath(".//*[@class='p-datepicker-title ng-tns-c75-1']");
	public static By Month =By.xpath("//*[@class=\'p-datepicker-next-icon pi pi-chevron-right ng-tns-c75-12']");
	public static By date =By.xpath(".//tbody[@class='ng-tns-c75-1']/tr/td");
}
