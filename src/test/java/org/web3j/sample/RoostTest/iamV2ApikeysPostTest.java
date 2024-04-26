// ********RoostGPT********
/*
Test generated by RoostGPT for test roost-test using AI Type Open AI and AI Model gpt-4-1106-preview

Test generated for /iam/v2/api-keys_post for http method type POST in rest-assured framework

RoostTestHash=6c248cd11d


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

public class iamV2ApikeysPostTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @BeforeEach
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      String[] envVarsList = {""};
      envList = dataloader.load("src/test/java/org/web3j/sample/RoostTest/iam_v2_api-keysPostTest.csv", envVarsList);
    }

  
    @Test  
    public void iamV2ApikeysPost_Test() throws JSONException {
        this.setUp();
        Integer testNumber = 1;
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = (testData.get("BASE_URL") != null && !testData.get("BASE_URL").isEmpty()) ? testData.get("BASE_URL"): "https://api.confluent.cloud";  
  
                Response responseObj = given()
				.contentType(ContentType.JSON)
				.body("{\n"+
")
				.header("Authorization", "Bearer " + testData.get("basic"))
                .when()
                .post("/iam/v2/api-keys")  
                .then() 
                .extract().response(); 
              JsonPath response;
              String contentType = responseObj.getContentType();

              System.out.printf("Test Case %d: iamV2ApikeysPost_Test \n", testNumber++);
              System.out.println("Request: POST /iam/v2/api-keys");
              System.out.println("Status Code: " + responseObj.statusCode());
              if (testData.get("statusCode") != null) {
                String statusCodeFromCSV = testData.get("statusCode");
                if (statusCodeFromCSV.contains("X")) {
                  MatcherAssert.assertThat(
                      "Expected a status code of category " + statusCodeFromCSV + ", but got "
                          + Integer.toString(responseObj.statusCode()) + " instead",
                      Integer.toString(responseObj.statusCode()).charAt(0), equalTo(statusCodeFromCSV.charAt(0)));
                } else {
                  MatcherAssert.assertThat(
                      Integer.toString(responseObj.statusCode()), equalTo(statusCodeFromCSV));
                }
              } 
              				else if(Integer.toString(responseObj.statusCode()).charAt(0) != '5'){
      List<Integer> expectedStatusCodes = Arrays.asList(202,400,401,402,403,409,422,429);
				MatcherAssert.assertThat(responseObj.statusCode(), is(in(expectedStatusCodes)));
          }
				String stringifiedStatusCode = "";
        switch(responseObj.statusCode()){
        
          case 202:
            stringifiedStatusCode = "202";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 400:
            stringifiedStatusCode = "400";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 401:
            stringifiedStatusCode = "401";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 402:
            stringifiedStatusCode = "402";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 403:
            stringifiedStatusCode = "403";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 409:
            stringifiedStatusCode = "409";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 422:
            stringifiedStatusCode = "422";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
    }

      switch(Integer.toString(responseObj.statusCode()).charAt(0)){
      
          case '5':
            stringifiedStatusCode = "5XX";
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
         
                if(stringifiedStatusCode == "202"){					System.out.println("Description: An API Key is being created.");
				}
if(stringifiedStatusCode == "400"){					System.out.println("Description: Bad Request");
      
              if (response.get("errors") != null) {        
                  for (int i = 0; i < response.getList("errors").size(); i++) {      
              if (response.get("errors["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("errors["+ i +"].id").length(), lessThanOrEqualTo(255));
  
          }
      
              if (response.get("errors["+ i +"].status") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].status"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].code"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].title") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].title"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].detail") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].detail"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source") != null) {      
              if (response.get("errors["+ i +"].source.pointer") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.pointer"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source.parameter") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.parameter"), instanceOf(String.class));  
          }
  
          }
      
              if (response.get("errors["+ i +"].error_code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].error_code"), instanceOf(Integer.class));  
          }
      
              if (response.get("errors["+ i +"].message") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].message"), instanceOf(String.class));  
          }
        
                    }    
                MatcherAssert.assertThat(response.getList("errors"), instanceOf(List.class));
  
          }
				}
if(stringifiedStatusCode == "401"){					System.out.println("Description: The request lacks valid authentication credentials for this resource.");
      
              if (response.get("errors") != null) {        
                  for (int i = 0; i < response.getList("errors").size(); i++) {      
              if (response.get("errors["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("errors["+ i +"].id").length(), lessThanOrEqualTo(255));
  
          }
      
              if (response.get("errors["+ i +"].status") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].status"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].code"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].title") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].title"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].detail") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].detail"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source") != null) {      
              if (response.get("errors["+ i +"].source.pointer") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.pointer"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source.parameter") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.parameter"), instanceOf(String.class));  
          }
  
          }
      
              if (response.get("errors["+ i +"].error_code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].error_code"), instanceOf(Integer.class));  
          }
      
              if (response.get("errors["+ i +"].message") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].message"), instanceOf(String.class));  
          }
        
                    }    
                MatcherAssert.assertThat(response.getList("errors"), instanceOf(List.class));
  
          }
				}
if(stringifiedStatusCode == "402"){					System.out.println("Description: The request would exceed one or more quotas.");
      
              if (response.get("errors") != null) {        
                  for (int i = 0; i < response.getList("errors").size(); i++) {      
              if (response.get("errors["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("errors["+ i +"].id").length(), lessThanOrEqualTo(255));
  
          }
      
              if (response.get("errors["+ i +"].status") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].status"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].code"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].title") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].title"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].detail") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].detail"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source") != null) {      
              if (response.get("errors["+ i +"].source.pointer") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.pointer"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source.parameter") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.parameter"), instanceOf(String.class));  
          }
  
          }
      
              if (response.get("errors["+ i +"].error_code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].error_code"), instanceOf(Integer.class));  
          }
      
              if (response.get("errors["+ i +"].message") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].message"), instanceOf(String.class));  
          }
        
                    }    
                MatcherAssert.assertThat(response.getList("errors"), instanceOf(List.class));
  
          }
				}
if(stringifiedStatusCode == "403"){					System.out.println("Description: The access credentials were considered insufficient to grant access");
      
              if (response.get("errors") != null) {        
                  for (int i = 0; i < response.getList("errors").size(); i++) {      
              if (response.get("errors["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("errors["+ i +"].id").length(), lessThanOrEqualTo(255));
  
          }
      
              if (response.get("errors["+ i +"].status") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].status"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].code"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].title") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].title"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].detail") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].detail"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source") != null) {      
              if (response.get("errors["+ i +"].source.pointer") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.pointer"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source.parameter") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.parameter"), instanceOf(String.class));  
          }
  
          }
      
              if (response.get("errors["+ i +"].error_code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].error_code"), instanceOf(Integer.class));  
          }
      
              if (response.get("errors["+ i +"].message") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].message"), instanceOf(String.class));  
          }
        
                    }    
                MatcherAssert.assertThat(response.getList("errors"), instanceOf(List.class));
  
          }
				}
if(stringifiedStatusCode == "409"){					System.out.println("Description: The request is in conflict with the current server state");
      
              if (response.get("errors") != null) {        
                  for (int i = 0; i < response.getList("errors").size(); i++) {      
              if (response.get("errors["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("errors["+ i +"].id").length(), lessThanOrEqualTo(255));
  
          }
      
              if (response.get("errors["+ i +"].status") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].status"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].code"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].title") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].title"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].detail") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].detail"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source") != null) {      
              if (response.get("errors["+ i +"].source.pointer") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.pointer"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source.parameter") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.parameter"), instanceOf(String.class));  
          }
  
          }
      
              if (response.get("errors["+ i +"].error_code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].error_code"), instanceOf(Integer.class));  
          }
      
              if (response.get("errors["+ i +"].message") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].message"), instanceOf(String.class));  
          }
        
                    }    
                MatcherAssert.assertThat(response.getList("errors"), instanceOf(List.class));
  
          }
				}
if(stringifiedStatusCode == "422"){					System.out.println("Description: Validation Failed");
      
              if (response.get("errors") != null) {        
                  for (int i = 0; i < response.getList("errors").size(); i++) {      
              if (response.get("errors["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("errors["+ i +"].id").length(), lessThanOrEqualTo(255));
  
          }
      
              if (response.get("errors["+ i +"].status") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].status"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].code"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].title") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].title"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].detail") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].detail"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source") != null) {      
              if (response.get("errors["+ i +"].source.pointer") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.pointer"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source.parameter") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.parameter"), instanceOf(String.class));  
          }
  
          }
      
              if (response.get("errors["+ i +"].error_code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].error_code"), instanceOf(Integer.class));  
          }
      
              if (response.get("errors["+ i +"].message") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].message"), instanceOf(String.class));  
          }
        
                    }    
                MatcherAssert.assertThat(response.getList("errors"), instanceOf(List.class));
  
          }
				}
if(stringifiedStatusCode == "429"){					System.out.println("Description: Rate Limit Exceeded");
				}
if(stringifiedStatusCode == "5XX"){					System.out.println("Description: Oops, something went wrong!");
      
              if (response.get("errors") != null) {        
                  for (int i = 0; i < response.getList("errors").size(); i++) {      
              if (response.get("errors["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("errors["+ i +"].id").length(), lessThanOrEqualTo(255));
  
          }
      
              if (response.get("errors["+ i +"].status") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].status"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].code"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].title") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].title"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].detail") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].detail"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source") != null) {      
              if (response.get("errors["+ i +"].source.pointer") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.pointer"), instanceOf(String.class));  
          }
      
              if (response.get("errors["+ i +"].source.parameter") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].source.parameter"), instanceOf(String.class));  
          }
  
          }
      
              if (response.get("errors["+ i +"].error_code") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].error_code"), instanceOf(Integer.class));  
          }
      
              if (response.get("errors["+ i +"].message") != null) {  
                MatcherAssert.assertThat(response.get("errors["+ i +"].message"), instanceOf(String.class));  
          }
        
                    }    
                MatcherAssert.assertThat(response.getList("errors"), instanceOf(List.class));
  
          }
				}


            }  
    }
}
