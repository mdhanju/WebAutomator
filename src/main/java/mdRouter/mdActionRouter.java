package mdRouter;

import helpers.mdBrowserHelper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import stepHelpers.mdClickElement;

import java.io.IOException;

import static parser.mdWebComponentParser.getCustomAttFrmWebComp;

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
        System.out.println("Element Attributes--> " + nameTrigger + " : " + valueTrigger);
        if (nameTrigger.equals("linkText")) {
            mdClickElement.findByLinkText(valueTrigger);
        }
    }

}
