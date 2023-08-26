package org.example.api;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestTests {

    private static final String BASE_URL = "http://reqres.in/";
    private static final String USERS_ENDPOINT = "api/users/";

    @Test (dataProvider = "basicDataProvider")
    public void getUser(String userId){
        given()
                .baseUri(BASE_URL)
                .basePath(USERS_ENDPOINT)
                .contentType(ContentType.JSON)
                .log().uri()
                .when()
                .get(userId)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }

    @DataProvider (name = "basicDataProvider")
    public Object[][] dpMethod() {
        return new Object [][] {{"1"}, {"2"}};
    }

}
