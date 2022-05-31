package com.restapiexample.restfulinfo;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestfulGetTest  extends TestBase {

    @Test
    public void getAllEmployeesInfo() {
        Response response = given()
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);
    }



    @Test
        public void getSingleStudentInfo() {
            Response response = given()
                    .basePath("/employee")
                    .pathParam("id",11)
                    .when()
                    .get("{id}");
            response.then().statusCode(200);
            response.prettyPrint();
        }

}
