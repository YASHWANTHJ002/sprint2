package Uniform;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Addtocartpage;
import pageobjects.wishlistpage;
import resources.base;

public class validateAddtocart extends base {

	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest

	public void initialize() throws IOException
	{

		driver =initializeDriver();
		driver.get(prop.getProperty("url2"));
	}

	@Test
	public void Addtocart() throws IOException{
		Addtocartpage a=new Addtocartpage(driver);
		a.getProduct().click();
		a.getAddtocartbutton().click();
		a.getAddtocarticon().click();
		a.getviewcart().click();
		a.getContinueShopping().click();
	}
	@AfterTest
	public void teardown() { 
		driver.close();
		driver=null; 

	}

}
