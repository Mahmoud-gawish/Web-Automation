package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
	// continue button
		@FindBy(name = "Submit")
		WebElement submittBTN1;
		
		// proceed button
		@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
		WebElement proceedBTN;
		
		public void processtoCheckout() {
			clickButton(submittBTN1);
			clickButton(proceedBTN);
			
		}

}
