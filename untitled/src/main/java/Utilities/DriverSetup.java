package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

        static WebDriver driver;
        public static void Browsers(String BrowserName) {

            if (BrowserName == "ChromeDriver")
            {
                driver = new ChromeDriver();
                WebDriverManager.chromedriver().setup();

            }

//    else if  (BrowserName == "firefoxDriver")
//        {
//
//            driver = new fi;
//            WebDriverManager.edgedriver().setup();
//        }

        }

    }
