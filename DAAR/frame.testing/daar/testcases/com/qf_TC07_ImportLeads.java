package daar.testcases.com;

import org.testng.annotations.Test;

import qf.appmethods.com.LeadsMethods;
import qf.repository.com.LeadData;
import qf.repository.com.Properties;

public class qf_TC07_ImportLeads extends LeadsMethods{
	
	
	@Test
	public void qf_import() throws Exception 
	{
		login.qf_login();
		
		click_leadmodule();
		common.ExplicityWait(50000);//added for screenshot as loading is showing
		common.takeSnapShot(driver, Properties.qf_newimport_actionbutton);
		click_newimportlead();
		common.ExplicityWait(50000);//added for screenshot as loading is showing
		common.takeSnapShot(driver, Properties.qf_newimport_uploadpage);
		importleads();
		common.takeSnapShot(driver, Properties.qf_newimport_logsummary);
		common.scrolldown();
		click_cancel();
		click_home();
		//Update Lead At Inprogress status from New
		click_leadmodule();
		click_arrowinleadview();
		select_leadview(LeadData.CampainsLeadView);
		click_searchiconunderleadview();
		select_searchbyfield(LeadData.LeadToBeSearchInView);
		enter_leadidinsearchby(firstimportedleadID);
		common.takeSnapShot(driver, Properties.qf_newimport_searchednewleadinview);
		click_searchedlead();
		common.takeSnapShot(driver, Properties.qf_newimport_newleaddetailpage);
		common.scrolldown();
		click_editlead();
		common.scrolldown();
		select_leadstatus(LeadData.leadstatusinprogress);
		common.takeSnapShot(driver, Properties.qf_newimport_updateleadstatusinprogress);
		click_leadsave();
		//After updation validate lead status as inprogress
		validate_leadasinprogress();
		common.takeSnapShot(driver, Properties.qf_newimport_updatedinprogressleaddetailpage);
		//Update lead from Closed status from inprogress
		click_leadmodule();
		click_arrowinleadview();
		select_leadview(LeadData.CampainsLeadView);
		click_searchiconunderleadview();
		select_searchbyfield(LeadData.LeadToBeSearchInView);
		enter_leadidinsearchby(firstimportedleadID);
		common.takeSnapShot(driver, Properties.qf_newimport_searchedupdatedinprogressleadinview);
		click_searchedlead();
		common.scrolldown();
		click_editlead();
		common.scrolldown();
		select_leadstatus(LeadData.leadstatusclosed);
		common.takeSnapShot(driver, Properties.qf_newimport_updateleadstatusclosed);
		click_leadsave();
		//After updation validate lead status as Closed
		validate_leadasclosed();
		common.takeSnapShot(driver, Properties.qf_newimport_updatedclosedleaddetailpage);
		//After updation closed lead should be shown in respective view
		click_leadmodule();
		click_arrowinleadview();
		select_leadview(LeadData.CampainsLeadView);
		click_searchiconunderleadview();
		select_searchbyfield(LeadData.LeadToBeSearchInView);
		enter_leadidinsearchby(firstimportedleadID);
		common.takeSnapShot(driver, Properties.qf_newimport_searchedupdatedclosedleadinview);
		click_searchedlead();
	}
}
