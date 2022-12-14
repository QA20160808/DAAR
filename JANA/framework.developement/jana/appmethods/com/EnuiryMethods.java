package jana.appmethods.com;

import java.util.LinkedList;

import org.apache.poi.hpsf.Array;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import jana.pom.com.AccountPage;
import jana.pom.com.EnquiryPage;
import jana.reposirty.com.EnquiryData;
import jana.utility.com.ReadExcelDemo;

public class EnuiryMethods extends LoginMethod {

	public static void clickoncaseicon() {

		Actions act = new Actions(driver);
		act.moveToElement(EnquiryPage.icn_cases).build().perform();
		EnquiryPage.icn_cases.click();
//		common.waitforelement(30, EnquiryPage.lnk_cases);
//		EnquiryPage.lnk_cases.click();

	}

	public static void opencasehomepage() {

		Actions act = new Actions(driver);
		act.moveToElement(EnquiryPage.hvr_newbtn).build().perform();
		common.waitforelement(30, EnquiryPage.lnk_eqniry);
		EnquiryPage.lnk_eqniry.click();

	}

	public static void openEnquiryCreationpage() {

		Actions act = new Actions(driver);
		act.moveToElement(EnquiryPage.hvr_newbtn).build().perform();
		EnquiryPage.lnk_eqniry.click();

	}

	public static void enterCustomerName(String CustomerName) {

		String getCustomerName = EnquiryPage.txt_CustomerName.getAttribute("value");

		if (getCustomerName.equalsIgnoreCase("")) {

			EnquiryPage.txt_CustomerName.sendKeys(CustomerName);
		}

	}

	public static void enterMobileNumber(String mobileNumber) {

		String getMobileNumber = EnquiryPage.txt_Mobile.getAttribute("value");

		if (getMobileNumber.equalsIgnoreCase("")) {

			EnquiryPage.txt_Mobile.sendKeys(mobileNumber);
		}

	}

	public static void enterEmailAddress(String email) {

		String getEmail = EnquiryPage.txt_Email.getAttribute("value");

		if (getEmail.equalsIgnoreCase("")) {

			EnquiryPage.txt_Email.sendKeys(email);
		}

	}

	public static void selectType(String Type) {

		EnquiryPage.src_type.click();
		common.waitforelement(30, EnquiryPage.src_type);
		EnquiryPage.src_type.sendKeys(Type);
		EnquiryPage.src_typeselect.click();

	}

	public static void selectsubType(String subType) {
		common.waitforelement(30, EnquiryPage.src_subtype);
		EnquiryPage.src_subtype.click();

		common.waitforelement(30, EnquiryPage.src_subtype);
		EnquiryPage.src_subtype.sendKeys(subType);
		EnquiryPage.src_subtypeselect.click();

	}

	public static void selectProduct(String product) {

		EnquiryPage.src_product.click();

		common.waitforelement(30, EnquiryPage.src_product);

		EnquiryPage.src_product.sendKeys(product);
		EnquiryPage.src_productselect.click();
	}

	public static void selectCaseReason(String caseReason) {

		EnquiryPage.src_casereason.click();
		common.waitforelement(30, EnquiryPage.src_casereason);
		EnquiryPage.src_casereason.sendKeys(caseReason);
		EnquiryPage.src_casereasonselect.click();

	}

	public static void enterenquirysubject(String subject) {

		EnquiryPage.txt_Subject.sendKeys(subject);
	}

	public static void eneterenquirydescription(String desc) {

		EnquiryPage.txt_Description.sendKeys(desc);
	}

	public static void clicksaveandprocessed() {

		EnquiryPage.btn_savenproceed.click();
	}

	public static void openEnquiryCreationfromCustomer() throws InterruptedException {

		CustomerMethods.clickonnewjourney();
		common.handlechildwindow();
		CustomerMethods.clickNewEqnuriyPage();
		common.moveonmainwin();
	}

	public static void openEnquiryCreationfromAccount() throws InterruptedException {

		AccountPage.btn_accJourney.click();
		common.handlechildwindow();
		common.waitforelement(50, AccountPage.btn_accountEnquiry);
		AccountPage.btn_accountEnquiry.click();
		common.moveonmainwin();
	}
	public static void enteraccountNumber(String number) {

		EnquiryPage.pck_accountType.click();
		common.waitforelement(30, EnquiryPage.pck_accountType);
		EnquiryPage.pck_accountType.sendKeys(number);
		EnquiryPage.sel_accounttype.click();
	}

	public static void closeaEnquiry() {

		common.waitforelement(60, EnquiryPage.btn_closebutton);
		EnquiryPage.btn_closebutton.click();

		common.waitforelement(60, EnquiryPage.btn_okbtn);
		EnquiryPage.btn_okbtn.click();
	}

	public static void validateSubTypeEnquires() {
		common.waitforelement(30, EnquiryPage.src_subtype);
		EnquiryPage.src_subtype.click();

		ReadExcelDemo rd = new ReadExcelDemo();

		String type[] = null;

		for (int i = 0; i <= rd.runMultiData(0).length(); i++) {

			type[i] = rd.runMultiData(0);
			common.waitforelement(30, EnquiryPage.src_subtype);
			EnquiryPage.src_subtype.sendKeys(type[i]);
			EnquiryPage.src_subtypeselect.click();
		}

	}
	
	public static void validateEnqyuirtyFields() {
		
		
	}

}
