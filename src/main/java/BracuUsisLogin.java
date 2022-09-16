import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class BracuUsisLogin {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://usis.bracu.ac.bd/academia/");

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("nayemulislam606@gmail.com");
        userName.sendKeys(Keys.TAB);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("nayemul");
        password.sendKeys(Keys.TAB);

        WebElement button = driver.findElement(By.className("btn-text"));
        button.click();

        String actualUrl = "https://usis.bracu.ac.bd/academia/dashBoard/show";
        String expectedUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);


        driver.quit();



    }
}
