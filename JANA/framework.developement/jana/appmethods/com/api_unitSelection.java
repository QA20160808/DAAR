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
import jana.apis.com.UnitSelectAPI;
import jana.connection.com.RestClient;

public class api_unitSelection {

	static String responseString;

	static RestClient restClient;
	static CloseableHttpResponse closebaleHttpResponse;

	static String token = api_Login.genratedToken();
	static String leadid = "3455";

	public static void postUnitSelect() throws JsonGenerationException, JsonMappingException, IOException {

		String url = "https://dsgdev.crmnext.com/restapidarsa/oauth2/token";

		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		headerMap.put("Authorization", token);

		// Set Request Paramenters
		ObjectMapper mapper = new ObjectMapper();
		UnitSelectAPI unitselection = new UnitSelectAPI(leadid);

		// Call the API
		String usersJsonString = mapper.writeValueAsString(unitselection);
		closebaleHttpResponse = restClient.post(url, usersJsonString, headerMap); // call the API

		mapper.writeValue(
				new File("D:\\Workspace\\Automation\\JANA\\framework.testing\\jana\\utility\\com\\unitSelection.json"),
				unitselection);

		// Data Convert From Jason to String.
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		System.out.println(responseString);
		org.json.simple.JSONObject responseJson = new org.json.simple.JSONObject();
		System.out.println("The response from API is:" + responseJson);

		UnitSelectAPI api_response = mapper.readValue(responseString, UnitSelectAPI.class);

	}

}
