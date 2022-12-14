package jana.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public  LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "TxtName")
	public static WebElement txt_username;

	
	@FindBy(xpath = "//input[@id='TxtPassword']")
	public static WebElement txt_password;


	@FindBy(xpath = "//input[@name='command']")
	public static WebElement btn_Login;

}
