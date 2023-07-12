package com.juliocode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    final String SEACH_IMPUT = "twotabsearchtextbox";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchItem(String item) {
        driver.findElement(By.id(SEACH_IMPUT)).sendKeys(item, Keys.ENTER);
    }
}
