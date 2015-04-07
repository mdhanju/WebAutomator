package stepHelpers;

import helpers.browserHelper;
import org.openqa.selenium.By;

/**
 * Created by maninderdhanju on 4/6/15.
 */
public class clickElement {

    //Find element by Id to get inner html
    public void clickById(String key) {
        browserHelper.driver.findElement(By.id(key)).click();
    }

    //Find element by class to get inner html
    public static void clickByClass(String key) {
        browserHelper.driver.findElement(By.className(key)).click();
    }

    //Find element by Css Selector to get inner html
    public static void findByCssSelector(String key) {
        browserHelper.driver.findElement(By.cssSelector(key)).click();
    }

    //Find element by Tag Name to get inner html
    public static void findByTagName(String key) {
        browserHelper.driver.findElement(By.tagName(key)).click();
    }

    //Find element by Tag Name to get inner html
    public static void findByXPath(String key) {
        browserHelper.driver.findElement(By.xpath(key)).click();
    }

    //Find element by Name to get inner html
    public static void findByName(String key) {
        browserHelper.driver.findElement(By.name(key)).click();
    }

    //Find element by Link Text to get inner html
    public static void findByLinkText(String key) {
        browserHelper.driver.findElement(By.linkText(key)).click();
    }
}
