package daar.testcases.com;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import qf.appmethods.com.api_Login;




public class Daar_TC_05_API_UnitSelection extends api_Login{
	
	
  @Test
  public void f() throws JsonGenerationException, JsonMappingException, IOException {
	  getPost();
	  genratedToken();
	  
	  
  }
}
