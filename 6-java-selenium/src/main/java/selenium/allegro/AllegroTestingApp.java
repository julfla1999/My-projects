package selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookiesButton = driver.findElement(By.xpath("//*[@class=\"msts_pt a1lh7 a7he9 mpof_ki mjru_vb mj7a_0 mh36_16 mvrt_16 mg9e_16 m389_6m m389_5x_x myre_zn myre_8v_s myre_zn_x m7f5_6m_s munh_56 munh_0_x m3h2_56 m3h2_0_x\"]/button[1]"));
        cookiesButton.click();

        WebElement category = driver.findElement(By.xpath("//*[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select[1]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement nameField = driver.findElement(By.xpath("//*[@class=\"mp4t_8 mp4t_0_l mryx_8 mryx_0_s m7er_k4 _13850_b9NL0\"]/div/div/form/input[1]"));
        nameField.sendKeys("mavic mini");
        nameField.submit();
    }
}
