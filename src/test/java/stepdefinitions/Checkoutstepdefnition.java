package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.Checkoutpage;
import pageobjects.loginpage;
import resources.base;

import org.junit.runner.RunWith;

public class Checkoutstepdefnition {


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

	    @And("^enter (.+),  (.+)$")
	    public void enter_(String emailaddress, String password) throws Throwable {
	    	 Checkoutpage c=new Checkoutpage(driver);
			 c.getEmail().sendKeys("yashwanthgowda002@gamil.com");
			 c.getPassword().sendKeys("123456789");
	        throw new PendingException();
	    }

	    @And("^Click on login$")
	    public void click_on_login() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c.getLogin().click();
	        throw new PendingException();
	    }
	    
	    @And("^Click on Uniform store")
	    public void click_on_Uniform_store() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c.Uniformstore().click();
	        throw new PendingException();
	    }

	    @And("^Click on product$")
	    public void click_on_product() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c.getProduct().click();
	        throw new PendingException();
	    }

	    @And("^click on Add to cart button$")
	    public void click_on_add_to_cart_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c.getAddtocartbutton().click();
	        throw new PendingException();
	    }

	    @And("^click on Add to cart icon$")
	    public void click_on_add_to_cart_icon() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c.getAddtocarticon().click();
	        throw new PendingException();
	    }

	    @And("^click on viewcart button$")
	    public void click_on_viewcart_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getviewcart().click();
	        throw new PendingException();
	    }

	    @And("^click on checkout button$")
	    public void click_on_checkout_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getCheckoutbutton().click();
	        throw new PendingException();
	    }

	    @And("^click on Billing details continue button$")
	    public void click_on_billing_details_continue_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getBDContinuebutton().click();
	        throw new PendingException();
	    }

	    @And("^click on Delivery details continue button$")
	    public void click_on_delivery_details_continue_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getDDContinuebutton().click();
	    	throw new PendingException();
	    }

	    @And("^click on Deliviry method continue button$")
	    public void click_on_deliviry_method_continue_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getDMContinuebutton().click();
	        throw new PendingException();
	    }

	    @And("^click on Payment method checkbox button$")
	    public void click_on_payment_method_checkbox_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getPMCheckbox().click();
	        throw new PendingException();
	    }

	    @And("^click on Payment method continue button$")
	    public void click_on_payment_method_continue_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getPMContinuebutton().click();
	        throw new PendingException();
	    }

	    @And("^click on Confirm order button$")
	    public void click_on_confirm_order_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getConfirmorderbutton().click();
	        throw new PendingException();
	    }

	    @And("^click on continue button$")
	    public void click_on_continue_button() throws Throwable {
	    	Checkoutpage c=new Checkoutpage(driver);
	    	c. getContinuebutton().click();
	        throw new PendingException();
	    }
	    

	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	}

}
