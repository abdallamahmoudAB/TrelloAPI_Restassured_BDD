package boards;
import static io.restassured.RestAssured.*;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import utils.ConfigLoader;
import utils.JsonData;

import java.io.FileNotFoundException;

public class UpdateBoard {

    @Test
    public void updateBoardByID(ITestContext context) throws FileNotFoundException {

        String boardID = (String) context.getAttribute("board_ID");

//        String payload = "{\n" +
//                "    \"name\": \"UpdatedBoardName\"\n" +
//                "}";

        given()
                .pathParam("id",boardID)
                .queryParam("key", "d6473f6dab60a52e3586d511845510c7")
                .queryParam("token", "ATTA3f18be01c7abe8f9aeb273b1d0e5ffead5c100ef50a76fba02324f8bb92dd2bc9B7E1F59")
                .body(JsonData.payload().toString())

                .when()
                .get(ConfigLoader.getBaseUrl()+"{id}")

                .then()
                .statusCode(200);
    }
}
