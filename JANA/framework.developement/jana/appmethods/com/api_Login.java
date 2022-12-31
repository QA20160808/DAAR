package jana.appmethods.com;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jana.apis.com.LoginAPI;
import jana.connection.com.RestClient;

public class api_Login {
	
	static String responseString;
	
	static RestClient restClient;
	static CloseableHttpResponse closebaleHttpResponse;
	static String barrrertkn;
	
	
	public  static String getPost() throws JsonGenerationException, JsonMappingException, IOException {
		
		
		String url ="https://dsgdev.crmnext.com/restapidarsa/oauth2/token";
		
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		

		
		//jackson API:
		ObjectMapper mapper = new ObjectMapper();
		LoginAPI login = new LoginAPI("Ishant.dr", "acid_qa");
		
		//object to json file:
	//	mapper.writeValue(new File("D:\\Workspace\\Automation\\JANA\\framework.developement\\jana\\apis\\com\\login.json"), login);
		
		//java object to json in String:
		String usersJsonString = mapper.writeValueAsString(login);
		System.out.println(usersJsonString);
		
		closebaleHttpResponse = restClient.post(url, usersJsonString, headerMap); //call the API
		
		mapper.writeValue(new File("D:\\Workspace\\Automation\\JANA\\framework.developement\\jana\\apis\\com\\login.json"), login);
	//	getBareertoken();
		
		// Data Convert From Jason to String. 
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		System.out.println(responseString);
		org.json.simple.JSONObject responseJson = new org.json.simple.JSONObject();
		System.out.println("The response from API is:"+ responseJson);
		
		
		
		
		LoginAPI authentication = mapper.readValue(responseString,LoginAPI.class);
		

		System.out.println(authentication.getAccess_token());
		
		String tokentype =authentication.getToken_type();
		String aut_tkn = authentication.getAccess_token();
		barrrertkn=tokentype+" "+aut_tkn;
		System.out.println("Genreated Token Is :"+" "+ barrrertkn);
		return barrrertkn;
		
		
		
	}
	
	
	public static String genratedToken() {
		
		
		String h =api_Login.barrrertkn;
		//System.out.println(h);
		return h;
	}

}
