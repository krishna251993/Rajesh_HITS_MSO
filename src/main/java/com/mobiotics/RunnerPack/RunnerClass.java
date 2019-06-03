package com.mobiotics.RunnerPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature/LCOList.feature"},
		glue= {"com/mobiotics/StepDefinations"},
		tags= {"@LCO"},
		monochrome=true,
		dryRun=false
		
		)

public class RunnerClass {

}
