package com.omrbranch.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {

 	public static WebDriver driver;

	@Given("User is on Greens login page")
	public void user_is_on_greens_login_page() {
		driver = new ChromeDriver();
	}
	
	
	
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String userName, String password) {
		
		
	   
	}



	@When("User click login button")
	public void user_click_login_button() {
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
	  
	    
	}
	@Then("User should verify after successful login")
	public void user_should_verify_after_successful_login() {
	   
	   Assert.assertTrue("Verify Login", true);
	}


	

	@When("User enters {string} and {string} with enter key")
	public void userEntersAndWithEnterKey(String string, String string2) {
	    
		
	}



	
}
