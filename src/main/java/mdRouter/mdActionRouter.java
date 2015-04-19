package mdRouter;

import helpers.mdBrowserHelper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
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
//        System.out.println("Element Attributes--> " + nameTrigger + " : " + valueTrigger);

        if (nameTrigger.equals("id")) mdClickElement.clickById(valueTrigger);
        else if (nameTrigger.equals("class")) mdClickElement.clickByClass(valueTrigger);
        else if (nameTrigger.equals("xpath")) mdClickElement.findByXPath(valueTrigger);
        else if (nameTrigger.equals("linkText")) mdClickElement.findByLinkText(valueTrigger);
        else System.out.println("NEED TO BE IMPLEMENTED");

        mdWait.waitFor(2);
    }

    public void inputTextInElement(String name, String value) throws IOException, ParseException {
        mdBrowserHelper myhelper = new mdBrowserHelper();
        String myPage = myhelper.getPageTitle();
        JSONObject dataa = getCustomAttFrmWebComp(fileName, name);
        String nameTrigger = (String) dataa.get("name");
        String valueTrigger = (String) dataa.get("value");
//        System.out.println("Element Attributes--> " + nameTrigger + " : " + valueTrigger);

        if (nameTrigger.equals("id")) mdInputText.inputById(valueTrigger, value);
        else if (nameTrigger.equals("class")) mdInputText.inputByClass(valueTrigger, value);
        else if (nameTrigger.equals("xpath")) mdInputText.inputByXPath(valueTrigger, value);
        else System.out.println("NEED TO BE IMPLEMENTED");

        mdWait.waitFor(2);
    }

}
