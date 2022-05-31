package com.restapiexample.restfulinfo;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestfulDeleteTest extends TestBase {


        @Test
        public void deleteAllProductInfo() {
            Response response = given()
                    .pathParam("id", 6699)
                    .when()
                    .delete("/delete/{id}");
            response.prettyPrint();
            response.then().statusCode(200);

        }

    }
