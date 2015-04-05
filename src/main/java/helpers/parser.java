/**
 * Created by maninderdhanju on 4/5/15.
 */
package helpers;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;

import java.io.FileNotFoundException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class parser {

    static String getBrowser() {
        String myBrowser = null;
        try {
            // read the json file
            FileReader reader = new FileReader("config.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            myBrowser = (String) jsonObject.get("browser");
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

    static String getUrl() {
        String myUrl = null;
        try {
            // read the json file
            FileReader reader = new FileReader("config.json");
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
