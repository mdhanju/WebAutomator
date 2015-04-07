/**
 * Created by maninderdhanju on 4/5/15.
 */
package parser;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class mdParser {
    static String path = "config.json";

    static public String getBrowser() {
        String myBrowser = null;

        try {
            // read the json file
            FileReader reader = new FileReader(path);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            JSONArray myBrowsers = (JSONArray) jsonObject.get("browser");
            // TODO - Parallel browser not yet implemented
            myBrowser = (String) myBrowsers.get(0);
            System.out.println("Browser = " + myBrowser);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return myBrowser;
    }

    static public String getUrl() {
        String myUrl = null;
        try {
            // read the json file
            FileReader reader = new FileReader(path);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            myUrl = (String) jsonObject.get("url");
            System.out.println("My URL = " + myUrl);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return myUrl;
    }


}
