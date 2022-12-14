package jana.appmethods.com;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import jana.pom.com.CustomerPage;

public class CustomerMethods extends LoginMethod {

	public static void clickonAccounticon() {

		CustomerPage.icn_accounts.click();
	}

	public static void openCustomerSearch() {

//		Actions act = new Actions(driver);
//		act.moveToElement(
		common.waitforelement(60,CustomerPage.hover_quicklink);
		CustomerPage.hover_quicklink.click();
		
		common.waitforelement(80,CustomerPage.hover_Customersearch);
		CustomerPage.hover_Customersearch.click();

	}

	public static void searchCustomer(String SearchType, String SearcValue) {

		try {
			if (SearchType.equalsIgnoreCase("PAN")) {
				
				common.waitforelement(30, CustomerPage.txt_searchpan);

				CustomerPage.txt_searchpan.sendKeys(SearcValue);
			} else {

				if (SearchType.equalsIgnoreCase("Name")) {
					common.waitforelement(60, CustomerPage.txt_searchclientName);
					
					CustomerPage.txt_searchclientName.sendKeys(SearcValue);
				} else {

					if (SearchType.equalsIgnoreCase("Number")) {
						
						common.waitforelement(60, CustomerPage.txt_searchCustomerIC_URN_SmartCardNo);
						Assert.assertTrue(CustomerPage.txt_searchCustomerIC_URN_SmartCardNo.isDisplayed(), "Failed : Field is not found !!");
						CustomerPage.txt_searchCustomerIC_URN_SmartCardNo.sendKeys(SearcValue);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception

		}
	}
	
	public static void clickSearchFetchbutton() {
		
		CustomerPage.btn_searchfecthbtn.click();
		common.waitforelement(30, CustomerPage.clk_firstrecord);
		CustomerPage.clk_firstrecord.click();
	}
	
	public static void clickonfatcatab() {
		
		CustomerPage.tab_fatcadetails.click();
	}
	
	public static void clickonaddresstab() {
		
		CustomerPage.tab_address.click();
	}
	
	public static void clickonkycdetails() {
		
		CustomerPage.tab_kycdetails.click();
	}
	
	public static void clickonfamilydetails() {
		
		CustomerPage.tab_familydetails.click();
	}
	
	public static void clickonrelatedaccount() {
		CustomerPage.tab_releastedaccount.click();
	}
	
	public static void clickonattachments() {
		CustomerPage.tab_attachments.click();
	}
	
	public static void clickonrelcases() {
		CustomerPage.tab_attachments.click();
	}
	
	public static void clickonnewjourney() {
		
		CustomerPage.btn_newCase.click();
	}
	
	public static void clickNewEqnuriyPage() {
		
		CustomerPage.btn_enquiry.click();
		
	}
	
	public static void clkswitchbtn() {
		
		CustomerPage.icn_switch.click();
	}
	
	
	
}
