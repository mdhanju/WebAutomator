package parser;

import helpers.mdBrowserHelper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by maninderdhanju on 4/8/15.
 */

public class mdDataParser {
    static String path = "config.json";

    public static void main(String[] args) throws IOException, ParseException {
        String namme = getPageTitle("userId");
        System.out.println("NMAE = " + namme);


    }

    public static String getPageTitle(String key) throws IOException, ParseException {
        String name = mdBrowserHelper.getDataFileName();
        String path = "data/" + name + ".json";
        FileReader reader = new FileReader(path);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        name = (String) jsonObject.get(key);
        return name;
    }
}
