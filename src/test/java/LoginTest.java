import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Assert;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static WebDriver driver;
    public static WikiLoginPage wikiLoginPage;
    public static WikiMainPage wikiMainPage;
    public static String url = "https://ru.wikipedia.org/w/index.php?title=Служебная:Вход&returnto=Заглавная+страница";
    public static String name = "your_name";
    public static String password = "your_password";

    @BeforeClass
    public static void openWikiLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(url);

        wikiLoginPage = new WikiLoginPage(driver);
        wikiMainPage = new WikiMainPage(driver);
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();

    }

    @Test
    public void wikiLoginTest() {
        wikiLoginPage.inputName(name);
        wikiLoginPage.inputPassword(password);
        wikiLoginPage.clickLoginButton();

    }
}

