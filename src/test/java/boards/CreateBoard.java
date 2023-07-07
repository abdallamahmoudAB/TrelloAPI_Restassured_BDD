package boards;

import io.restassured.http.ContentType;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import utils.ConfigLoader;

import static io.restassured.RestAssured.*;

public class CreateBoard {

    @Test
    public void createBoardTest(ITestContext context){

        String boardID = given()
                .contentType(ContentType.JSON)
                .queryParam("name", "TrelloAPITest")
                .queryParam("key", ConfigLoader.getKey())
                .queryParam("token", ConfigLoader.getToken())

                .when()
                .post(ConfigLoader.getBaseUrl())
                .jsonPath().get("id");

        context.setAttribute("board_ID", boardID);
        System.out.println("boardID is: "+boardID);
    }
}
