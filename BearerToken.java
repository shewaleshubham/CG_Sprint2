package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class BearerToken {

	@Test
	
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject obj = new JSONObject();
		obj.put("name", "CG_Sprint2");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}
}
