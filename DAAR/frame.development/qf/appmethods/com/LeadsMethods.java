package qf.appmethods.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import qf.pom.com.Leads;
//Class should be abstract also loginMethod class should be extended as connectivity class is already extended by LoginMethod
public abstract class LeadsMethods extends LoginMethods

{ 
	//WebElement should be public static within class instead of methods
	public static WebElement lquicklink;
	public static WebElement lproductsubtype;
	public static WebElement newleadimport;
	public static WebElement upload_file;

	//String variable to store data
	public static String LeadStatus;
	public static String LeadID;
	public static String Leadviewvalue;
//	public static String MainWindow; // It will be initialize in respective method
//	public static String ChildWindow;// It will be initialize in respective method
//	public static Set<String> s1;// It will be initialize in respective method
	public static String importmessage;
	public static String newrecords;
	public static String failedrecords;
	public static String totalrecords;
	public static String importedleadstatus;
	public static String firstimportedleadID;
	public static String secondmportedeadID;

/*
 * Methods for Lead Search
 */
	public static void click_quicklink() throws InterruptedException
	{
		//Actions class will be defined in respective methods
		Actions action = new Actions(driver);
		lquicklink=Leads.nav_quciklink;
		action.moveToElement(lquicklink).perform();
		Thread.sleep(5000);
	}
	public static void click_leadsearch()
	{
		Leads.nav_leadsearch.click();
	}
	public static void enter_leadIDtobesearched(String searchleadID)
	{
		Leads.text_leadidtobesearched.sendKeys(searchleadID);
	}
	public static void enter_leadmobiletobesearched(String searchmobile)
	{
		Leads.text_leadmobiletobesearched.sendKeys(searchmobile);
	}
	public static void enter_leademailtobesearched(String searchemail)
	{
		Leads.text_leademailtobesearched.sendKeys(searchemail);
	}
	public static void enter_leadnationalID(String searchnationalID)
	{
		Leads.text_leadnationalidtobesearched.sendKeys(searchnationalID);
	}
	public static void enter_leadleadIQAMAtobesearched(String IQAMAtobesearched)
	{
		Leads.text_leadIQAMAtobesearched.sendKeys(IQAMAtobesearched);
	}
	public static void click_search() throws InterruptedException
	{
		Leads.btn_leadsearch.click();
		Thread.sleep(5000);
	}
	public static void refres_page()
	{
		driver.navigate().refresh();
	}
	/*
	 * Methods for Lead Creations
	 */
	public void click_leadmodule() throws InterruptedException
	{
		Thread.sleep(5000);
		Leads.nav_LeadModule.click();
	}
	public void click_leadiconnew()
	{
		Leads.icon_new.click();
	}
	public void select_leadsalutaion(String lsalutation)
	{
		new Select(Leads.dropdown_leadsalutation).selectByValue(lsalutation);
	}
	public void enter_leadfirstname(String lfname)
	{
		Leads.text_leadfirstname.sendKeys(lfname);
	}
	public void enter_leadmiddlename(String lmname)
	{
		Leads.text_leadmiddlename.sendKeys(lmname);
	}
	public void enter_leadlastname(String llname)
	{
		Leads.text_leadlastname.sendKeys(llname);
	}
	public void enter_leaddob()
	{
		Leads.nav_openleadcalendar.click();
		Leads.nav_leaddobcalendar01.click();
		Leads.nav_leaddobcalendar02.click();
		Leads.nav_leaddobcalendar03.click();
		Leads.nav_leaddobcalendar04.click();
		Leads.nav_leaddobcalendar05.click();
		Leads.nav_yearfromleadcalendar.click();	
		Leads.nav_monthfromleadcalendar.click();	
		Leads.nav_datefromleadcalendar.click();
	}
	public void select_leadgender(String lgender)
	{
		new Select(Leads.dropdown_leadgender).selectByValue(lgender);
	}
	public void enter_leadmobile(String lmobile)
	{
		Leads.text_leadmobile.sendKeys(lmobile);
	}
	public void select_leadnationality(String lnationality)
	{
		new Select(Leads.dropdown_leadnationality).selectByValue(lnationality);
	}
	public void enter_leadcity(String lcity)
	{
		Leads.text_leadcity.sendKeys(lcity);
	}
	public void select_leadschemaname(String lschemaname)
	{
		new Select(Leads.dropdown_leadschemename).selectByValue(lschemaname);
	}
	public void select_leadrating(String lrating)
	{
		new Select(Leads.dropdown_leadrating).selectByValue(lrating);
	}
	public void select_leadstatus(String lstatus)
	{
		new Select(Leads.dropdown_leadstatus).selectByValue(lstatus);
	}
	public void select_leademaploymenttype(String lemaploymenttype)
	{
		new Select(Leads.dropdown_leademaploymenttype).selectByValue(lemaploymenttype);
	}
	public void enter_leadmonthlysalary(String lmonthlysalary)
	{
		Leads.text_leadmonthlysalary.sendKeys(lmonthlysalary);
	}
	public void enter_leadloanamount(String lloanamount)
	{
		Leads.text_leadloanamount.sendKeys(lloanamount);
	}
	public void select_leadtypeoffinance(String ltypeoffinance)
	{
		new Select(Leads.dropdown_leadtypeoffinance).selectByValue(ltypeoffinance);
	}
	public void select_leadanyexistingloan(String lanyexistingloan)
	{
		new Select(Leads.dropdown_leadanyexistingloan).selectByValue(lanyexistingloan);
	}
	public void enter_leadremarks(String lremarks)
	{
		Leads.text_leadremarks.sendKeys(lremarks);
	}	
	public void select_leadproductsubtype(String lsubtype) throws InterruptedException
	{
		lproductsubtype=Leads.picker_leadproductsubtype;
		lproductsubtype.click();
		lproductsubtype.sendKeys(lsubtype);
		Thread.sleep(2000);
		lproductsubtype.sendKeys(Keys.ARROW_DOWN);
		lproductsubtype.sendKeys(Keys.ENTER);
	}
	public void click_leadsave() throws InterruptedException
	{
		Leads.btn_leadsave.click();
		Thread.sleep(2000);
	}
	/*
	 * Methods for Lead Updation from Respective view
	 */
	public void validate_leadasnew() throws InterruptedException
	{
		LeadStatus=Leads.lbl_Leadstatusnew.getText();
		System.out.println("Lead Status is "+LeadStatus);
		Thread.sleep(2000);
	}
	public void validate_leadasinprogress() throws InterruptedException
	{
		LeadStatus=Leads.lbl_Leadstatusinprogress.getText();
		System.out.println("Lead Status is "+LeadStatus);
		Thread.sleep(2000);
	}
	public void validate_leadasclosed() throws InterruptedException
	{
		LeadStatus=Leads.lbl_Leadstatusclosed.getText();
		System.out.println("Lead Status is "+LeadStatus);
		Thread.sleep(2000);
		
	}
	public void pick_leadid() throws InterruptedException
	{
		LeadID=Leads.val_LeadID.getText();
		System.out.println("Lead Status is "+LeadID);
		Thread.sleep(2000);
		
	}
	public void click_arrowinleadview() throws InterruptedException
	{
		Thread.sleep(5000);
		Leads.btn_arrowinleadview.click();
	}
	public void select_leadview(String lview) throws InterruptedException
	{
		Leadviewvalue=Leads.dropdown_LeadView.getText();
		System.out.println("Lead Views are \n"+Leadviewvalue);
		new Select(Leads.dropdown_LeadView).selectByValue(lview);
		Thread.sleep(5000);
	}
	public void click_searchiconunderleadview()
	{
		Leads.icon_searchLeadview.click();
	}
	public void select_searchbyfield(String lsearchby)
	{
		new Select(Leads.dropdown_searchby).selectByValue(lsearchby);
	}
	public void enter_leadidinsearchby(String lvaluesearchby)
	{
		Leads.text_searchby.sendKeys(lvaluesearchby);
	}
	public void click_searchedlead()
	{
		Leads.hlink_LeadID.click();
	}
	public void click_editlead()
	{
		Leads.btn_editLead.click();
	}

