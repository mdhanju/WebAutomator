package parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by maninderdhanju on 4/8/15.
 */
public class mdWebElementParser {

//    public static void main(String[] args) throws IOException, ParseException {
//        String dataa = getPageTitle("i_am_on_gmailPage");
//        System.out.println("dataa = " + dataa);
//    }

    public static String getNameOfWebComp(String data) {
        String result = null;
        String[] nameArray = data.split(" ");
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].contains("Page")) {
                result = nameArray[i];
            }
        }
        return result;
    }

    public static String getUrl(String data) throws IOException, ParseException {
        String launchUrl = null;
        String path = "webElements/" + data + ".json";
        FileReader reader = new FileReader(path);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        launchUrl = (String) jsonObject.get("url");
        return launchUrl;
    }

    public static JSONObject getCustomAttFrmWebComp(String fileName, String eleName) throws IOException, ParseException {
        JSONObject result = null;
        String path = "webElements/" + fileName + ".json";

        FileReader reader = new FileReader(path);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

        JSONArray arrayElements = (JSONArray) jsonObject.get("elements");
        for (int i = 0; i < arrayElements.size(); i++) {
            JSONObject elementObj = (JSONObject) arrayElements.get(i);
            if (elementObj.get("name").equals(eleName)) result = (JSONObject) elementObj.get("customAttribute");
        }
        return result;
    }

    public static String getPageTitle(String data) throws IOException, ParseException {
        String pageTitle = null;
        String[] myArray = data.split("_");
        String nameFile = myArray[myArray.length - 1];
        String path = "webElements/" + nameFile + ".json";
        FileReader reader = new FileReader(path);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        pageTitle = (String) jsonObject.get("title");
        return pageTitle;
    }
}
