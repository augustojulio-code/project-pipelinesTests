package com.juliocode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    private WebDriver driver;

    final String ITEM_RESULT = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div[3]/div[2]/h2/a";
    final String PRICE_ITEM = "//*[@id=\"corePrice_feature_div\"]/div/span[1]/span[2]/span[2]";

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void resulrSearch() {
        driver.findElement(By.xpath(ITEM_RESULT)).click();
    }

    public String returnResulString() {
        return driver.findElement(By.xpath(PRICE_ITEM)).getText();
    }

}
