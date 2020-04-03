import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

       WebElement autocomplete = driver.findElement(By.id ("autocomplete"));
       autocomplete.sendKeys("18 Mattapan Street, Mattapan, MA 02126");
       Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className ("pac-item"));
        autocompleteResult.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
