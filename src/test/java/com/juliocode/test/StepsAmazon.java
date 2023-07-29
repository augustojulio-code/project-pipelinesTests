package com.juliocode.test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.juliocode.pages.HomePage;

public class StepsAmazon {
    private WebDriver driver;

    @Before
    public void before() {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("headless");

        driver = new ChromeDriver(opt);
    }

    @Given("esteja na pagina : {string}")
    public void esteja_na_pagina(String url) {
        driver.get(url);

    }

    @When("fazer busca por : {string}")
    public void fazer_busca_por(String item) {
        try {
            HomePage page = new HomePage(driver);
            page.searchItem(item);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

    }

    @Then("Verificar valor acima de : {string}")
    public void verificar_valor_acima_de(String priceItem) {

    }

    @After
    public void depois() {
        driver.quit();
    }

}
