package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    WebDriver driver;

    By FindButton = By.className("context-menu-one btn btn-neutral");

    public HomePage(WebDriver driver){

        this.driver=(driver);

    }

    public void enterrightclick (){
        driver.findElement(FindButton).click();
    }


}
