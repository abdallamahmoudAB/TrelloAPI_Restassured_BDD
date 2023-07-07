package utils;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ContextAttribute {

    @Test
    public static String getBoardID(ITestContext context){
        String boardID = (String) context.getAttribute("board_ID");
        return boardID;
    }
}
