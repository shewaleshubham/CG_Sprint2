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

public class PostToLoginForOwner {

	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("User want enter valid email and password of owner")
	public void user_want_enter_valid_email_and_password_of_owner() {
	    JSONObject obj = new JSONObject();
	    
	    obj.put("email", "shubh23@gmail.com");
	    obj.put("password", "Shubham@34565");
	    
	     req = RestAssured.given()
	    		 .body(obj)
	    		 .contentType(ContentType.JSON);
	}

	@When("User want to pass the data of owner by using the URI {string}")
	public void user_want_to_pass_the_data_of_owner_by_using_the_uri(String url) {
	  res = req.post(url);
	}

	@Then("User want to validate the status line {string}")
	public void user_want_to_validate_the_status_line(String string) {
	   validate = res.then();
	}

	@Then("User want to validate the status code is {int}")
	public void user_want_to_validate_the_status_code_is(Integer code) {
	    validate.assertThat().statusCode(code)
	    .log().all();
	}


	
}
