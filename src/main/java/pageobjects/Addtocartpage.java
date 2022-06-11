package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addtocartpage {
	public WebDriver driver ;
	

	By Product=By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
	By Addtocartbutton= By.xpath("//button[@id='button-cart']");
	By Addtocarticon= By.xpath("//header/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/button[1]");
	By viewcart= By.xpath("//body[1]/nav[1]/header[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[1]/strong[1]");
	By ContinueShopping= By.xpath("//a[contains(text(),'Continue Shopping')]");
	
	public Addtocartpage(WebDriver driver) {
		this.driver=driver;
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
	public WebElement getContinueShopping() {
		return driver.findElement(ContinueShopping);
	}

}
