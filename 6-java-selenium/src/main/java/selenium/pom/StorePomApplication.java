package selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StorePomApplication {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        StoreSearchPom searchPom = new StoreSearchPom(driver);
        searchPom.search("nOTebOoK");
        searchPom.close();
    }
}
