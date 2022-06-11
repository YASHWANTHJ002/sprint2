package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkoutpage {
	public WebDriver driver ;
	By Email=By.xpath("//input[@id='input-email']");
	By Password= By.xpath("//input[@id='input-password']");
	By Login= By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	By Uniformstore=By.xpath("//a[contains(text(),'Uniform Store')]");
	By Product=By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
	By Addtocartbutton= By.xpath("//button[@id='button-cart']");
	By Addtocarticon= By.xpath("//header/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/button[1]");
	By viewcart= By.xpath("//body[1]/nav[1]/header[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[1]/strong[1]");
	By Checkoutbutton= By.xpath("//a[contains(text(),'Checkout')]");
	By BDContinuebutton= By.xpath("//input[@id='button-payment-address']");
	By DDContinuebutton= By.xpath("//input[@id='button-shipping-address']");
	By DMContinuebutton= By.xpath("//input[@id='button-shipping-method']");
	By PMCheckbox= By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]");
	By PMContinuebutton= By.xpath("//input[@id='button-payment-method']");
	By Confirmorderbutton= By.xpath("//input[@id='button-confirm']");
	By Continuebutton= By.xpath("//a[contains(text(),'Continue')]");

	public Checkoutpage(WebDriver driver) {
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
	public WebElement Uniformstore() {
		return driver.findElement(Uniformstore);
	}
	public WebElement getProduct() {
		return driver.findElement(Product);
	}
	public WebElement getAddtocartbutton() {
		return driver.findElement(Addtocartbutton);
	}
	public WebElement getAddtocarticon() {
		return driver.findElement(Addtocarticon);
	}
	public WebElement getviewcart() {
		return driver.findElement(viewcart);
	}
	public WebElement getCheckoutbutton() {
		return driver.findElement(Checkoutbutton);
	}
	public WebElement getBDContinuebutton() {
		return driver.findElement(BDContinuebutton);
	}
	public WebElement getDDContinuebutton() {
		return driver.findElement(DDContinuebutton);
	}
	public WebElement getDMContinuebutton() {
		return driver.findElement(DMContinuebutton);
	}
	public WebElement getPMCheckbox() {
		return driver.findElement(PMCheckbox);
	}
	public WebElement getPMContinuebutton() {
		return driver.findElement(PMContinuebutton);
	}
	public WebElement getConfirmorderbutton() {
		return driver.findElement(Confirmorderbutton);
	}
	public WebElement getContinuebutton() {
		return driver.findElement(Continuebutton);
	}
}
