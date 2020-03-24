package com.StepDefinition;

import java.io.IOException;

import com.Pages.Page_Register;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Register 
{
	Page_Register pr=new Page_Register();
	
	@Given("^The user launch and register the application with valid and invalid details$")
	public void the_user_launch_and_register_the_application_with_valid_and_invalid_details() throws IOException 
	{
		pr.registeration();
	}
	@And("^close the browser$")
	public void close_the_browser() throws Exception 
	{
		Thread.sleep(3000);
		pr.quit();
	}
	

	
}
