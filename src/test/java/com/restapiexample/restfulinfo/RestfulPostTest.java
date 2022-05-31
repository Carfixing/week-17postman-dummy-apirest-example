package com.restapiexample.restfulinfo;

import com.restapiexample.RestApiPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestfulPostTest extends TestBase {
    @Test
    public void createEmployeeTest() {
        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setName("Priya Patel");
        restApiPojo.setSalary("60000");
        restApiPojo.setAge("30");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
