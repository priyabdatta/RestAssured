package restBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequestBDD {
	@Test
	public void test1() {
		
		
		RestAssured.given()
        .baseUri("http://localhost:3000/employees")
        .when()
        .delete("/15")
        .then()
        .log()
       // .status()
       // .statusCode(200)
         .body();
		
	}

}
