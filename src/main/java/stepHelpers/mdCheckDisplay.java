package stepHelpers;

import helpers.mdBrowserHelper;
import org.openqa.selenium.By;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdCheckDisplay {

    public Boolean findById(String key) {
        Boolean res = null;
        String isDisplay = mdBrowserHelper.driver.findElement(By.id(key)).getCssValue("display");
        if (isDisplay.contains("block")) res = true;
        return res;
    }

    public Boolean findByClass(String key) {
        Boolean res = null;
        String isDisplay = mdBrowserHelper.driver.findElement(By.className(key)).getCssValue("display");
        if (isDisplay.contains("block")) res = true;
        return res;
    }

    public static Boolean findByLinkText(String key) {
        Boolean res = null;
        String isDisplay = mdBrowserHelper.driver.findElement(By.linkText(key)).getCssValue("display");
        if (isDisplay.contains("block")) res = true;
        return res;
    }
}