	/*
	 * Methods for Lead Import
	 */
	public void click_newimportlead() throws InterruptedException
	{
		Thread.sleep(5000);
		//Click on New Import Lead
		newleadimport = Leads.act_btn_newimport;
		Actions action = new Actions(driver);
		action.moveToElement(newleadimport).perform();
		newleadimport.click();
	}
	public void importleads() throws InterruptedException
	{
		//Get Parent ID
		String MainWindow = driver.getWindowHandle();
		System.out.println("ID for parent window is "+MainWindow);
		Thread.sleep(5000);
		// To handle all new opened window.				
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();		

		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();	
			System.out.println("Ids for all windows parent and child both "+ChildWindow);

			if(!MainWindow.equalsIgnoreCase(ChildWindow))			
			{    		

				// Switching to Child window and perform all action in child window
				driver.switchTo().window(ChildWindow);
				//Print URL and Title from child window
				System.out.println("Page URL of child window: "+ driver.getCurrentUrl());
				System.out.println("Page title of child window: "+ driver.getTitle());
				//attach csv file via choose file button 
				upload_file = Leads.btn_choosefile;
				upload_file.sendKeys("D:/D/Projects/Automation/Projects/Quara_Finance/TestingData/importfile.csv");
				//Click on Finish button to start uploading
				Leads.btn_finish.click();
				Thread.sleep(10000);
				//Click on click here link to see log summary
				Leads.hlink_clickhere.click();		
			}		
		}		
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
		//Fetch data from Log Summary and Store in String variable
		System.out.println("LogSummary URL : "+ driver.getCurrentUrl());
		System.out.println("LogSummary Title: "+ driver.getTitle());
		importmessage=Leads.val_importmessage.getText();
		System.out.println("Message is "+importmessage );
		newrecords=Leads.val_newrecords.getText();
		System.out.println("NewRecords is "+newrecords );
		failedrecords=Leads.val_failedrecords.getText();
		System.out.println("FailedRecords is "+failedrecords );
		totalrecords=Leads.val_totalrecords.getText();
		System.out.println("TotalRecords is "+totalrecords );
		importedleadstatus=Leads.val_firstimportedleadstatus.getText();
		System.out.println("First ImportedLeadStatus is "+importedleadstatus );
		importedleadstatus=Leads.val_secondimportedleadstatus.getText();
		System.out.println("Second ImportedLeadStatus is "+importedleadstatus );
		//Fetch LeadID from Log Summary and Store in String variable as we need to run End to End Process	
		firstimportedleadID=Leads.val_firstleadID.getText();
		System.out.println("First ImportedLeadID is "+firstimportedleadID );
		secondmportedeadID=Leads.val_secondleadID.getText();
		System.out.println("Second ImportedLeadID is "+secondmportedeadID );
	}
	//Click on cancel button from Import summary
	public void click_cancel() throws InterruptedException
	{
		Thread.sleep(5000);
		Leads.btn_cancel.click();
	}
	//Click on Home button To go back summary
	public void click_home() throws InterruptedException
	{
		Thread.sleep(5000);
		Leads.icon_home.click();
	}
	
	public static void enterMobileCountry() {
		
		Leads.btn_mobileCountry.click();
		//common.waitforelement(30, Leads.sel_mobileCOuntry);
		Leads.btn_mobileCountry.sendKeys("India");
		common.waitforelement(30, Leads.sel_mobileCOuntry);
		Leads.sel_mobileCOuntry.click();
	}
	
	public static void selectCustomer() {
		
		Select customerType =new Select(Leads.sel_cusomerType);
		
		customerType.selectByIndex(1);
		
		
	}
	
	public static void enetrLastName(String lname) {
		
		Leads.txt_lname.sendKeys(lname);
	}
	
	public static void enterMobileNumber(String mobileNumber) {
		
		Leads.txt_mobile.sendKeys(mobileNumber);
	}
	
	public static void clicksaveandprocessed() {
		
		Leads.btn_saveandprocessed.click();
	}
	
	public static void clicknewEditbutton() {
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE);
		common.waitforelement(30, Leads.btn_NewEdit);
		
		Leads.btn_NewEdit.click();
	}
	
	public static void selReadytobuy() {
		
	Select ready= new Select(Leads.sel_readytobuy);
	ready.selectByIndex(1);
	}
}