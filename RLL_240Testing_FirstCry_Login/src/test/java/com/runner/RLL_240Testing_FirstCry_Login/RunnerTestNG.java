package com.runner.RLL_240Testing_FirstCry_Login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resource/com/features/Login",
glue = "com.stepdefinition.RLL_240Testing_FirstCry_Login",
plugin = {"pretty", "html:target/cucumber-reports.html"},
tags = "@HomePage or @Login",
monochrome = true
)

public class RunnerTestNG extends AbstractTestNGCucumberTests{
}
