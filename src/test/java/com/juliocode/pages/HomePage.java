package com.juliocode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    final String SEACH_IMPUT = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div[1]/input";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchItem(String item) {
        driver.findElement(By.xpath(SEACH_IMPUT)).sendKeys(item, Keys.ENTER);
    }
}
