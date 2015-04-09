package parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by maninderdhanju on 4/8/15.
 */
public class mdWebComponentParser {

    public static void main(String[] args) {
        String dataa = getdata("linkYou");
    }

    public static String getdata(String name) {
        String myBrowser = null;
        String path = "webComponents/googleSearchPage.json";
        try {
            // read the json file
            FileReader reader = new FileReader(path);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            JSONArray allElements = (JSONArray) jsonObject.get("elements");


            for (int i = 0; i < allElements.size(); i++) {
                JSONObject eachElement = (JSONObject) allElements.get(i);
                String elementName = (String) eachElement.get("name");

//                System.out.println("Elements eachElement = "+ eachElement);

                if (elementName.equals(name)) {
                    String elementType = (String) eachElement.get("type");
                    JSONObject elementobj = (JSONObject) eachElement.get("customAttribute");
                    String attName = (String) elementobj.get("name");
                    String attValue = (String) elementobj.get("value");

                    String key = " [" + attName + ":" + "\"" + attValue + "\"" + "]";
                    System.out.println("Elements Type = " + elementType + key);
                }
            }

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
}
