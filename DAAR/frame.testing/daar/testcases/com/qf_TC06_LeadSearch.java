package daar.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import qf.appmethods.com.LeadsMethods;
import qf.pom.com.Leads;
import qf.repository.com.LeadData;
import qf.repository.com.Properties;
import qf.utility.com.Log;

//Extend class where we has been defined all methods
public class qf_TC06_LeadSearch extends LeadsMethods {

	@Test
	public void qf_leadsearch() throws Exception {
		login.qf_login();
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("---Lead Search Process Start---");

		Log.info("Step 1 : Click on Quick Link");
		Assert.assertTrue(Leads.nav_quciklink.isDisplayed(), "Failed :No Quick link found !!!");
		click_quicklink();
		common.takeSnapShot("Lead", "QuickLink.png");

		Log.info("Step2 : Click on Lead Search");
		Assert.assertTrue(Leads.nav_leadsearch.isDisplayed(), "Failed: Lead search is not found !!!!");
		click_leadsearch();
		common.takeSnapShot("Lead", "LeadSearch.png");

		Log.info("Step3 : Enter Lead ID");
		Assert.assertTrue(Leads.text_leadidtobesearched.isDisplayed(), "Failed : Lead ID Field is not found");
		Assert.assertTrue(Leads.text_leadidtobesearched.isEnabled(), "Failed : Lead Id filed is not found enabled");
		enter_leadIDtobesearched(LeadData.leadsearchID);
		Assert.assertEquals(Leads.text_leadidtobesearched.getAttribute("value"), LeadData.leadsearchID);
		Log.info("Entered Lead id found as :" + " " + Leads.text_leadidtobesearched.getAttribute("value"));
		common.takeSnapShot("Lead", "LeadsearchID.png");

		Log.info("Step4 : Click on Search Button");
		Assert.assertTrue(Leads.btn_leadsearch.isDisplayed(), "Failed : Lead Search Button is not found !!!!");
		click_search();
		common.takeSnapShot("Lead", "SearchButton.png");
		refres_page();

		Log.info("Step5 : Enter Mobile Number for search");
		Assert.assertTrue(Leads.text_leadmobiletobesearched.isDisplayed(),
				"Failed : Mobile Number field is not found !!!");
		Assert.assertTrue(Leads.text_leadmobiletobesearched.isEnabled(),
				"Failed : Mobile number field is not found enabled !!!!");
		enter_leadmobiletobesearched(LeadData.leadsearchmobile);
		Log.info("Mobile Number Enter as" + "  " + Leads.text_leadmobiletobesearched.getAttribute("value"));
		common.takeSnapShot("Lead", "MobileNumberField.png");

		Log.info("Step6 : Click on Search Button");
		Assert.assertTrue(Leads.btn_leadsearch.isDisplayed(), "Failed : Lead Search Button is not found !!!!");
		click_search();
		common.takeSnapShot("Lead", "LeadSearchbyMobilenumber.png");
		refres_page();

		Log.info("Step7: Enter Email address for lead search");
		Assert.assertTrue(Leads.text_leademailtobesearched.isDisplayed(),
				"Failed : Email Address field is not found !!!");
		Assert.assertTrue(Leads.text_leademailtobesearched.isEnabled(),
				"Failed : Email address field is not found enabled !!!!");
		enter_leademailtobesearched(LeadData.leadsearchemail);
		Log.info("Email address enter as :" + " " + (Leads.text_leademailtobesearched.getAttribute("value")));
		common.takeSnapShot("Lead", "EnterEmailAddress.png");

		Log.info("Step8 : Click on Search Button");
		Assert.assertTrue(Leads.btn_leadsearch.isDisplayed(), "Failed : Lead Search Button is not found !!!!");
		click_search();
		common.takeSnapShot("Lead", "LeadSearchbyemailaddress.png");
		refres_page();

		Log.info("Step 9 : Enter National ID For search ");
		Assert.assertTrue(Leads.text_leadnationalidtobesearched.isDisplayed(),
				"Failed : National ID Field is not found on layout ");
		Assert.assertTrue(Leads.text_leadnationalidtobesearched.isEnabled(),
				"Failed : National Filed is not found enabled");
		enter_leadnationalID(LeadData.leadsearchNationalID);
		Log.info("National ID enter as :" + " " + Leads.text_leadnationalidtobesearched.getAttribute("value"));
		common.takeSnapShot("Lead", "EnterNationalID.png");

		Log.info("Step 10 : Click on Search Button for national ID Search");
		Assert.assertTrue(Leads.btn_leadsearch.isDisplayed(), "Failed : Lead Search Button is not found !!!!");
		click_search();
		common.takeSnapShot("Lead", "LeadSearchbynationalID.png");
		refres_page();

		Log.info("Step 11 : Enter IQAMA For Lead Search ");
		Assert.assertTrue(Leads.text_leadIQAMAtobesearched.isDisplayed(),
				"Failed : IQAMA Field is not found on layout");
		Assert.assertTrue(Leads.text_leadIQAMAtobesearched.isEnabled(), "Failed : IQAMA Field is not found enabled ");
		enter_leadleadIQAMAtobesearched(LeadData.leadsearchIQAMA);
		Log.info("Entred IQAMA is : " + Leads.text_leadIQAMAtobesearched.getAttribute("value"));
		common.takeSnapShot("Lead", "Entered IQAMA for Lead Search.png");

		Log.info("Step 11 : Click on Search Button for IQAMA Search");
		Assert.assertTrue(Leads.btn_leadsearch.isDisplayed(), "Failed : Lead Search Button is not found !!!!");
		click_search();
		common.takeSnapShot("Lead", "LeadSearchbynationalID.png");
		refres_page();
		
		Log.endTestCase("--Lead Search Porcess End--");

	}
}
