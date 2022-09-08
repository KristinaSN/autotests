import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void testSearchGoogle() {
        //прописываем путь к драйверу
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium\\chromedriver.exe");

        //реализуем логику теста: через создание объекта типа WebDriver и вызов конструктора для определенного типа браузера
        //чтобы управлять функциями и методами Хрома
       WebDriver driver = new ChromeDriver();

       //открытие новой страницы
       driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit(); 
        driver.quit();


    }
}
