package jana.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import jana.appmethods.com.CustomerMethods;
import jana.pom.com.CustomerPage;
import jana.reposirty.com.CustomerData;
import jana.reposirty.com.LoginData;
import jana.utility.com.Log;

public class Jana_TC02_Customer extends CustomerMethods {

	@Test
	public static void SearchCustomer() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Start Test case Jana_Cust-TC01- Customer Search");

//		enterUsername(LoginData.username);
//		enterPassword(LoginData.password);
//		click_LoginButton();

		Log.info("Step 1 : Open Customer Search Screen");
		common.ImplicityWait(40);
		openCustomerSearch();
		// Assert.assertTrue(CustomerPage.txt_searchpan.isDisplayed(), "Failed :
		// Customer Search Screen Not Opened !!!");
		searchCustomer("Number", "AllCase-Raksh-09");

		Log.info("Step 2 :Click on Fetch Button");
		clickSearchFetchbutton();
		//common.waitforelement(30, CustomerPage.tab_address);
		//Assert.assertTrue(CustomerPage.tab_address.isDisplayed(), "Failed :Customer Homepage Not opened !!!!");

		Log.endTestCase("--TestCase Jana_Cust-TC02- Customer Search--");

	}

	@Test
	public static void clickontabs() throws IOException {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Start Test case Jana_Cust-TC02- Validate Tabs on Customer 360s");
		
		Log.info("Step1 : Switch to Classic View..");
		Assert.assertTrue(CustomerPage.icn_switch.isDisplayed(), "Failed : Switch Button is not found !!!");
		clkswitchbtn();
		common.takeSnapShot("Customer360", "customerclassicview.png");
		
		Log.info("Step 2 : Click on Fataca Details");
		common.waitforelement(60, CustomerPage.tab_fatcadetails);
		Log.info("Step 1 : Validate FatcaDetails is displayed for Customer ");
		Assert.assertTrue(CustomerPage.tab_fatcadetails.isDisplayed(), CustomerData.tabnotdisplayed("fatacadetails"));
		clickonfatcatab();
		common.takeSnapShot("Customer360", "fatcatab.png");
		
		Log.info("Step 3 : Click on Address Tab");
		common.waitforelement(60, CustomerPage.tab_address);
		Assert.assertTrue(CustomerPage.tab_address.isDisplayed(), CustomerData.tabnotdisplayed("Address"));
		clickonaddresstab();
		common.takeSnapShot("Customer360", "address.png");
		
		Log.info("Step 4: Click on KYC Details");
		common.waitforelement(60, CustomerPage.tab_kycdetails);
		Assert.assertTrue(CustomerPage.tab_kycdetails.isDisplayed(), "Failed : KYC Tab is not found !!!");
		clickonkycdetails();
		common.takeSnapShot("Customer360", "KYC.png");
		
		Log.info("Step 5 : CLick on Family Details");
		common.waitforelement(30, CustomerPage.tab_familydetails);
		Assert.assertTrue(CustomerPage.tab_familydetails.isDisplayed(), "Failed : Failmy Detail Tab is not found !!!");
		clickonfamilydetails();
		common.takeSnapShot("Customer360", "familydetails.png");
		
		Log.info("Step 6 : CLick on Related Account");
		common.waitforelement(60, CustomerPage.tab_releastedaccount);
		Assert.assertTrue(CustomerPage.tab_releastedaccount.isDisplayed(), "Failed : Failmy Detail Tab is not found !!!");
		clickonrelatedaccount();
		common.takeSnapShot("Customer360", "relatedaccount.png");
		
		Log.info("Step 7 : CLick on Attachment");
		common.waitforelement(60, CustomerPage.tab_attachments);
		Assert.assertTrue(CustomerPage.tab_attachments.isDisplayed(), "Failed : Failmy Detail Tab is not found !!!");
		clickonattachments();

	}
}
