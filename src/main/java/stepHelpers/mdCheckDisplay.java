package stepHelpers;

import helpers.mdBrowserHelper;
import org.openqa.selenium.By;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdCheckDisplay {

    public static Boolean findById(String key) {
        Boolean res = null;
        String isDisplay = mdBrowserHelper.driver.findElement(By.id(key)).getCssValue("visibility");
        if (isDisplay.contains("visible")) res = true;
        return res;
    }

    public static Boolean findByClass(String key) {
        Boolean res = null;
        String isDisplay = mdBrowserHelper.driver.findElement(By.className(key)).getCssValue("visibility");
        if (isDisplay.contains("visible")) res = true;
        return res;
    }

    public static Boolean findByLinkText(String key) {
        Boolean res = null;
        String isDisplay = mdBrowserHelper.driver.findElement(By.linkText(key)).getCssValue("visibility");
        if (isDisplay.contains("visible")) res = true;
        return res;
    }

    public static Boolean findByXPath(String key) {
        Boolean res = null;
        String isDisplay = mdBrowserHelper.driver.findElement(By.xpath(key)).getCssValue("visibility");
        if (isDisplay.contains("visible")) res = true;
        return res;
    }
}
