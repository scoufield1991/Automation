import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.ws.Response;
import java.io.IOException;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class getTest {

    @Test
    public void getFirstTest() throws URISyntaxException, IOException{

        given().baseUri("https://www.petsmart.com")
                .basePath("dog/food/dry-food")
                .param("pmax","5.00")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .statusLine(Matchers.containsString("OK"));
    }


    @Test
    public void getSecondTest() throws URISyntaxException, IOException{

        String result = given().baseUri("https://ergast.com")
                .basePath("api/f1/2017/circuits.json")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .statusLine(Matchers.containsString("OK"))
                .extract().body().asString();

        Assert.assertTrue(result.contains("\"locality\":\"Suzuka\""));
        Assert.assertTrue(result.contains("\"country\":\"Japan\""));
    }

    @Test
    public void getThirdTest() throws URISyntaxException, IOException{

        given().baseUri("https://ergast.com")
                .basePath("api/f1/2017/circuits.json")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .statusLine(Matchers.containsString("OK"))
                .body("MRData.CircuitTable.Circuits.Location.locality", hasItems("Suzuka"))
                .body("MRData.CircuitTable.Circuits.Location.country", hasItems("Japan"))
                .body("MRData.url",equalTo("http://ergast.com/api/f1/2017/circuits.json"));

    }

    @Test
    public void getFourthTest() throws URISyntaxException, IOException{

        YuriiExample[] result = given().baseUri("https://www.metaweather.com/")
                .basePath("api/location/search/")
                .param("query","london")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .extract().body().as(YuriiExample[].class);

        Assert.assertTrue(result[0].getTitle().contains("London"));
    }

}
