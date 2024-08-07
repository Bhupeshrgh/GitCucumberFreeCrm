package com.freecrm.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


 @RunWith(Cucumber.class)

  @CucumberOptions(
          features = "C:\\Users\\hp\\git\\repository\\FreeCrmBDDFramework\\src\\test\\java\\com" ,     //path of the feature files
		//glue = {"com.stepdefinition.step1", "com.stepdefinition.step2"}, // in case of multiple packages to run
          glue = {"com.stepdefinition"} ,       //path of the step definition class helpers method
		  plugin = {"pretty","html:html_output/cucumber.html" , "json:json_output/cucumber.json", "junit:junit_output/cucumber.xml"}  ,    //plugin inplace of format, used to generate different types of reporting format
		  dryRun = false ,  //  | true or false //to check the mapping is proper between feature file and step definition, by default it is false
		 //strict = true,     //will check if any step is undefined in step definition class
		  monochrome = true,   //display console output in readable format | true or false		  
		 // tags = "@Regression and @Smoke" 
		 tags = "@Contacts" 
		  )

public class TestRunner {

}
