package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.RegistrationPage;

public class CheckoutTest extends TestBase {
	
	HomePage homeObject;
	CartPage cartObject;
	CheckoutPage checkoutObject;
	RegistrationPage registerObject;

	
	@Test
	public void userCheckout() {
		
		homeObject = new HomePage(driver);
		homeObject.addToCart();
		cartObject = new CartPage(driver);
		cartObject.processtoCheckout();
		checkoutObject = new CheckoutPage(driver);
		checkoutObject.userCheckOut();
		Assert.assertTrue(checkoutObject.successOrder.getText().contains("Order confirmation"));
		
	}

}
