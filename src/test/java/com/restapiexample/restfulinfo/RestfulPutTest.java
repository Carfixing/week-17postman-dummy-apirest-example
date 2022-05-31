package com.restapiexample.restfulinfo;

import com.restapiexample.RestApiPojo;
import com.restapiexample.RestCreateUserPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestfulPutTest extends TestBase{


        @Test
        public void updateEmployeesWithPut() {

            RestCreateUserPojo restCreateUserPojo = new RestCreateUserPojo();
            restCreateUserPojo.setEmployee_name("Rhitika Shah");
            restCreateUserPojo.setEmployee_salary("60000");
            restCreateUserPojo.setEmployee_age("32");
            restCreateUserPojo.setProfile_image("http://update.jpg");

            Response response = given()
                    .header("Content-Type", "application/json")
                    .basePath("/update")
                    .pathParam("id", 6699)
                    .body(restCreateUserPojo)
                    .when()
                    .put("{id}");

            response.prettyPrint();
            response.then().statusCode(200);
        }}


