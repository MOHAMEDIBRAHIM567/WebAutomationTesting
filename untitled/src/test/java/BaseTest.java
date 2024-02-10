import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void driverSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();}

}

