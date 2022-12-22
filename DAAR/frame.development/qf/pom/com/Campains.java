package qf.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//Extend loginPage class as PageFactory and driver has been defined there only
public class Campains extends LoginPage {
	
	public Campains(WebDriver driver)
	{
		super(driver);
		//Auto generated constructor stub
	}
	//Locator to Click on Campains Module
	@FindBy(xpath="//i[@class='icon icon-obj11']")
	public static WebElement nav_CampainModule;
	//Locator to Click on +New icon to create compains
	@FindBy(xpath="//i[@class='page-title__icon icon icon-new f13 brand mh-6']")
	public static WebElement icon_newcamp;
	//Locator to Enter CAMPAIGN NAME
	@FindBy(xpath="//input[@name='CAMP_NAME']")
	public static WebElement text_campainname;
	//Locator to Enter CAMPAIGN CODE
	@FindBy(xpath="//input[@name='CAMP_CODE']")
	public static WebElement text_campaincode;
	//Locator to Select PRODUCT SUBTYPE
	@FindBy(xpath="//input[@name='CAMP_PRODUCTCATEGORY']")
	public static WebElement picker_campainproductsubtype;
	//Locator to Select SCHEME NAME
	@FindBy(xpath="//select[@name='CAMP_PRODUCT']")
	public static WebElement dropdown_campainschemename;
	//Locator to Click Save button to create CAMPAIGN
	@FindBy(xpath="//span[normalize-space()='Save']")
	public static WebElement btn_campainsave;
}
