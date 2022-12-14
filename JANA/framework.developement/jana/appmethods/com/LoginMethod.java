package jana.appmethods.com;

import jana.pom.com.LoginPage;
import jana.connection.com.Connection;

public class LoginMethod extends Connection{
	
	
	public static void enterUsername(String username) {
		LoginPage.txt_username.sendKeys(username);
	}

	public static void enterPassword(String password) {
		LoginPage.txt_password.sendKeys(password);
	}

	public static void click_LoginButton() {
		LoginPage.btn_Login.click();
	}
}
