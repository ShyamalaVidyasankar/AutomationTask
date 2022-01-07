package com.maven.testscript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", 
		"html:Reports", 
		"junit:Reports/cucumber.xml",
		"json:Reports/cucumber.json" },
		features = "src\\test\\java\\com\\maven\\feature",
		glue = "com.maven.stepdefinition",
		tags = {"@Api"},
		strict = false
		)

public class TestRunner {

}
