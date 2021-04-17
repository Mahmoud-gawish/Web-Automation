package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	//login button 
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement loginBTN;
	
	// first item 
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div")
	WebElement firstItem;
	
	// continue checkout
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement checkContinue;
	
	@FindBy(name = "submit")
	WebElement submitBTN;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement openCheckout;
	
	
	public void openLoginPage() {
		clickButton(loginBTN);
		
		
	}
	public void addToCart() {
		clickButton(firstItem);
		//clickButton(submitBTN);
		//clickButton(openCheckout);
		
		
	}
	
}
