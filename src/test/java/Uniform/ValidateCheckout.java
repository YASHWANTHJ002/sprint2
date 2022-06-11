package Uniform;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Checkoutpage;
import pageobjects.loginpage;
import resources.base;

public class ValidateCheckout  extends base{

	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.get(prop.getProperty("url1"));
	}

	@Test
	public void Checkout() throws IOException{
		Checkoutpage c=new Checkoutpage(driver);
		c.getEmail().sendKeys("yashwanthgowda002@gmail.com");
		c.getPassword().sendKeys("123456789");
		c.getLogin().click();
		c.Uniformstore().click();
		c.getProduct().click();
		c.getAddtocartbutton().click();
		c.getAddtocarticon().click();
		c.getviewcart().click();
		c.getCheckoutbutton().click();
		c.getBDContinuebutton().click();
		c.getDDContinuebutton().click();
		c.getDMContinuebutton().click();
		c.getPMCheckbox().click();
		c.getPMContinuebutton().click();
		c.getConfirmorderbutton().click();
		c.getContinuebutton().click();
	}

	@AfterTest
	public void teardown() { 
		driver.close();
		driver=null; 

	}

}
