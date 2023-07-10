package com.juliocode.test;

import org.junit.After;
import org.junit.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsAmazon {
    private WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();

    }

    @Given("esteja na pagina :{string}")
    public void esteja_na_pagina(String url) {
        driver.get(url);
        throw new io.cucumber.java.PendingException();
    }

    @When("fazer busca por :{string}")
    public void fazer_busca_por(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verificar valor acima de {string}")
    public void verificar_valor_acima_de(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void depois() {

    }

}
