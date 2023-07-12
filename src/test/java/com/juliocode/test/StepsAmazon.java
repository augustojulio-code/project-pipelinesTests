package com.juliocode.test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsAmazon {
    WebDriver driver;

    @Before
    public void before() {

        driver = new ChromeDriver();
        // driver.get("https://www.amazon.com.br/");
    }

    /*
     * @Test
     * public void openBrowwser() {
     * driver.get("https://www.amazon.com.br/");
     * }
     */

    @Given("esteja na pagina : {string}")
    public void esteja_na_pagina(String string) {
        driver.get(string);

    }

    @When("fazer busca por : {string}")
    public void fazer_busca_por(String string) {
        System.out.println("" + string);
    }

    @Then("Verificar valor acima de : {string}")
    public void verificar_valor_acima_de(String string) {
        System.out.println("" + string);
    }

    @After
    public void depois() {
        // System.out.println("Olá imbecil");
    }

}
