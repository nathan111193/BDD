package org.example;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/nathanpereira/IdeaProjects/BDD/src/test/Resources/Homepage1.feature", tags = {"@DoubleOutput"},
plugin = {"html:target/cucumber-html-report",
         "json:target/cucumber-json-report.json",
         "junit:target/cucumber-xml-report.xml",
         "pretty:target/cucumber-pretty-report.txt"}
)

public class RunCukeTest
{

}

//push code into own branch
//push into the Dev branch
//push into my own branch
//this is demo1
//this is the pull command demo
