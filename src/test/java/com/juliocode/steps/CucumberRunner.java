package com.juliocode.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, plugin = { "pretty" }, features = {
        "src\\test\\java\\com\\juliocode\\feature" }, glue = {
                "com.juliocode.steps" })
public class CucumberRunner {

}
