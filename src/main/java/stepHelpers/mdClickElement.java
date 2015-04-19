package stepHelpers;

import helpers.mdBrowserHelper;
import org.openqa.selenium.By;

/**
 * Created by maninderdhanju on 4/6/15.
 */
public class mdClickElement {

    //Find element by Id to get inner html
    public static void clickById(String key) {
        mdBrowserHelper.driver.findElement(By.id(key)).click();
    }

    //Find element by class to get inner html
    public static void clickByClass(String key) {
        mdBrowserHelper.driver.findElement(By.className(key)).click();
    }

    //Find element by Css Selector to get inner html
    public static void findByCssSelector(String key) {
        mdBrowserHelper.driver.findElement(By.cssSelector(key)).click();
    }

    //Find element by Tag Name to get inner html
    public static void findByTagName(String key) {
        mdBrowserHelper.driver.findElement(By.tagName(key)).click();
    }

    //Find element by Tag Name to get inner html
    public static void findByXPath(String key) {
        mdBrowserHelper.driver.findElement(By.xpath(key)).click();
    }

    //Find element by Name to get inner html
    public static void findByName(String key) {
        mdBrowserHelper.driver.findElement(By.name(key)).click();
    }

    //Find element by Link Text to get inner html
    public static void findByLinkText(String key) {
        mdBrowserHelper.driver.findElement(By.linkText(key)).click();
    }
}
