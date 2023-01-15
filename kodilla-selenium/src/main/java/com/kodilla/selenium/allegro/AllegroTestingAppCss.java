package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingAppCss {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookiesButton = driver.findElement(By.xpath("//*[@class=\"msts_pt a1lh7 a7he9 mpof_ki mjru_vb mj7a_0 mh36_16 mvrt_16 mg9e_16 m389_6m m389_5x_x myre_zn myre_8v_s myre_zn_x m7f5_6m_s munh_56 munh_0_x m3h2_56 m3h2_0_x\"]/button[1]"));
        cookiesButton.click();

        WebElement category = driver.findElement(By.cssSelector("body > div.main-wrapper > div > div > div > div > div > div > div:nth-child(3) > header > div > div > div > div > form > div.mpof_5r.mpof_ki_s.mp7g_oh.m389_6m.mjyo_6x.mse2_40.mp4t_0.mr3m_0.mli2_0.mx7m_1.m911_co.mnyp_co.mdwl_co.mefy_5r.msts_pt.mlkp_6x._535b5_iZ-SS > div > select"));
        Select categorySelect = new Select(category);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement nameField = driver.findElement(By.cssSelector("body > div.main-wrapper > div > div > div > div > div > div > div:nth-child(3) > header > div > div > div > div > form > input"));
        nameField.sendKeys("mavic mini");
        nameField.submit();

        List<WebElement> articles = driver.findElements(By.cssSelector("section > article"));
        for ( WebElement article : articles ) {
            String description = article.getText();
            System.out.println(description);
        }




    }
}
