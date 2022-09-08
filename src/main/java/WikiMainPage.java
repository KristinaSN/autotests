import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiMainPage {
    public WebDriver driver;

    public WikiMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@id=\"wpName1\"]")
    private WebElement userName;

    public String getUserName() {
        return userName.getText();
    }
}
