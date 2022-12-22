package qf.connection.com;

import org.apache.poi.hslf.blip.Metafile.Header;
import org.asynchttpclient.Response;

import io.restassured.RestAssured;

public class RestAPI {
	
	io.restassured.response.Response resp = RestAssured.get("https://dsgdev.crmnext.com/restapidarsa/oauth2/token");
	
	

}
