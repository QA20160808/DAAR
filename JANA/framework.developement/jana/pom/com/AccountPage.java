package jana.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends LoginPage {

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Quicklink

	@FindBy(css = ".icon.icon-link")
	public static WebElement hvr_qlink;

	// Account Search link

	@FindBy(xpath = "//span[contains(@class,'sub-menu-list__label sm-list__labelFirst truncate f12 pointer white ttc ff-medium')][normalize-space()='Account Search']")
	public static WebElement links_accountSearch;

	// Search via Account Number

	@FindBy(xpath = "//input[@data-autoid=\"10070528_ctrl\"]")
	public static WebElement txt_accountNo;

	// Search button
	@FindBy(xpath = "//a[@data-autoid=\"Fetch\"]")
	public static WebElement src_search;

	// Account search via Summary

	// Account search tab
	@FindBy(xpath = "//span[@data-autoid='tab_2']")
	public static WebElement tab_AccountSearch;

	@FindBy(xpath = "//input[@data-autoid='10070528_ctrl']")
	public static WebElement txt_accno;

	@FindBy(xpath = "//a[@data-autoid=\"Fetch\"]")
	public static WebElement src_searchBtn;

	// Summary band

	@FindBy(xpath = "//label[@data-autoid=\"HOLDINGNUMBER_lbl\"]")
	public static WebElement lbl_accNumber;

	@FindBy(xpath = "//label[@data-autoid=\"cust_525_lbl\"]")
	public static WebElement lbl_urn;

	@FindBy(xpath = "//label[@data-autoid=\"cust_574_lbl\"]")
	public static WebElement lbl_acOpenDate;

	@FindBy(xpath = "//label[@data-autoid=\"HO_PRODUCTNAME_lbl\"]")
	public static WebElement lbl_productName;

	@FindBy(xpath = "//label[@data-autoid=\"CON_ACCOUNTNAME_lbl\"]")
	public static WebElement lbl_custName;

	@FindBy(xpath = "//span[@data-autoid=\"tab_1\"]")

	// Key Information Tab
	public static WebElement tab_keyInformation;

	// Details section
	@FindBy(xpath = "//label[@data-autoid=\"sec_1_0\"]")

	public static WebElement sec_details;

	// Customer name
	@FindBy(xpath = "//label[@data-autoid='CON_ACCOUNTNAME_lbl']")
	public static WebElement lbl_customerName;

	// Owner ID
	@FindBy(xpath = "//label[@data-autoid='cust_520_lbl']")
	public static WebElement lbl_ownerid;

	// Product category

	@FindBy(xpath = "//label[@data-autoid='HO_PRODUCTCATEGORYNAME_lbl']")
	public static WebElement lbl_productcategory;

	// Product code

	@FindBy(xpath = "//label[@data-autoid='cust_806_lbl']")
	public static WebElement lbl_productcode;

	// Relationships tab
	@FindBy(xpath = "//span[@data-autoid=\"tab_2\"]")
	public static WebElement tab_Realtionships;

	// Customer name

	@FindBy(xpath = "//div[@data-autoid=\"RELATED_RELATIONSHIP_AccountName\"]")
	public static WebElement hdrField_custName;

	// Account Number

	@FindBy(xpath = "//div[@data-autoid=\"RELATED_RELATIONSHIP_RelatedToName\"]")
	public static WebElement hdrField_AccountNo;

	// Relationship

	@FindBy(xpath = "//div[@data-autoid=\"RELATED_RELATIONSHIP_TYU_EX1_7\"]")
	public static WebElement hdrField_Relationship;

	// Related Cards tab

	@FindBy(xpath = "//span[@data-autoid=\"tab_3\"]")
	public static WebElement tab_Relatedcards;

	// customer name hdrField_cardNumber;

	@FindBy(xpath = "//div[@data-autoid='customlist_51_AccountName']")
	public static WebElement hdrField_custname;

	// Card Number

	@FindBy(xpath = "//div[@data-autoid='customlist_51_HoldingNumber']")
	public static WebElement hdrField_cardNumber;

	// Account Number

	@FindBy(xpath = "//div[@data-autoid='customlist_51_HOL_EX1_23']")
	public static WebElement hdrField_accNumber;

	// Related Cases tab

	@FindBy(xpath = "//span[@data-autoid=\"tab_4\"]")
	public static WebElement tab_relatedCases;

	// Related Attachments tab

	@FindBy(xpath = "//span[@data-autoid=\"tab_5\"]")
	public static WebElement tab_relatedAttachments;

	// Nominee tab

	@FindBy(xpath = "//span[@data-autoid=\"tab_6\"]")
	public static WebElement tab_Nominee;

	// New Case button

	@FindBy(xpath = "//a[@data-autoid=\"None_2\"]")
	public static WebElement btn_NewCase;

	// Close button

	@FindBy(xpath = "//a[@data-autoid=\"Close_1\"]")
	public static WebElement btn_Close;
	
	@FindBy(xpath="//span[contains(.,'E')]")
	public static WebElement btn_accountEnquiry;
	
	@FindBy(xpath="//div[@id='object-action-button']/a[2]/span/i")
	public static WebElement btn_accJourney;

}
