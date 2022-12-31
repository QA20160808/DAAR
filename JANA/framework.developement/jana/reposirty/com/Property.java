package jana.reposirty.com;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import jana.apis.com.LoginAPI;
import jana.appmethods.com.api_Login;
import jana.connection.com.CommonMethods;
import jana.testcases.com.SampleLoginAPI;

public interface Property {
	
	CommonMethods common = new CommonMethods();
//	Jana_TC05_LoginAPI login = new Jana_TC05_LoginAPI();
	
	String chromeDriver ="webdriver.chrome.driver";
	String chromePath="D:\\Workspace\\Automation\\JANA\\chromedriver.exe";
	String url ="https://jana.crmnextlab.com/appsa/login/login";
	String testingresults ="D:/Workspace/Automation/JANA/ScreenShots";
	String pathurl="/";

	
}
