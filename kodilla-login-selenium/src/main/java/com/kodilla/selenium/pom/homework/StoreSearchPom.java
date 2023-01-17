package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StoreSearchPom extends AbstractStorePom {

    @FindBy(css = "#searchField")
    WebElement searchField;

    public StoreSearchPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> search(String name) {
        searchField.sendKeys(name);
        searchField.submit();
        List<WebElement> articles = driver.findElements(By.cssSelector("#elements-wrapper > div"));
        return articles;
    }

    public void close() {
        driver.close();
    }
}
