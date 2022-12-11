package postMan;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postPut {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification res = RestAssured.given();
	JSONObject j=new JSONObject();
	j.put("name", "ak");
	j.put("job", "sdet");
	res.contentType(ContentType.JSON);
	res.contentType(j.toJSONString());
	Response a = res.request(Method.POST,"/api/users");
	String s = a.asString();
	JsonPath m=new JsonPath(s);
	String text = m.getString("name");
	System.out.println(text);


	
}
}
