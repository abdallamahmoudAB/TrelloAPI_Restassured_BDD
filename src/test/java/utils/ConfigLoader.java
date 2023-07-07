package utils;

import java.util.ResourceBundle;

public class ConfigLoader {

    private static ResourceBundle getValue(){
        // load properties file
        ResourceBundle config = ResourceBundle.getBundle("config"); // name of properties file
        return config;
    }

    public static String getBaseUrl(){
        return getValue().getString("base_url");
    }

    public static String getKey(){
        return getValue().getString("key");
    }

    public static String getToken(){
        return getValue().getString("token");
    }
}
