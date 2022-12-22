package qf.appmethods.com;

import qf.connection.com.Connectivity;
import qf.pom.com.LoginPage;
import qf.connection.com.CommonMethods;
//Class should be abstract also connectivity class should be extended
public abstract class LoginMethods extends Connectivity {
	public static void enter_textLoginID(String username)
	{
		LoginPage.text_username.sendKeys(username);
	}
	public static void enter_textLoginPassowrd(String password)
	{
		LoginPage.text_password.sendKeys(password);
	}
	public static void click_LoginButton() 
	{
	LoginPage.btn_Login.click();	
	}

}
