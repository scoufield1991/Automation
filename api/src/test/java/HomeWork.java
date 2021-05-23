import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;

public class HomeWork {


    @Test
    public void getHomeworkTest() throws URISyntaxException, IOException{
        given().baseUri("https://www.metaweather.com")
                .basePath("api/location/44418")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void getHomeworkTest2() throws URISyntaxException, IOException {

        String JSON_STRING = "{\n" +
                "\"apiKey\": \"f0a8ed3fd5f618970de71afbc1d9828c\",\n" +
                " \"modelName\": \"Address\",\n" +
                "    \"calledMethod\": \"searchSettlements\",\n" +
                "    \"methodProperties\": {\n" +
                "        \"CityName\": \"київ\",\n" +
                "        \"Limit\": 5\n" +
                "    }\n" +
                "}";


        given()
                .baseUri("https://api.novaposhta.ua")
                .basePath("v2.0/json/")
                .body(JSON_STRING)
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(200);
    }
}
