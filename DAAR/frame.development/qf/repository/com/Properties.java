package qf.repository.com;

import qf.connection.com.CommonMethods;
//import qf.connection.com.Sceanrios;

public interface Properties {
	
	//qf_TC01_Login login = new qf_TC01_Login();
	CommonMethods common = new CommonMethods();//initialization of Class where common methods has been defined
	//String chromepaths ="D:\\Projects\\Automation\\Drivers\\Chrome\\chromedriver.exe";
	String chromepaths ="D:\\Workspace\\DAAR\\chromedriver.exe";
	String chormeDriver="webdriver.chrome.driver";
	String webSiteURL= "https://dsgdev.crmnext.com/SAG/app/login/login";  
	//variables to take screenshot for Login
	
	String directory ="D:\\GITHUB\\Quara_Finance\\TestResults\\QF\\";
	
}
