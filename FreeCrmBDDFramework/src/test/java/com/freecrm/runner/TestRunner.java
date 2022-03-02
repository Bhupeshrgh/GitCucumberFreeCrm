package com.freecrm.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


 @RunWith(Cucumber.class)
  @CucumberOptions(
          features = "C:\\Users\\hp\\git\\repository\\FreeCrmBDDFramework\\src\\test\\java\\com\\features\\orders.feature" ,     //path of the feature files
		  glue = {"com.stepdefinition" , "com.hooks"} ,       //path of the step definition class
		  plugin = {"pretty","html:html_output/cucumber.html" , "json:json_output/cucumber.json", "junit:junit_output/cucumber.xml"}  ,    //plugin inplace of format, used to generate different types of reporting format
		  dryRun = false ,  //  | true or false //to check the mapping is proper between feature file and step definition
		 //strict = true,     //will check if any step is undefined in step definition class
		  monochrome = true  , //display console output in readable format | true or false
		 tags = "@Regression"
		  )

public class TestRunner {

}
