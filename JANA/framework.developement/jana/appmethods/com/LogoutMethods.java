package jana.appmethods.com;

import jana.pom.com.Logout;

/**
 *
 * @author Hemant Sharma 07-02-2022
 *
 */

public class LogoutMethods extends LoginMethod {

	public static void ClickProfile() {
		Logout.profileicon.click();
	}

	public static void click_logoutButton() {

		Logout.logoutbttn.click();
	}

}
