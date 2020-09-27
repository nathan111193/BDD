package org.example;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/nathanpereira/IdeaProjects/BDD/src/test/Resources/Homepage1.feature", tags = {"@Multipleinput"},
plugin = {"html:target/cucumber-html-report",
         "json:target/cucumber-json-report.json",
         "junit:target/cucumber-xml-report.xml",
         "pretty:target/cucumber-pretty-report.txt"}
)

public class RunCukeTest
{

}

//push into the Dev branch