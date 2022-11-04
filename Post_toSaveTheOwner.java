package crud_operation_OwnerController;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post_toSaveTheOwner {
	@Test
	public void postMethod() {
		JSONObject object = new JSONObject();
		
		//object.put("id", 0);
		object.put("address", "Sangali");
		object.put("comapnyName", "CGNT");
		object.put("department", "IT");
		object.put("email", "shubham2@gmail.com");
		object.put("name", "shubham");
		object.put("password", "Shubham@2");
		object.put("phone", "9730731712");
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		.when()
		.post("http://localhost:8080/owner")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}	

}