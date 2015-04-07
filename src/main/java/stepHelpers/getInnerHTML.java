package stepHelpers;

import helpers.browserHelper;
import org.openqa.selenium.By;

/**
 * Created by maninderdhanju on 4/6/15.
 */
public class getInnerHTML {

    //Find element by Id to get inner html
    public static String findById(String key) {
        return browserHelper.driver.findElement(By.id(key)).getAttribute("innerHTML");
    }

    //Find element by class to get inner html
    public static String findByClass(String key) {
        return browserHelper.driver.findElement(By.className(key)).getAttribute("innerHTML");
    }

    //Find element by Css Selector to get inner html
    public static String findByCssSelector(String key) {
        return browserHelper.driver.findElement(By.cssSelector(key)).getAttribute("innerHTML");
    }

    //Find element by Tag Name to get inner html
    public static String findByTagName(String key) {
        return browserHelper.driver.findElement(By.tagName(key)).getAttribute("innerHTML");
    }

    //Find element by Tag Name to get inner html
    public static String findByXPath(String key) {
        return browserHelper.driver.findElement(By.xpath(key)).getAttribute("innerHTML");
    }

    //Find element by Name to get inner html
    public static String findByName(String key) {
        return browserHelper.driver.findElement(By.name(key)).getAttribute("innerHTML");
    }

    //Find element by Link Text to get inner html
    public static String findByLinkText(String key) {
        return browserHelper.driver.findElement(By.linkText(key)).getAttribute("innerHTML");
    }

}
