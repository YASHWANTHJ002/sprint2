package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wishlistpage {
	public WebDriver driver ;
	
	By Product=By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
	By Addtowishlist= By.xpath("//span[contains(text(),'Add to Wish List')]");
	By Wishlisticon= By.xpath("//header/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/i[1]");
	
	public wishlistpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getProduct() {
		return driver.findElement(Product);
		}
	public WebElement getAddtowishlist() {
		return driver.findElement(Addtowishlist);
	}
	public WebElement getWishlisticon() {
		return driver.findElement(Wishlisticon);
	}

   

}
