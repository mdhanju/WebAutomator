package mdRouter;

import helpers.mdBrowserHelper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import parser.mdDataParser;
import stepHelpers.mdClickElement;
import stepHelpers.mdInputText;
import stepHelpers.mdWait;

import java.io.IOException;

import static parser.mdWebElementParser.getCustomAttFrmWebComp;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdActionRouter {
    private final String fileName;

    public mdActionRouter(String fileName) {
        this.fileName = fileName;
    }

    public void clickElement(String name) throws IOException, ParseException {
        mdBrowserHelper myhelper = new mdBrowserHelper();
        String myPage = myhelper.getPageTitle();
        JSONObject dataa = getCustomAttFrmWebComp(fileName, name);
        String nameTrigger = (String) dataa.get("name");
        String valueTrigger = (String) dataa.get("value");

        if (nameTrigger.equals("id")) mdClickElement.clickById(valueTrigger);
        else if (nameTrigger.equals("class")) mdClickElement.clickByClass(valueTrigger);
        else if (nameTrigger.equals("xpath")) mdClickElement.findByXPath(valueTrigger);
        else if (nameTrigger.equals("linkText")) mdClickElement.findByLinkText(valueTrigger);
        else System.out.println("NEED TO BE IMPLEMENTED");
        mdWait.waitFor();
    }

    public void inputTextInElement(String name, String value) throws IOException, ParseException {
        String dataInput = mdDataParser.getPageTitle(value);
        mdBrowserHelper myhelper = new mdBrowserHelper();
        String myPage = myhelper.getPageTitle();
        JSONObject dataa = getCustomAttFrmWebComp(fileName, name);
        String nameTrigger = (String) dataa.get("name");
        String valueTrigger = (String) dataa.get("value");

        if (nameTrigger.equals("id")) mdInputText.inputById(valueTrigger, dataInput);
        else if (nameTrigger.equals("class")) mdInputText.inputByClass(valueTrigger, dataInput);
        else if (nameTrigger.equals("xpath")) mdInputText.inputByXPath(valueTrigger, dataInput);
        else System.out.println("NEED TO BE IMPLEMENTED");
        mdWait.waitFor();
    }
}
