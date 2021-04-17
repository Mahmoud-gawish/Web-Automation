package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	// proceed button 
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement FprceedBTN;
	
	// second Proceed button 
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	WebElement SproceedBTN;
	
	// agreement button 
	@FindBy(id = "cgv")
	WebElement agreementBtn;
	
	// 3 proceed button 
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	WebElement TproceedBTN;
	
	// payment by bank 
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")
	WebElement bankBTN;
	
	// confirm button 
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement confirmBTN;
	
	// success massage 
	@FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
	public WebElement successOrder;
	
	public void userCheckOut() {
		clickButton(FprceedBTN);
		clickButton(SproceedBTN);
		clickButton(agreementBtn);
		clickButton(TproceedBTN);
		clickButton(bankBTN);
		clickButton(confirmBTN);
		
	}
	
	

}
