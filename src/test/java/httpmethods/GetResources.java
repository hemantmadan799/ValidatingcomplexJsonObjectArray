package httpmethods;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import pojoclasses.Ad;
import pojoclasses.Data;
import pojoclasses.Payload799;

public class GetResources {
	
	RequestSpecification httpRequest;
	Response response;
	ResponseBody rBody;
	Payload799 pl;
	Ad myAd;
	
	
	@BeforeClass
	public void getRequest()
	{
	RestAssured.baseURI="http://reqres.in/api/users";	
	httpRequest=RestAssured.given();
	response=httpRequest.get();
	rBody=response.getBody();
	
	}
	
	@Test
	public void checkResult()
	{
		
	//validating Main json object content
	pl=rBody.as(Payload799.class);
	System.out.println(pl.getPage());
	System.out.println(pl.getPer_page());
	System.out.println(pl.getTotal());
	System.out.println(pl.getTotal_pages());
	//validating json array Data
	Data[] dt1 = response.jsonPath().getObject("data",Data[].class );
	for(Data book : dt1)
	 {
	 System.out.println(book.getEmail());
	 //validation code using if or Assert can be applied here
	 System.out.println(book.getAvatar());
	 System.out.println( book.getFirst_name());
	 System.out.println( book.getLast_name());
	 }

	//validating json object (Ad) content
	
	myAd=pl.getAd();
	
	System.out.println(myAd.getCompany());
	System.out.println(myAd.getText());
	System.out.println(myAd.getUrl());
	
		
		

	}

}
