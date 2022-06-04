package restBDD;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequestBdd {
	
	public void test1() {
		
	
	
	Map<String,Object>MapObj = new HashMap<String,Object>();
	MapObj.put("name","Thomas");
	MapObj.put("salary","6000");
	
	
	RestAssured.given()
    .baseUri("http://localhost:3000/employees")
    .contentType(ContentType.JSON)
    .accept(ContentType.JSON)
    .body(MapObj)
    .when()
    .put("/15")
    .then()
    .log()
   // .status()
    
    .body()
    .statusCode(200)
    .body("name",Matchers.equalTo("Thomas"));
    
	}

}
