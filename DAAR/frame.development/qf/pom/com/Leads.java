package qf.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
//Extend loginPage class as PageFactory and driver has been defined there only
public class Leads extends LoginPage 
{
	public Leads(WebDriver driver)
	{
		super(driver);
		//Auto generated constructor stub
	}
	/*
		WebElemets for Lead Search via Quick Link
	 */
	//web element to click on quick link
	@FindBy(xpath="//i[@class='icon icon-link']")
	public static WebElement nav_quciklink;
	//web element to click on Lead search
	@FindBy(xpath="//span[normalize-space()='Lead Search']")
	public static WebElement nav_leadsearch;
	//web element to enter LeadID
	@FindBy(xpath="//input[@name='10001659']")
	public static WebElement text_leadidtobesearched;
	//web element to enter mobile
	@FindBy(xpath="//input[@name='10001680']")
	public static WebElement text_leadmobiletobesearched;
	//web element to enter email
	@FindBy(xpath="//input[@name='10001606']")
	public static WebElement text_leademailtobesearched;
	//web element to enter national id
	@FindBy(xpath="//input[@name='116']")
	public static WebElement text_leadnationalidtobesearched;
	//web element to enter IQAMA Number
	@FindBy(xpath="//input[@name='117']")
	public static WebElement text_leadIQAMAtobesearched;
	//web element to click on search
	@FindBy(xpath="//span[normalize-space()='Search']")
	public static WebElement btn_leadsearch;

