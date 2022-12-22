package daar.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import daar.utility.com.Log;
import graphql.Assert;
import qf.appmethods.com.LoginMethods;
import qf.pom.com.LoginPage;
import qf.repository.com.LeadData;
import qf.repository.com.Properties;


//Extend class where we has been defined all methods
public class qf_TC01_Login extends LoginMethods {

	@Test
	public void qf_login() throws Exception {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("---Login Process Start---");

		// Enter Username Details
		Assert.assertTrue(LoginPage.text_username.isEnabled());
		enter_textLoginID(LeadData.loginid);
		Log.info("Username Entered as  " + " " + LoginPage.text_username.getAttribute("value"));
		Log.info("Screenshot taken for Username");
		//common.takeSnapShot("Login", "Username.png");

		// Enter Password Details

		Assert.assertTrue(LoginPage.text_password.isEnabled());
		enter_textLoginPassowrd(LeadData.loginpassowrd);
		Log.info("Password entred as" + "   " + LoginPage.text_password.getAttribute("value"));
		Log.info("Screenshot taken for password");
		//common.takeSnapShot("Login", "password.png");

		Assert.assertTrue(LoginPage.btn_Login.isDisplayed());
		Log.info("Click Login Button");
		click_LoginButton();
		//common.takeSnapShot("Login", "Login Success");

		Log.endTestCase("---Login Process End---");
	}

}
