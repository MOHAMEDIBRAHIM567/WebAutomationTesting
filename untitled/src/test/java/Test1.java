import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {
    @BeforeMethod
    public void installChroome1() {
        System.setProperty("webdriver.chrome.driver"
                , System.getProperty("user.dir") +
                        "/resources/chromedriver.exe");
    }

    @Test
    public void rightanddoubleclick() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        Actions action = new Actions(driver);
        WebElement RightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
        WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
        action.contextClick(RightClick).perform();
        action.doubleClick(doubleclick).perform();

    }

    @Test
    public void draganddrop() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement bank_button = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        WebElement target_place = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        action.dragAndDrop(bank_button, target_place).perform();

    }

    @Test
    public void hover() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement nivagtetopicture = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        action.moveToElement(nivagtetopicture);
    }

    @Test
    public void swtich() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cookbook.seleniumacademy.com/Alerts.html");
        driver.findElement(By.xpath("//*[@id=\"simple\"]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
        alert.dismiss();
        driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
        alert.sendKeys("Mohamed ibrahim");
        alert.accept();

    }

    @Test
    public void assert1() {
        SoftAssert softAssert = new SoftAssert();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement stringSoft = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        stringSoft.getText();
        softAssert.assertEquals(stringSoft,"Your content goes here.");
    }
    @Test
    public void assert2() {
        SoftAssert softAssert = new SoftAssert();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cookbook.seleniumacademy.com/Frames.html");
        driver.switchTo().frame("mce_0_ifr");
        WebElement stringSoft = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        stringSoft.getText();
        softAssert.assertEquals(stringSoft,"Your content goes here.");


}

