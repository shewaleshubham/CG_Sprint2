package crud_operation_OwnerController;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Get_toGet {
	@Test
	public void getMethod()
	{
		baseURI="http://localhost:8080";
		when()	
		.get("/hi")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
