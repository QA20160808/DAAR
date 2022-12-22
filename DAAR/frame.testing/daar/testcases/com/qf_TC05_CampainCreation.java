package daar.testcases.com;

import org.testng.annotations.Test;

import qf.appmethods.com.CampainsMethods;
import qf.repository.com.CampainData;
//Extend class where we has been defined all methods
public class qf_TC05_CampainCreation extends CampainsMethods{
  @Test
  public void qf_campains() throws Exception
  {
	  click_campainmodule();
	  common.takeSnapShot("Campaign", "Campaign1.png");
	  click_campainicon();
	  
	  common.takeSnapShot("Campaign", "Campaign2.png");
	  enter_campainname(CampainData.campainname);
	  
	  common.takeSnapShot("Campaign", "Campaign3.png");
	  enter_campaincode(CampainData.campaincode);
	  
	  common.takeSnapShot("Campaign","Campaign4.png");
	  common.scrolldown();
	  
	  select_campainproductsubtype(CampainData.campainsubtype);
	  common.takeSnapShot("Campaign", "Campaign5.png");
	  
	  select_campainschemename(CampainData.campainschemename);
	  common.takeSnapShot("Campaign", "Campaign6.png");
	  
	  click_campainsave();
	  common.takeSnapShot("Campaign","Campaign7.png");
  }
}
