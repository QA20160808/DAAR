package jana.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnquiryPage extends LoginPage {

	public EnquiryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@data-autoid='cust_551_ctrl']")
	public static WebElement txt_CustomerName;

	@FindBy(xpath = "//input[@data-autoid='cust_328_ctrl']")
	public static WebElement txt_Mobile;

	@FindBy(xpath = "//input[@data-autoid='cust_330_ctrl']")
	public static WebElement txt_Email;

	@FindBy(name = "CASE_SUBCATEGORY")
	public static WebElement src_type;

	@FindBy(xpath = "//td")
	public static WebElement src_typeselect;

	@FindBy(xpath ="//input[@name='CASE_SUBCATEGORY1']")
	public static WebElement src_subtype;

	@FindBy(xpath = "//td")
	public static WebElement src_subtypeselect;

	@FindBy(name = "CASE_PRODUCT")
	public static WebElement src_product;

	@FindBy(xpath = "//td")
	public static WebElement src_productselect;

	@FindBy(xpath = "//select[@data-autoid='cust_365_ctrl']")
	public static WebElement drp_producttype;

	@FindBy(name = "cust_313")
	public static WebElement src_casereason;

	@FindBy(xpath = "//td")
	public static WebElement src_casereasonselect;

	@FindBy(xpath = "//input[@data-autoid='cust_735_ctrl']")
	public static WebElement txt_otherreason;

	@FindBy(xpath = "//input[@data-autoid='CASE_SUBJECT_ctrl']")
	public static WebElement txt_Subject;

	@FindBy(xpath = "//textarea[@data-autoid='cust_130_ctrl']")
	public static WebElement txt_Description;

	@FindBy(xpath = "//select[@data-autoid='cust_766_ctrl']")
	public static WebElement pck_Priority;

	@FindBy(xpath = "//a[@data-autoid='FlowNext']")
	public static WebElement btn_savenproceed;
	
	@FindBy(xpath="//li[5]/div/div/a/i")
	public static WebElement icn_cases;
	
	@FindBy(xpath="//span[@title='Cases']")
	public static WebElement lnk_cases;
	
	@FindBy(xpath="//div/div/div/div/a/i")
	public static WebElement hvr_newbtn;
	
	@FindBy(linkText="Enquiry")
	public static WebElement lnk_eqniry;
	
	@FindBy(xpath="//input[@data-autoid='cust_787_ctrl']")
	public static WebElement pck_accountType;
	
	@FindBy(xpath="//tr[8]/td")
	public static WebElement sel_accounttype;
	
	@FindBy(xpath="//div[@id='object-action-button']/a[3]/span/i")
	public static WebElement btn_closebutton;
	
	@FindBy(xpath="//button")
	public static WebElement btn_okbtn;
	
	@FindBy(xpath="//div[@title='Cases']")
	public static WebElement val_lbl_case;
	
	
	
	
}
