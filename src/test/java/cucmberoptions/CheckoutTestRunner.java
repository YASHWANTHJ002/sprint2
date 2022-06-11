package cucmberoptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="Checkoutstepdefnition")


public class CheckoutTestRunner extends AbstractTestNGCucumberTests  {

}
