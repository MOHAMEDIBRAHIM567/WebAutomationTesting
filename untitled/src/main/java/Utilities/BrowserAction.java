package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserAction {


    static WebDriverWait wait;

    public static void clickOnElement(By by, WebDriver driver) {
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }



}


