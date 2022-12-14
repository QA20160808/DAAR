package jana.pom.com;

import javax.annotation.Signed;

import org.checkerframework.checker.signature.qual.SignatureBottom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends LoginPage{

	public CustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	/**************************************************************
	 * DATE : Nov 02, 200
	 * Build Version :10.32.13.0
	 * @author Ishant Kushwah
	 * TS POM : Customer Classic 360
	 *
	 *
	 ****************************************************************/
	
	@FindBy(id="TxtName")
	public static WebElement txt_username;
	 
	@FindBy(id="TxtPassword")
	public static WebElement txt_password;
	 
	@FindBy(id="remember")
	public static WebElement chk_remember;
	 
	@FindBy(xpath="//input[@name='command']")
	public static WebElement btn_login;
	
	@FindBy(xpath="//div[@id='topnavdiv']//li[3]//div[1]//div[1]//a[1]")
	public static WebElement icn_sales;
	
	@FindBy(xpath="//span[@title='Accounts']")
	public static WebElement icn_accounts;
	
	@FindBy(xpath="//span[@title='FATCA Details']")
	public static WebElement tab_fatcadetails;
	
	@FindBy(xpath="//li[3]/span/span")
	public static WebElement tab_address;
	
	@FindBy(xpath="//span[@title='KYC Details']")
	public static WebElement tab_kycdetails;
	
	@FindBy(xpath="//span[@title='Family Details']")
	public static WebElement tab_familydetails;
	
	@FindBy(xpath="//span[@title='Related Accounts']")
	public static WebElement tab_releastedaccount;
	
	@FindBy(xpath="//span[@title='Attachments']")
	public static WebElement tab_attachments;
	
	@FindBy(xpath="xpath=//li[8]/span")
	public static WebElement tab_cases;
	
	//---------------------CUSTOMER SEARCH ------------------------------
	
	/**************************************************************
	 * DATE : Nov 02, 200
	 * Build Version :10.32.13.0
	 * @author Ishant Kushwah
	 * TS POM : Search Customer
	 *
	 *
	 ****************************************************************/
	
	@FindBy(xpath="//li[2]/div/div/a")
	public static WebElement hover_quicklink;
	
	@FindBy(xpath="//span[contains(.,'Customer Search - Individual')]")
	public static WebElement hover_Customersearch;
	
	@FindBy(name="100000000")
	public static WebElement txt_searchCustomerIC_URN_SmartCardNo;
	
	@FindBy(name="100000002")
	public static WebElement txt_searchpan;
	
	@FindBy(name="100000001")
	public static WebElement txt_searchclientName;
	
	@FindBy(xpath="//a[@class='acd-btn acd-btn--brand mh-12 ']")
	public static WebElement btn_searchfecthbtn;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/span[1]")
	public static WebElement clk_firstrecord;
	
	
	/**************************************************************
	 * DATE : Nov 02, 200
	 * Build Version :10.32.13.0
	 * @author Ishant Kushwah
	 * TS POM : Validation on Customer 360 classic page
	 *
	 *
	 ****************************************************************/
	
	@FindBy(xpath="//span[@title='PickList Test 01']")
	public static WebElement rib_customername;
	
	@FindBy(xpath="//a[@title='New Case']//span[@class='acd-btn-circle__icon']")
	public static WebElement btn_newCase;
	
	@FindBy(xpath="//div[2]/a/span")
	public static WebElement btn_enquiry;
	
	@FindBy(xpath="//div[5]/a/i")
	public static WebElement icn_switch;
	
}
