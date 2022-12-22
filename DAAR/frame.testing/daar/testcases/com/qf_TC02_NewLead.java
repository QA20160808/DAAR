package daar.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import daar.utility.com.Log;
import graphql.Assert;
import qf.appmethods.com.LeadsMethods;
import qf.pom.com.Leads;
import qf.repository.com.LeadData;
import qf.repository.com.Properties;


//Extend class where we has been defined all methods
public class qf_TC02_NewLead extends LeadsMethods {
	@Test
	public void qf_newlead() throws Exception {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("---New Lead creation Process Start---");
		
		enter_textLoginID(LeadData.loginid);
		enter_textLoginPassowrd(LeadData.loginpassowrd);
		click_LoginButton();

		Assert.assertTrue(Leads.nav_LeadModule.isDisplayed());
		Log.info("Naviagte to Lead Module");
		click_leadmodule();
//		//common.takeSnapShot("Lead", "LeadModule.png");
//		
//		Assert.assertTrue(Leads.icon_new.isDisplayed());
//		Log.info("Click on Add New Button");
		click_leadiconnew();
//		//common.takeSnapShot("Lead", "Addnewbutton.png");
//		
//		Assert.assertTrue(Leads.dropdown_leadsalutation.isEnabled());
//		select_leadsalutaion(LeadData.leadsalutaion);
//		Log.info("Select Lead Salutaion :"+"  "+Leads.dropdown_leadsalutation.getAttribute("value"));
//		
//		Assert.assertTrue(Leads.text_leadfirstname.isDisplayed());
//		enter_leadfirstname(LeadData.leadfirstnamenewstatus);
//		Log.info("Lead FirstName entered as :"+"  "+Leads.text_leadfirstname.getAttribute("value"));
//		
//		enter_leadmiddlename(LeadData.leadmiddlename);
//		enter_leadlastname(LeadData.leadlastname);
//		enter_leaddob();
//		select_leadgender(LeadData.leadgender);
//		enter_leadmobile(LeadData.leadmobile);
//		select_leadnationality(LeadData.leadnationality);
//		enter_leadcity(LeadData.leadcity);
//		select_leadschemaname(LeadData.leadschemaname);
//		select_leadrating(LeadData.leadrating);
//		select_leadstatus(LeadData.leadstatusnew);
//		select_leademaploymenttype(LeadData.leademaploymenttype);
//		enter_leadmonthlysalary(LeadData.leadmonthlysalary);
//		enter_leadloanamount(LeadData.leadloanamount);
//		select_leadtypeoffinance(LeadData.leadtypeoffinance);
//		select_leadanyexistingloan(LeadData.leadanyexistingloan);
//		enter_leadremarks(LeadData.leadremarks);
//		select_leadproductsubtype(LeadData.leadproductsubtype);
//		click_leadsave();
//		//common.takeSnapShot("Lead","Newleadcreated");
//		Log.endTestCase("--New Lead Creation Process End---");
		
//
//	    driver.findElement(By.cssSelector(".icon-obj6")).click();
//	    driver.findElement(By.cssSelector(".page-title__icon")).click();
//	    driver.findElement(By.cssSelector(".relative > .field-mandatory > .picker-icon")).click();
//	    driver.findElement(By.cssSelector(".crm-grid-row:nth-child(5) .react-grid-Cell:nth-child(1) span > div")).click();
//	    driver.findElement(By.name("LE_MOBILE")).click();
//	    driver.findElement(By.name("LE_MOBILE")).sendKeys("97677766777");
//	    driver.findElement(By.xpath("//input[@name='cust_713']")).click();
//	    driver.findElement(By.xpath("//input[@name='cust_713']")).sendKeys("India");
//	    driver.findElement(By.xpath("//td[contains(.,'India - 91')]")).click();
//	    driver.findElement(By.name("LASTNAME")).sendKeys("sdfgh");
//	    driver.findElement(By.name("cust_684")).click();
//	    {
//	      WebElement dropdown = driver.findElement(By.name("cust_684"));
//	      dropdown.findElement(By.xpath("//option[. = 'Individual']")).click();
//	    }
//	    driver.findElement(By.cssSelector(".acd-btn:nth-child(2) > .ff-regular")).click();
//	    driver.findElement(By.cssSelector(".close-icon > .icon")).click();
//	    driver.findElement(By.cssSelector(".icon-edit")).click();
//	    driver.findElement(By.cssSelector("#\\31 > .ml2")).click();
		
		enterMobileCountry();
		enterMobileNumber(common.mobilenumber());
		enetrLastName("Load");
		selectCustomer();
		clicksaveandprocessed();
		common.scrolldown();
		clicknewEditbutton();
		selReadytobuy();
		clicksaveandprocessed();

	}
}
