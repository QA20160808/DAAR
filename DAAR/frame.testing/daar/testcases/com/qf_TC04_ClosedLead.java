package daar.testcases.com;

import org.testng.annotations.Test;

import qf.appmethods.com.LeadsMethods;
import qf.repository.com.LeadData;
import qf.repository.com.Properties;

//Extend class where we has been defined all methods
public class qf_TC04_ClosedLead extends LeadsMethods {
	@Test
	public void qf_closedlead() throws Exception {
		click_leadmodule();
		click_leadiconnew();
		select_leadsalutaion(LeadData.leadsalutaion);
		enter_leadfirstname(LeadData.leadfirstnameclosestatus);
		enter_leadmiddlename(LeadData.leadmiddlename);
		enter_leadlastname(LeadData.leadlastname);
		enter_leaddob();
		select_leadgender(LeadData.leadgender);
		enter_leadmobile(LeadData.leadmobile);
		select_leadnationality(LeadData.leadnationality);
		enter_leadcity(LeadData.leadcity);
		select_leadschemaname(LeadData.leadschemaname);
		select_leadrating(LeadData.leadrating);
		select_leadstatus(LeadData.leadstatusclosed);
		select_leademaploymenttype(LeadData.leademaploymenttype);
		enter_leadmonthlysalary(LeadData.leadmonthlysalary);
		enter_leadloanamount(LeadData.leadloanamount);
		select_leadtypeoffinance(LeadData.leadtypeoffinance);
		select_leadanyexistingloan(LeadData.leadanyexistingloan);
		enter_leadremarks(LeadData.leadremarks);
		select_leadproductsubtype(LeadData.leadproductsubtype);
		click_leadsave();
		common.takeSnapShot("Lead", "Closed Lead.png");
		common.close_browser();
	}
}
