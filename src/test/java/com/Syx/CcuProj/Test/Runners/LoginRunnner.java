package com.Syx.CcuProj.Test.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//we specify it with our path for our feature file bellow
@CucumberOptions(features="C:\\Users\\ahmad\\eclipse-workspace\\com.cucumber\\src\\test\\resources\\Features\\Login.feature"
					, glue=" ") 
//here we will have to specify our step definition 

public class LoginRunnner {

	
}
