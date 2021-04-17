package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;

public class RegistrationTest extends TestBase {
	
	
	HomePage homeObject;
	MyAccountPage myAccObject;
	RegistrationPage registerObject;
	
	Faker fakeData = new Faker();
	String firstname = fakeData.name().firstName();
	String lastname = fakeData.name().lastName();
	String email = fakeData.internet().emailAddress();
	String password = fakeData.number().digits(6).toString();
	String address = fakeData.address().streetAddress();
	String city = fakeData.address().cityName();
	String phone = fakeData.phoneNumber().toString();
	
	
	
	@Test(priority = 1)
	@Severity(SeverityLevel.CRITICAL)
	@Description("user registration")
	public void userRegistartion() {
		
		homeObject = new HomePage(driver);
		homeObject.openLoginPage();
		myAccObject = new MyAccountPage(driver);
		myAccObject.createEmail(email);
		registerObject =new RegistrationPage(driver);
		registerObject.userRegistration(firstname, lastname, password, address, city, "4","12345" , "01245252547");
		Assert.assertTrue(registerObject.welcomeMSG.getText().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
		
	}
	@Test(priority = 2)
	public void userSignout() {
		registerObject =new RegistrationPage(driver);
		registerObject.userSignout();
		myAccObject = new MyAccountPage(driver);
		assertTrue(myAccObject.authenticationMsg.isDisplayed());
		
	}

}
