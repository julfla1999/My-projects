package selenium.pom;

import selenium.pom.StoreSearchPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class StoreSearchPomTest {

    StoreSearchPom searchPom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        searchPom = new StoreSearchPom(driver);
    }

    @Test
    public void testSearchPage_shouldFindWordSchool() {
        String name = "school";
        List<WebElement> result = searchPom.search(name);
        int number = result.size();
        assertEquals(1, number);
    }

    @Test
    public void testSearchPage_shouldFindWordNotebook() {
        String name = "notebook";
        List<WebElement> result = searchPom.search(name);
        int number = result.size();
        assertEquals(2, number);
    }

    @Test
    public void testSearchPage_shouldFindWordBrand() {
        String name = "brand";
        List<WebElement> result = searchPom.search(name);
        int number = result.size();
        assertEquals(1, number);
    }

    @Test
    public void testSearchPage_shouldFindWordBusiness() {
        String name = "business";
        List<WebElement> result = searchPom.search(name);
        int number = result.size();
        assertEquals(1, number);
    }

    @Test
    public void testSearchPage_shouldFindWordGaming() {
        String name = "gaming";
        List<WebElement> result = searchPom.search(name);
        int number = result.size();
        assertEquals(1, number);
    }

    @Test
    public void testSearchPage_shouldNotFindWordPowerful() {
        String name = "powerful";
        List<WebElement> result = searchPom.search(name);
        int number = result.size();
        assertEquals(0, number);
    }

    @Test
    public void testSearchPage_shouldIgnoreLetterSize() {
        String name = "nOTebOoK";
        List<WebElement> result = searchPom.search(name);
        int number = result.size();
        assertEquals(2, number);
    }

    @AfterEach
    public void testDown() {
        searchPom.close();
    }
}
