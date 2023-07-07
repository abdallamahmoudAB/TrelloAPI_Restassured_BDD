package boards;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import utils.ConfigLoader;
import utils.ContextAttribute;

import static io.restassured.RestAssured.given;

public class DeleteBoard {

    @Test
    public void DeleteBoardByID(ITestContext context){

//        String boardID = (String) context.getAttribute("board_ID");

        given()
                .pathParam("id", ContextAttribute.getBoardID(context))
                .queryParam("key", ConfigLoader.getKey())
                .queryParam("token", ConfigLoader.getToken())

                .when()
                .delete(ConfigLoader.getBaseUrl()+"{id}")

                .then()
                .statusCode(200);
    }
}
