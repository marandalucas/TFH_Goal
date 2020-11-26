package com.bbva.tinfoilhat.goal;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GoalResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/goal")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}