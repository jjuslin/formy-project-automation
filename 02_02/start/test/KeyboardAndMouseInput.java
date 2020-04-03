
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id(	"name"));
        name.click();
        name.sendKeys(" Jacques Juslin");

          WebElement button = driver.findElement(By.id(	"button"));
          button.click();
        TimeUnit.SECONDS.sleep(5);

        driver.quit();
    }
}
