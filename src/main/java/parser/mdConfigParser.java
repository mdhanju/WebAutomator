/**
 * Created by maninderdhanju on 4/5/15.
 */
package parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mdConfigParser {
    static String path = "config.json";

    static public String getBrowser() {
        String myBrowser = null;
        try {
            FileReader reader = new FileReader(path);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            JSONArray myBrowsers = (JSONArray) jsonObject.get("browser");
            // TODO - Parallel browser not yet implemented
            myBrowser = (String) myBrowsers.get(0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return myBrowser;
    }

    static public String getUrl() throws IOException, ParseException {
        String myUrl = null;
        FileReader reader = new FileReader(path);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        myUrl = (String) jsonObject.get("url");
        return myUrl;
    }

    static public int getwaitTime() {
        int waitTime = 0;
        try {
            FileReader reader = new FileReader(path);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            String temp = (String) jsonObject.get("waitTime");
            waitTime = Integer.parseInt(temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return waitTime;
    }

}
