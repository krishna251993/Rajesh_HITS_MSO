package com.mobiotics.RunnerPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature/Product.feature"},
		glue= {"com/mobiotics/StepDefinations"},
		
		tags= {"@AddProduct, @AddonsPack"},
		//tags= {"@AddProduct,@AddBasePack"},
		monochrome=true,
		dryRun=true
		
		)
public class RunnerForProductFeature {

}
