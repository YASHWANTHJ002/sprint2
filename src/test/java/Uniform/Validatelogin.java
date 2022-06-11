package Uniform;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.loginpage;
import resources.base;
public class Validatelogin extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.get(prop.getProperty("url1"));

	}
	@Test
	public void login() throws IOException{
		loginpage e=new loginpage(driver);
		e.getEmail().sendKeys("yashwanthgowda002@gmail.com");
		e.getPassword().sendKeys("123456789");
		e.getLogin().click();
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null; 



	}


}





