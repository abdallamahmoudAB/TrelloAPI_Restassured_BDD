package boards;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import utils.ConfigLoader;

public class GetBoard {

    @Test
    public void getBoardByID(ITestContext context){

        String boardID = (String) context.getAttribute("board_ID");

        given()
                .pathParam("id",boardID)
                .queryParam("key", ConfigLoader.getKey())
                .queryParam("token", ConfigLoader.getToken())

                .when()
                .get(ConfigLoader.getBaseUrl()+"{id}")

                .then()
                .statusCode(200)
                .log().body()
                .body("name", equalTo("TrelloAPITest"));


    }
}
