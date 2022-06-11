package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.Addtocartpage;
import pageobjects.wishlistpage;
import resources.base;

import org.junit.runner.RunWith;


public class Addtocartstepdefnition {


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
    	 Addtocartpage a=new Addtocartpage(driver);
    	 a.getProduct().click();
        throw new PendingException();
    }

    @And("^click on Add to cart button$")
    public void click_on_add_to_cart_button() throws Throwable {
    	 Addtocartpage a=new Addtocartpage(driver);
    	 a.getAddtocartbutton().click();
        throw new PendingException();
    }

    @And("^click on Add to cart icon$")
    public void click_on_add_to_cart_icon() throws Throwable {
    	 Addtocartpage a=new Addtocartpage(driver);
    	 a.getAddtocarticon().click();
        throw new PendingException();
    }

    @And("^click on viewcart button$")
    public void click_on_viewcart_button() throws Throwable {
    	 Addtocartpage a=new Addtocartpage(driver);
    	 a. getviewcart().click();
        throw new PendingException();
    }

    @And("^click on continue button$")
    public void click_on_continue_button() throws Throwable {
    	 Addtocartpage a=new Addtocartpage(driver);
    	 a.getContinueShopping().click();
        throw new PendingException();
    }
    
    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
        throw new PendingException();
    }


  }

}
