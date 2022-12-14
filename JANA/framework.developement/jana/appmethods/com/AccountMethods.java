package jana.appmethods.com;

import jana.pom.com.AccountPage;
import jana.pom.com.CustomerPage;

public class AccountMethods extends LoginMethod {

	public static void opeAccountSearch() {

//		Actions act = new Actions(driver);
//		act.moveToElement(
		common.waitforelement(60, CustomerPage.hover_quicklink);
		AccountPage.hvr_qlink.click();

		common.waitforelement(80, AccountPage.links_accountSearch);
		AccountPage.links_accountSearch.click();

	}

	public static void searchByAccountNumber(String AccountNumber) {

		AccountPage.txt_accno.sendKeys(AccountNumber);
	}

	public static void clickSearchFetchbutton() {
		
		common.waitforelement(30, AccountPage.src_search);
		AccountPage.src_search.click();
		
		
	}
	
	

}
