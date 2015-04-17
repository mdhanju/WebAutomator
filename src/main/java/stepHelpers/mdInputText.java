package stepHelpers;

import helpers.mdBrowserHelper;
import org.openqa.selenium.By;

/**
 * Created by maninderdhanju on 4/16/15.
 */
public class mdInputText {

    public static void inputById(String key, String value) {
        mdBrowserHelper.driver.findElement(By.id(key)).sendKeys(value);
    }

    public static void inputByClass(String key, String value) {
        mdBrowserHelper.driver.findElement(By.className(key)).sendKeys(value);
    }

}
