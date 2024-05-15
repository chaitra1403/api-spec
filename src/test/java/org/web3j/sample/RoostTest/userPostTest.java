// ********RoostGPT********
/*
Test generated by RoostGPT for test roost-test using AI Type Open AI and AI Model gpt-4-1106-preview

Test generated for /user_post for http method type POST in rest-assured framework

RoostTestHash=f3cdc17687


*/

// ********RoostGPT********
package org.web3j.sample.RoostTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.Arrays;

public class userPostTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @BeforeEach
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      String[] envVarsList = {""};
      envList = dataloader.load("src/test/java/org/web3j/sample/RoostTest/userPostTest.csv", envVarsList);
    }

  
    @Test  
    public void userPost_Test() throws JSONException {
        this.setUp();
        Integer testNumber = 1;
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = (testData.get("BASE_URL") != null && !testData.get("BASE_URL").isEmpty()) ? testData.get("BASE_URL"): "https://petstore3.swagger.io/api/v3";  
  
                Response responseObj = given()
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"id\": \"" + (testData.get("id") != null ? testData.get("id") : "") + "\",\n" +
					"  \"username\": \"" + (testData.get("username") != null ? testData.get("username") : "") + "\",\n" +
					"  \"firstName\": \"" + (testData.get("firstName") != null ? testData.get("firstName") : "") + "\",\n" +
					"  \"lastName\": \"" + (testData.get("lastName") != null ? testData.get("lastName") : "") + "\",\n" +
					"  \"email\": \"" + (testData.get("email") != null ? testData.get("email") : "") + "\",\n" +
					"  \"password\": \"" + (testData.get("password") != null ? testData.get("password") : "") + "\",\n" +
					"  \"phone\": \"" + (testData.get("phone") != null ? testData.get("phone") : "") + "\",\n" +
					"  \"userStatus\": \"" + (testData.get("userStatus") != null ? testData.get("userStatus") : "") + "\n" +
 				"}")
                .when()
                .post("/user")  
                .then() 
                .extract().response(); 
              JsonPath response;
              String contentType = responseObj.getContentType();

              System.out.printf("Test Case %d: userPost_Test \n", testNumber++);
              System.out.println("Request: POST /user");
              System.out.println("Status Code: " + responseObj.statusCode());
              if (testData.get("statusCode") != null) {
                MatcherAssert.assertThat(responseObj.statusCode(),
                    equalTo(Integer.parseInt(testData.get("statusCode"))));
              }
             else{
                 List<Integer> expectedStatusCodes = Arrays.asList(default);
              MatcherAssert.assertThat(responseObj.statusCode(), is(in(expectedStatusCodes)));
                 }
              
        switch(responseObj.statusCode()){
        
          case default:
         
           MatcherAssert.assertThat(contentType, equalTo("application/json"));
           break;
        
    }
      
              if (contentType.contains("application/xml") || contentType.contains("text/xml")) {
                String xmlResponse = responseObj.asString();
                JSONObject jsonResponse = XML.toJSONObject(xmlResponse);
                JSONObject jsonData = jsonResponse.getJSONObject("xml");
                String jsonString = jsonData.toString();
                response = new JsonPath(jsonString);
        
              } else if(contentType.contains("application/json")){  
                response = responseObj.jsonPath(); 
              } else {
                System.out.println("Response content type found: "+contentType+", but RoostGPT currently only supports the following response content types: application/json,text/xml,application/xml");
                continue;
              }
         
                if (responseObj.statusCode() == default) {
					System.out.println("Description: successful operation");
      
              if (response.get("id") != null) {  
                MatcherAssert.assertThat(response.get("id"), instanceOf(Integer.class));  
          }
      
              if (response.get("username") != null) {  
                MatcherAssert.assertThat(response.get("username"), instanceOf(String.class));  
          }
      
              if (response.get("firstName") != null) {  
                MatcherAssert.assertThat(response.get("firstName"), instanceOf(String.class));  
          }
      
              if (response.get("lastName") != null) {  
                MatcherAssert.assertThat(response.get("lastName"), instanceOf(String.class));  
          }
      
              if (response.get("email") != null) {  
                MatcherAssert.assertThat(response.get("email"), instanceOf(String.class));  
          }
      
              if (response.get("password") != null) {  
                MatcherAssert.assertThat(response.get("password"), instanceOf(String.class));  
          }
      
              if (response.get("phone") != null) {  
                MatcherAssert.assertThat(response.get("phone"), instanceOf(String.class));  
          }
      
              if (response.get("userStatus") != null) {  
                MatcherAssert.assertThat(response.get("userStatus"), instanceOf(Integer.class));  
          }
				}


            }  
    }
}