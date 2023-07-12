package com.juliocode.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, plugin = { "pretty" }, features = {
        "src\\test\\resources" }, glue = {
                "com.juliocode.test" })
public class CucumberRunner {

}
