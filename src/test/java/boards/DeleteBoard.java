package boards;

import org.testng.ITestContext;

import static io.restassured.RestAssured.given;

public class DeleteBoard {

    public void DeleteBoardByID(ITestContext context){

        String boardID = (String) context.getAttribute("board_ID");

        given()
                .pathParam("id",boardID)
                .queryParam("key", "d6473f6dab60a52e3586d511845510c7")
                .queryParam("token", "ATTA3f18be01c7abe8f9aeb273b1d0e5ffead5c100ef50a76fba02324f8bb92dd2bc9B7E1F59")

                .when()
                .get("https://api.trello.com/1/boards/")

                .then()
                .statusCode(200);
    }
}
