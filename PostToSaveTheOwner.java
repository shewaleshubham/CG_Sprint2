package stepDefinantion;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostToSaveTheOwner {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("User want to pass the data into database")
	public void user_want_to_pass_the_data_into_database() {
	   JSONObject object = new JSONObject();
	   
	   object.put("address", "Kolhapur");
		object.put("comapnyName", "Capgemini");
		object.put("department", "IT");
		object.put("email", "shubham3@gmail.com");
		object.put("name", "Shubham");
		object.put("password", "Shubham@3");
		object.put("phone", "8668531224");
		
		req=RestAssured.given()
				.body(object)
				.contentType(ContentType.JSON);

	}

	@When("User want to pass the data by using URI {string}")
	public void user_want_to_pass_the_data_by_using_uri(String string) {
	   res = req.post("http://localhost:8080/owner"); 
	}

	@Then("User want to validate status line {string}")
	public void user_want_to_validate_status_line(String string) {
	    validate = res.then();
	}

	@Then("User want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer int1) {
	    validate.assertThat().statusCode(200);
	}


}
