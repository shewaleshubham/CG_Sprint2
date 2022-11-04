package crud_operation_OwnerController;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post_toLoginForOwner {
	@Test
	public void postMethod() {
		JSONObject object = new JSONObject();
		
		object.put("email", "shubham1@gmail.com");
		object.put("password", "Shubham@13");
				
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		.when()
		.post("http://localhost:8080/owner/login")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}	

}


