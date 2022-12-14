package jana.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import jana.appmethods.com.EnuiryMethods;
import jana.pom.com.EnquiryPage;
import jana.reposirty.com.EnquiryData;
import jana.utility.com.Log;

public class Jana_TC03_Enquiry extends EnuiryMethods {

	@Test
	public static void openenquirypage() throws IOException {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Start Test case Jana_Cust-TC01- OpenEnquiryPage");
		
		Log.info("Step 1 : Click on Case icon");
		common.waitforelement(30, EnquiryPage.icn_cases);
		Assert.assertTrue(EnquiryPage.icn_cases.isDisplayed(), "Failed : Case Object is not found!!");
		clickoncaseicon();
		Assert.assertTrue(EnquiryPage.val_lbl_case.isDisplayed(), "Failed : Case Homepage is not found ");
		common.takeSnapShot("Enquiry", "Step1-casesicon.png");

		Log.info("Step 2 : Open Enquiry Creation page");
		common.waitforelement(30, EnquiryPage.hvr_newbtn);
		openEnquiryCreationpage();
		Assert.assertTrue(EnquiryPage.txt_Mobile.isDisplayed(), "Failed :Enquiry Creation page not found !!");
		common.takeSnapShot("Enquiry", "Step2-enquirycreationpage.png");

	}

	@Test
	public static void createNewEnquiry() throws InterruptedException {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Start Test case Jana_Cust-TC02- OpenEnquiryPage");

		Log.info("Step 1 : Enter Customer Name");
		Assert.assertTrue(EnquiryPage.txt_CustomerName.isDisplayed(), "Failed :Customer Name Field is not Found on UI");
		enterCustomerName("CustomerName");

		Log.info("Step2 : Enter Mobile Number");
		Assert.assertTrue(EnquiryPage.txt_Mobile.isDisplayed(),
				"Failed : Customer Mobile Number Field is not found !!!");
		enterMobileNumber("97677666");

		Log.info("Step3 : Enteer Email Address ");
		Assert.assertTrue(EnquiryPage.txt_Email.isDisplayed(),
				"Failed: Customer Email Address Field is not found !!! ");
		enterEmailAddress("abcs@mail.com");

//	  Log.info("Step4: Enter Enquiry Type " );
//	  Assert.assertTrue(EnquiryPage.src_type.isDisplayed(),"Failed : Type field is not found !! " );
//	  selectType("Card");

		Log.info("Ste5 : Select Enquiry Subtype");
		Assert.assertTrue(EnquiryPage.src_subtype.isDisplayed(), "Failed : Enquiry Subtype field is not found !!!");
		selectsubType("fghj");
		System.out.println(EnquiryData.ssc);

		common.scrolldown();

		Log.info("Ste6 : Select Enquiry case Reason");
		Assert.assertTrue(EnquiryPage.src_casereason.isDisplayed(),
				"Failed : Enquiry case reason field is not found !!!");
		selectCaseReason("Banking");

		Log.info("Ste6 : Select Product");
		Assert.assertTrue(EnquiryPage.src_product.isDisplayed(), "Failed : Enquiry case reason field is not found !!!");
		selectProduct("Agri Loan Mitrata");

		Log.info("Step7 : Enter Subject For enquiry");
		Assert.assertTrue(EnquiryPage.src_casereason.isDisplayed(), "Failed : Enquiry subject field is not found !!!");
		eneterenquirydescription("sdfg");

		Log.info("Step 8 : Enter Desciption of enquiry");
		Assert.assertTrue(EnquiryPage.txt_Description.isDisplayed(), "Failed : Descrption filed is not found !!");
		enterenquirysubject("sdfgh");

		Log.info("Step 9 : Enter Desciption of enquiry");
		Assert.assertTrue(EnquiryPage.btn_savenproceed.isDisplayed(), "Failed : Click on save and processed ");
		clicksaveandprocessed();

	}

	@Test
	public static void createEnquiryFromCustomer360() throws InterruptedException {

		common.scrolldown();

		openEnquiryCreationfromCustomer();
		common.moveonmainwin();
		common.waitforelement(30, EnquiryPage.src_subtype);

		Log.info("Step5 : Select Enquiry Subtype");

		selectsubType(EnquiryData.ssc);
		//validateSubTypeEnquires();
		System.out.println(EnquiryData.ssc);
		common.scrolldown();

		enteraccountNumber("8999");
		
		Log.info("Step 8 : Enter Desciption of enquiry");
		Assert.assertTrue(EnquiryPage.txt_Description.isDisplayed(), "Failed : Descrption filed is not found !!");
		enterenquirysubject("sdfgh");
		
		Log.info("Step7 : Enter Subject For enquiry");
		Assert.assertTrue(EnquiryPage.src_casereason.isDisplayed(), "Failed : Enquiry subject field is not found !!!");
		eneterenquirydescription("sdfg");
		
		Log.info("Step 9 : Enter Desciption of enquiry");
		Assert.assertTrue(EnquiryPage.btn_savenproceed.isDisplayed(), "Failed : Click on save and processed ");
		clicksaveandprocessed();
		
		
		
		

	}
	@Test
	public static void closeEnquirybydetails() {
		
		Log.info("Step 10 : Click on Enquiry Close Button");
		Assert.assertTrue(EnquiryPage.btn_closebutton.isDisplayed(), "Failed : Enquiry Closed button not found !!!");
		closeaEnquiry();
	}
	
	@Test
	public static void createEnquiryFromHolding() throws InterruptedException {
		
		common.scrolldown();

		openEnquiryCreationfromAccount();
		common.moveonmainwin();
		common.waitforelement(30, EnquiryPage.src_subtype);

		Log.info("Step5 : Select Enquiry Subtype");

		selectsubType(EnquiryData.ssc);
		//validateSubTypeEnquires();
		System.out.println(EnquiryData.ssc);
		common.scrolldown();
		
		
		Log.info("Step7 : Enter Subject For enquiry");
		Assert.assertTrue(EnquiryPage.src_casereason.isDisplayed(), "Failed : Enquiry subject field is not found !!!");
		eneterenquirydescription("sdfg");
		
		Log.info("Step 8 : Enter Desciption of enquiry");
		Assert.assertTrue(EnquiryPage.txt_Description.isDisplayed(), "Failed : Descrption filed is not found !!");
		enterenquirysubject("sdfgh");
		
		Log.info("Step 9 : Enter Desciption of enquiry");
		Assert.assertTrue(EnquiryPage.btn_savenproceed.isDisplayed(), "Failed : Click on save and processed ");
		clicksaveandprocessed();
		
		
		
	}
	
	
	

	
}
