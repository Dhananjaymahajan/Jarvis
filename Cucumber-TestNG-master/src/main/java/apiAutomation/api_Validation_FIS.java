package apiAutomation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import io.restassured.RestAssured;

public class api_Validation_FIS {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://api.coindesk.com/";

		given().log().all().when().get("v1/bpi/currentprice.json").then().log().all().assertThat().statusCode(200)
				.body("bpi", notNullValue()).body("bpi.size()", equalTo(3)).body("bpi.USD", notNullValue())
				.body("bpi.GBP", notNullValue()).body("bpi.EUR", notNullValue())
				.body("bpi.GBP.description", equalTo("British Pound Sterling"));

	}

}
