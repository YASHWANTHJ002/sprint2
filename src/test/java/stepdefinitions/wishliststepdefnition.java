package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.loginpage;
import pageobjects.wishlistpage;
import resources.base;

import org.junit.runner.RunWith;

public class wishliststepdefnition {


	@RunWith(Cucumber.class)
	public class MyStepDefinitions extends base {

		@Given("^initilize browser with chrome$")
	    public void initilize_browser_with_chrome() throws Throwable {
			 driver =initializeDriver();
	        throw new PendingException();
	    }
		@And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg2) throws Throwable {
			driver.get(strArg2);
	        throw new PendingException();
	    }

	    @And("^Click on product$")
	    public void click_on_product() throws Throwable {
	    	 wishlistpage w=new wishlistpage(driver);
	    	 w.getProduct().click();
	        throw new PendingException();
	    }

	    @And("^click on wishlist$")
	    public void click_on_wishlist() throws Throwable {
	    	 wishlistpage w=new wishlistpage(driver);
	    	 w.getAddtowishlist().click();
	        throw new PendingException();
	    }

	    @And("^click on wishlist icon$")
	    public void click_on_wishlist_icon() throws Throwable {
	    	 wishlistpage w=new wishlistpage(driver);
	    	 w.getWishlisticon().click();
	        throw new PendingException();
	    }

	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	}

}
