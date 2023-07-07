package com.juliocode.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FillFormTest {
    private WebDriver driver;

    @Before
    public void createDriver() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("headless");
        driver = new ChromeDriver(opt);
    }

    @Test
    public void fillForm() {
        driver.get("https://www.google.com.br/");

        driver.findElement(By.name("q")).sendKeys("Reddit", Keys.ENTER);
        /*
         * driver.findElement(By.name("email")).sendKeys("jose@gmail");
         * driver.findElement(By.name("cep")).sendKeys("123456");
         * driver.findElement(By.name("estado")).sendKeys("SP");
         */

    }

    @After
    public void closeTab() {
        driver.quit();
    }
}