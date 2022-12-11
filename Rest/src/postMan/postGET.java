package postMan;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postGET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification res = RestAssured.given();
		Response req = res.request(Method.GET,"/api/users?page=2");
//		System.out.println(req.asString());
		System.out.println(req.statusCode());
	}

}