	/*
	WebElemets for Lead Creation
	 */
	//Click on Leads Module
	@FindBy(xpath="//i[@class='icon icon-obj6']")
	public static WebElement nav_LeadModule;
	//Click on +New icon to create lead
	@FindBy(xpath="//a[@title='New']")
	public static WebElement icon_new;
	//Select Lead Salutation and value will be selected in method calling
	@FindBy(xpath="//select[@name='SALUTATION']")
	public static WebElement dropdown_leadsalutation;
	//Enter Lead FirstName
	@FindBy(xpath="//input[@placeholder='First Name']")
	public static WebElement text_leadfirstname;
	//Enter Lead MiddleName
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	public static WebElement text_leadmiddlename;
	//Enter Lead LastName
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public static WebElement text_leadlastname;
	//Select Lead DOB
	@FindBy(xpath="//i[@class='icon icon-calendar']")
	public static WebElement nav_openleadcalendar;
	@FindBy(xpath="//span[@class='navigation-title']")
	public static WebElement nav_leaddobcalendar01;	
	@FindBy(xpath="//span[@class='navigation-title']")
	public static WebElement nav_leaddobcalendar02;	
	@FindBy(xpath="//i[@class='icon icon-arrow-right3 pointer']")
	public static WebElement nav_leaddobcalendar03;	
	@FindBy(xpath="//i[@class='icon icon-arrow-right3 pointer']")
	public static WebElement nav_leaddobcalendar04;
	@FindBy(xpath="//i[@class='icon icon-arrow-right3 pointer']")
	public static WebElement nav_leaddobcalendar05;	
	@FindBy(xpath="//div[normalize-space()='1988']")
	public static WebElement nav_yearfromleadcalendar;		
	@FindBy(xpath="//div[@class='month current cell mid items-center primary']")
	public static WebElement nav_monthfromleadcalendar;		
	@FindBy(xpath="//div[@class='day current cell mid items-center primary']")
	public static WebElement nav_datefromleadcalendar;	
	//Select Lead Gender and value will be selected in method calling
	@FindBy(xpath="//select[@name='LE_GENDER']")
	public static WebElement dropdown_leadgender;
	//Enter Lead Mobile
	@FindBy(xpath="//input[@name='LE_MOBILE']")
	public static WebElement text_leadmobile;
	//Select Lead NATIONALITY and value will be selected in method calling
	@FindBy(xpath="//select[@name='cust_123']")
	public static WebElement dropdown_leadnationality;
	//Enter Lead City
	@FindBy(xpath="//input[@name='cust_231']")
	public static WebElement text_leadcity;
	//Select Lead SCHEME NAME and value will be selected in method calling
	@FindBy(xpath="//select[@name='LE_PRODUCT']")
	public static WebElement dropdown_leadschemename;
	//Select Lead Rating and value will be selected in method calling
	@FindBy(xpath="//select[@name='LE_LEADRATING']")
	public static WebElement dropdown_leadrating;
	//Select Lead status and value will be selected in method calling
	@FindBy(xpath="//select[@name='LE_STATUSCODE']")
	public static WebElement dropdown_leadstatus;
	//Select Lead EMPLOYMENT TYPE and value will be selected in method calling
	@FindBy(xpath="//select[@name='cust_111']")
	public static WebElement dropdown_leademaploymenttype;
	//Enter Lead Monthly Salary
	@FindBy(xpath="//body/div[@id='main']/div[@id='content-side']/div[@class='panelContainer']/div[@class='panelContainer__right']/div[@class='dataContRiight']/div[@id='topTabItems']/div[@class='flexbox-row form-wrapper']/form[@id='Lead-container_Form_6_1']/div[@id='Lead-container']/div[@id='reactmaincontainer']/div[@class='flex-1 mw-100 setupBodyContainer']/div[@class='new-edit']/div[@id='objectWrapper']/div/div[@id='newobject']/div[@class='setupBodyContainer digitalJourneyScroll flowWithNavigation--firstScreen']/div[@class='react-form form form--stylish']/div[@class='layout-container form ']/div[@class='flex composite-layout']/div[@class='pa-8 mainLayoutContent trans-3 grd-col-12']/div[@class='tab-container relative detailtab']/div[@class='tab-content bg-white']/div[@class='sections-container']/div[@class='flexbox-row section-column']/div[@class='flex-item section-column-conainer']/div[@class='section-contents']/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement text_leadmonthlysalary;
	//Enter Lead Loan Amount
	@FindBy(xpath="//input[@value='Ø±.Ø³.â€�0']")
	public static WebElement text_leadloanamount;
	//Select Lead TYPE OF FINANCE and value will be selected in method calling
	@FindBy(xpath="//select[@name='cust_119']")
	public static WebElement dropdown_leadtypeoffinance;
	//Select Lead ANY EXISTING LOAN and value will be selected in method calling
	@FindBy(xpath="//select[@name='cust_120']")
	public static WebElement dropdown_leadanyexistingloan;	
	//Enter Lead REMARKS
	@FindBy(xpath="//textarea[contains(@name,'cust_122')]")
	public static WebElement text_leadremarks;
	//Select product_subtype and operations will be done on method calling
	@FindBy(xpath="//input[@name='LE_PRODUCTCATEGORY']")
	public static WebElement picker_leadproductsubtype;	
	//Click on Save
	@FindBy(xpath="//span[normalize-space()='Save']")
	public static WebElement btn_leadsave;
	/*
	WebElemets for Status Verification
	 */
	//Validate Status as New for assertion and lead process
	@FindBy(xpath="//*[@title='New']")
	public static WebElement lbl_Leadstatusnew;
	//Validate Status as In Progress for assertion and lead process
	@FindBy(xpath="//*[@title='In Progress']")
	public static WebElement lbl_Leadstatusinprogress;
	//Validate Status as New for assertion and lead process
	@FindBy(xpath="//*[@title='Closed']")
	public static WebElement lbl_Leadstatusclosed;
	/*
	WebElemets for To Store UI Lead ID
	 */
	//Fetch LeadID for lead process
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]")
	public static WebElement val_LeadID;
	/*
	WebElemets for Lead Updation from Views
	 */
	//Click on Arrow button as data is not showing in first time
	@FindBy(xpath="//div[@id='home-page']//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//a//i")
	public static WebElement btn_arrowinleadview;
	//Select View from Lead from dropdown
	@FindBy(xpath="//select[@name='QueryViewId']")
	public static WebElement dropdown_LeadView;
	//Click on Search icon as per respective view
	@FindBy(xpath="//i[@class='icon icon-search']")
	public static WebElement icon_searchLeadview;
	//Select SearchBy as Lead ID from search by field from lead view
	@FindBy(xpath="//select[@data-autoid='undefined_ctrl']")
	public static WebElement dropdown_searchby;
	//Enter Lead ID in SearchBy Field
	@FindBy(xpath="//input[@placeholder='Search']")
	public static WebElement text_searchby;
	//Click on Searched lead from lead view
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/span[1]")
	public static WebElement hlink_LeadID;
	//Click on Edit button to update Lead
	@FindBy(xpath="//i[@class='icon icon-edit']")
	public static WebElement btn_editLead;
	/*
	WebElemets for New Import Leads
	 */
	//Click on NewImport Button
	@FindBy(xpath="//span[normalize-space()='New Leads Import']")
	public static WebElement act_btn_newimport;
	//Select csv file via Choose file button
	@FindBy(xpath="//input[@id='m_c_uf']")
	public static WebElement btn_choosefile;
	//Click on Finish button to start uploading
	@FindBy(xpath="//input[@id='m_bs_bf']")
	public static WebElement btn_finish;
	//Click on Click here to navigate on base page to check status to see log summary
	@FindBy(xpath="//a[@id='m_c_lnkDetails']")
	public static WebElement hlink_clickhere;
	//Fetch Import message from Log Summary
	@FindBy(xpath="//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public static WebElement val_importmessage;
	//Fetch New Record from Log Summary
	@FindBy(xpath="//body/div[@id='popupcontainer']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]")
	public static WebElement val_newrecords;
	//Fetch failed records from Log Summary
	@FindBy(xpath="//body/div[@id='popupcontainer']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public static WebElement val_failedrecords;
	//Fetch Total records from Log Summary
	@FindBy(xpath="//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")
	public static WebElement val_totalrecords;
	//Fetch first imported lead status from Log Summary
	@FindBy(xpath="//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]")
	public static WebElement val_firstimportedleadstatus;
	//Fetch Second imported lead status from Log Summary
	@FindBy(xpath="//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]")
	public static WebElement val_secondimportedleadstatus;
	//Fetch First LeadID from Log Summary and Store in String variable as we need to run End to End Process
	@FindBy(xpath="//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
	public static WebElement val_firstleadID;
	//Fetch Second LeadID from Log Summary and Store in String variable as we need to run End to End Process
	@FindBy(xpath="//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")
	public static WebElement val_secondleadID;
	//Click on cancel button
	@FindBy(xpath="//span[@class='acd-btn-circle__icon']")
	public static WebElement btn_cancel;
	//Click on Home Icon
	@FindBy(xpath="//i[@class='icon icon-home user-custom']")
	public static WebElement icon_home;
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(name="LE_MOBILE")
	public static WebElement txt_mobile;
	
	@FindBy(xpath="//input[@name='cust_713']")
	public static WebElement btn_mobileCountry;
	
	@FindBy(xpath="//td")
	public static WebElement sel_mobileCOuntry;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public static WebElement txt_lname;
	
	@FindBy(xpath="//select[@name='cust_684']")
	public static WebElement sel_cusomerType;
	
	@FindBy(xpath="//a[@data-autoid='FlowNext']")
	public static WebElement btn_saveandprocessed;

	@FindBy(xpath="//div[4]/div[2]/a/span")
	public static WebElement btn_NewEdit;
	
	@FindBy(xpath="//select[@name='cust_682']")
	public static WebElement sel_readytobuy;
	
	
}
