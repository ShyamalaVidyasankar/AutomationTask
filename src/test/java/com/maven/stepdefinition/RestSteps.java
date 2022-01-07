package com.maven.stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class RestSteps {

	public ExtractableResponse<Response> extract;

	@When("^User send get request with '(.*)'$")
	public void User_send_get_request_with(String url) {
		extract = RestAssured.given().headers("content-type", "application/json").when().get(url).then().extract();
	}

	@When("^User verify json path '(.*)' and value '(.*)' present in the response$")
	public void user_verify_json_path_and_value(String path, String value) {
		JsonPath jsonPath = extract.jsonPath();
		Object object = jsonPath.get(path);
		System.out.println("Response: "+  String.valueOf(object));
		Assert.assertEquals(value, String.valueOf(object));
	}

	@When("^User send post request with '(.*)' with body '(.*)'$")
	public void User_send_gpost_request_with(String url, String body) {
		extract = RestAssured.given().headers("content-type", "application/json").when().body(body).post(url).then()
				.extract();
	}

	@When("^User send put request with '(.*)' with body '(.*)'$")
	public void User_send_put_request_with(String url, String body) {
		extract = RestAssured.given().headers("content-type", "application/json").when().body(body).put(url).then()
				.extract();
	}
	
	@When("^User send delete request with '(.*)'$")
	public void User_send_delete_request_with(String url) {
		extract = RestAssured.given().headers("content-type", "application/json").when().delete(url).then().extract();
	}

}
