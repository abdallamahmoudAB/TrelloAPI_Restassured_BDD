package utils;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonData {

    public static JSONObject payload() throws FileNotFoundException {


        File file = new File("./src/test/resources/payload.json"); // open the file
        FileReader fileReader = new FileReader(file); // read the file
        JSONTokener jsonTokener = new JSONTokener(fileReader); // pass into jsonTokener
        JSONObject data = new JSONObject(jsonTokener); // extract data in jsonObject format
        return data;
    }
}
