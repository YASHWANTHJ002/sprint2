package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



	public class loginpage {
		public WebDriver driver ;
		By Email=By.xpath("//input[@id='input-email']");
		By Password= By.xpath("//input[@id='input-password']");
		By Login= By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	   
		
	public loginpage(WebDriver driver) {
			this.driver=driver;
		}
	
	


	public WebElement getEmail() {
		return driver.findElement(Email);
		}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getLogin() {
		return driver.findElement(Login);
	}
	
}

	
	



