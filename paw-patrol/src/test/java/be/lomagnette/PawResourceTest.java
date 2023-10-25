package be.lomagnette;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PawResourceTest {


    @Test
    public void testList() {
        given()
          .when().get("/paws")
          .then()
             .statusCode(200)
             .body("size()",is(8));
    }

}
