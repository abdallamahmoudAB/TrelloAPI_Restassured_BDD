package boards;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class CreateBoard {

    @Test
    public void createBoardTest(){

        given()
                .contentType(ContentType.JSON)
                .queryParam("name", "TrelloAPITest")
                .queryParam("key", "d6473f6dab60a52e3586d511845510c7")
                .queryParam("token", "ATTA3f18be01c7abe8f9aeb273b1d0e5ffead5c100ef50a76fba02324f8bb92dd2bc9B7E1F59")

                .when()
                .post("https://api.trello.com/1/boards/");
    }
}
