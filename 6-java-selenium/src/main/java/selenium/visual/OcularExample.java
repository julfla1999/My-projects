package selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver webDriver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("Users\\admin\\Biurko\\ocular\\result"))
                .snapshotPath(Paths.get("Users\\admin\\Biurko\\ocular\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.compare();
        page.close();
    }
}
