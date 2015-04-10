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

    public static void main(String[] args) throws IOException, ParseException {
        String rawData = getNameOfWebComp("Validate gmailPage");
        String getUrl = getUrl(rawData);
        String dataa = getdata("linkYou");
    }


    public static String getNameOfWebComp(String data) {
        String result = null;
        String[] nameArray = data.split(" ");
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].contains("Page")) {
                result = nameArray[i] + ".json";
            }
        }
        return result;
    }

    public static String getUrl(String data) throws IOException, ParseException {
        String result = null;
        String path = "webComponents/" + data;
        System.out.println("path = " + path);
        FileReader reader = new FileReader(path);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        String launchUrl = (String) jsonObject.get("url");
        System.out.println("launchUrl = " + launchUrl);
        return launchUrl;
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
                    System.out.println("Element's Custom Attribute = " + elementobj);
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
