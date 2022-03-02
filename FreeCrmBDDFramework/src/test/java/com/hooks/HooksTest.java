package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksTest {
	
	@Before(order = 1)
	public void setup (Scenario sc) {
		System.out.println("Launch the browser");
		System.out.println(sc.getId());
	}
	
	@Before("@Regression")
	public void setup1 (Scenario sc) {
		System.out.println("Launch the url");
		System.out.println(sc.isFailed());
	}
		
	@After(order = 1)
	public void tearDown1 (Scenario sc) {
		System.out.println("Close the browser");
		System.out.println(sc.getName());
	}
	@After("@Regression")
	public void tearDown(Scenario sc) {
		System.out.println("Logout the application");
		System.out.println(sc.getStatus());
	}
//	@BeforeStep
//	public void takeScreenShot() {
//		System.out.println("Screen Shot");
//	}
//	@AfterStep
//	public void refresh() {
//		System.out.println("REFRESH");
//	}

}
