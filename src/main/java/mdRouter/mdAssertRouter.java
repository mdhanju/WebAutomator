package mdRouter;

import helpers.mdBrowserHelper;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import parser.mdWebComponentParser;
import stepHelpers.mdCheckDisplay;

import java.io.IOException;

import static parser.mdWebComponentParser.getCustomAttFrmWebComp;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdAssertRouter {
    private final String fileName;

    public mdAssertRouter(String fileName) {
        this.fileName = fileName;
    }

    public void assertPages(String pageTitle) throws IOException, ParseException {
        String pageTitleData = mdWebComponentParser.getPageTitle(pageTitle);

        Boolean res = null;
        mdBrowserHelper myhelper;
        myhelper = new mdBrowserHelper();
        String pageTitleWeb = myhelper.getPageTitle();
        System.out.println("Page title Web = " + pageTitleWeb);
        System.out.println("Page Title Data = " + pageTitleData);

        if ((pageTitleWeb.contains(pageTitleData)) && (pageTitleData != null) && (pageTitleData.length() > 1))
            res = true;
        Assert.assertTrue(res);
    }

    public void assertElements(String name) throws IOException, ParseException {
        mdBrowserHelper myhelper = new mdBrowserHelper();
        String myPage = myhelper.getPageTitle();
        JSONObject dataa = getCustomAttFrmWebComp(fileName, name);
        String nameTrigger = (String) dataa.get("name");
        String valueTrigger = (String) dataa.get("value");
        System.out.println("Element Attributes--> " + nameTrigger + " : " + valueTrigger);
        if (nameTrigger.equals("linkText")) {
//            System.out.println(nameTrigger + " = " +valueTrigger);
            Boolean currentDispay = mdCheckDisplay.findByLinkText(valueTrigger);
            Assert.assertTrue(currentDispay);
        }
    }
}
