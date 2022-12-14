package jana.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import jana.appmethods.com.CustomerMethods;
import jana.appmethods.com.LoginMethod;
import jana.pom.com.LoginPage;
import jana.reposirty.com.LoginData;
import jana.utility.com.Log;



public class Jana_TC01_Login extends LoginMethod {
  
	@Test
	public void LoginPageintosystem() throws IOException {
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Starting of MetLifeBD_TC01_LoginPage");
		
		common.ImplicityWait(30000);
		Assert.assertTrue(LoginPage.txt_username.isDisplayed(), "Failed : LoginPage Screen not found !!!");
		common.takeSnapShot("LoginPage", "bd_LoginPage.png");

		Log.info("MetLifeBD_TC01_LoginPage - Step 1 - Enter LoginPageID");
		Assert.assertTrue(LoginPage.txt_username.isEnabled(), "Failed : Username Field is not found enable on Layout!!!");
		enterUsername(LoginData.username);
		
		common.ImplicityWait(30000);
		Log.info("Username Entred as :" + "" + LoginData.username);
		common.takeSnapShot("LoginPage", "jana.tc01_login.png");

		Log.info("MetLifeBD_TC01_LoginPage - Step 2 - Enter LoginPagePassword");
		Assert.assertTrue(LoginPage.txt_password.isDisplayed(), "Failed : Password field is not found on layout !!!! ");
		Assert.assertTrue(LoginPage.txt_password.isEnabled(),
				"Faield : Password field is not found enabled on layout !!!");
		
		enterPassword(LoginData.password);
		common.ImplicityWait(30000);
		Log.info("Password Entred as" + "" + LoginData.password);
		common.takeSnapShot("LoginPage", "Password.png");

		Log.info("MetLifeBD_TC01_LoginPage - Step 3 - Click on LoginPage Button");
		Assert.assertTrue(LoginPage.btn_Login.isDisplayed(), "Failed : LoginPage Button is not found on screen !!!!");
		click_LoginButton();
		
	//	CustomerMethods.openCustomerSearch();
		
		common.ImplicityWait(30000);
		common.takeSnapShot("LoginPage", "jana.summarypage.png");
		Log.endTestCase("---END---");
	}
}
