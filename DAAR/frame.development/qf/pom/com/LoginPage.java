package qf.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Enter userID
	@FindBy(xpath="//input[@id='TxtName']")
	public static WebElement text_username;
	//Enter Password
	@FindBy(xpath="//input[@id='TxtPassword']")
	public static WebElement text_password;
	//Click on Login
	@FindBy(xpath="//input[@name='command']")
	public static WebElement btn_Login;

}
