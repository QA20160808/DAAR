package jana.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Hemant Sharma 07-02-2022
 *
 */

public class Logout extends LoginPage {

	public Logout(WebDriver driver) {
		super(driver);
		// Auto generated constructor stub
	}

	@FindBy(xpath = "//div[contains(normalize-space(@class),'header__item header__profile ht-3 mid relative pointer')]")
	public static WebElement profileicon;


	// Logout
	@FindBy(xpath = "//a[@title='Logout']")
	public static WebElement logoutbttn;

}
