package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.*;
import org.testng.Assert;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitions {
	RequestSpecification reqspec;
	Response response;
	
	
	@Given("visiting the API")
	public void visiting_the_api() {
		RestAssured.baseURI = "https://ergast.com/api/f1/2017/circuits.json";
		reqspec = RestAssured.given();
		
		
	}

	@When("get response from API")
	public void get_response_from_api() {
		response = reqspec.get();
	}

	@Then("validate the response code")
	public void validate_the_response_code() {
		Assert.assertEquals(200 , response.statusCode());
	}

	@Then("verify series")
	public void verify_series() {
		String  a =response.then().extract().path("path" ,"MRData.series");
		String b ="f1";
		if (b==a)
		{System.out.println("matched");	}}
	

@Then("verify circuitID")
public void verify_circuit_id() {
	String  circuitId =response.then().extract().path("path" ,"MRData.CircuitTable.Circuits[0].circuitId");
	String ExcircuitId = "albert_park";
	if(circuitId==ExcircuitId)
	{System.out.println("verified");}
}

@Then("verify the circuitName")
public void verify_the_circuit_name() {
	String  circuitName =response.then().extract().path("path" ,"MRData.CircuitTable.Circuits[0].circuitName");
	String ExcircuitName = "Albert Park Grand Prix Circuit";
	if(circuitName==ExcircuitName)
	{System.out.println("verified");}
}

@Then("verify the locality")
public void verify_the_locality() {
	String  locality =response.then().extract().path("path" ,"MRData.CircuitTable.Circuits[0].Location.locality");
	String Exlocality = "Albert Park Grand Prix Circuit";
	if(locality==Exlocality)
	{System.out.println("verified");}
    
}

}
