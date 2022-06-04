package restAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	
	@Test
	public void test1() {
		
		
		RestAssured.baseURI = "http://localhost:3000/employees";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \r\n"
				+ "    \"name\": \"Rahul\",\r\n"
				+ "    \"salary\": \"5000\"\r\n"
				+ "}")
		.post("/create");
		
		String ResponseBody = response.getBody().asString();
		System.out.println(ResponseBody);
		
		int ResponseCode = response.getStatusCode();
		Assert.assertEquals(ResponseCode, 201);
		
		JsonPath Jpath = response.jsonPath();
		   Jpath.get("id");
		System.out.println("id"+Jpath.get("id"));
		//Assert.assertEquals(Id.values();
		
		
	}

}
