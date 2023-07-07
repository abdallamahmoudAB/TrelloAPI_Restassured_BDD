package boards;
import static io.restassured.RestAssured.*;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import utils.ConfigLoader;
import utils.ContextAttribute;
import utils.JsonData;

import java.io.FileNotFoundException;

public class UpdateBoard {

    @Test
    public void updateBoardByID(ITestContext context) throws FileNotFoundException {

//        String boardID = (String) context.getAttribute("board_ID");

//        String payload = "{\n" +
//                "    \"name\": \"UpdatedBoardName\"\n" +
//                "}";

        given()
                .pathParam("id", ContextAttribute.getBoardID(context))
                .queryParam("key", ConfigLoader.getKey())
                .queryParam("token", ConfigLoader.getToken())
                .body(JsonData.payload().toString())

                .when()
                .get(ConfigLoader.getBaseUrl()+"{id}")

                .then()
                .statusCode(200);
    }
}
