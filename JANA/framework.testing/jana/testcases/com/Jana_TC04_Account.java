package jana.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import jana.appmethods.com.AccountMethods;
import jana.pom.com.AccountPage;
import jana.reposirty.com.LoginData;
import jana.utility.com.Log;

public class Jana_TC04_Account extends AccountMethods{
  
	@Test
	public static void SearchAccountByNumber() {
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("--TestCase for Open Account Search Page----");
		
		Log.info("Step 1 : Go to Quick Link");
		opeAccountSearch();
		
		Log.info("Step 2 : Enter Account Number to search");
		common.waitforelement(60, AccountPage.txt_accno);
		Assert.assertTrue(AccountPage.txt_accno.isDisplayed(),"Failed : Account Number Field is not found !!");
		searchByAccountNumber("8999090000006104");
		clickSearchFetchbutton();
		
		
	}
}
