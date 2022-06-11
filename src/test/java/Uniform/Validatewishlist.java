package Uniform;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.wishlistpage;
import resources.base;

public class Validatewishlist extends base {

	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.get(prop.getProperty("url2"));
	}

	@Test
	public void wishlist() throws IOException{
		wishlistpage w=new wishlistpage(driver);
		w. getProduct().click();
		w. getAddtowishlist().click();
		w.getWishlisticon().click();
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null; 

	}

}
