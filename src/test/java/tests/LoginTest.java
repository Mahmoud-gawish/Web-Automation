package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.MyAccountPage;
import pages.RegistrationPage;

public class LoginTest extends TestBase{

	MyAccountPage myAccObject;
	RegistrationPage registerObject;


	@DataProvider(name = "ExcelData")
	public Object[][] userLoginData() throws IOException{
		
		// get data from excel reader 
		ExcelReader ER = new ExcelReader();
		
			return ER.getExcelData();
		
	}
	@Test(priority = 1,dataProvider = "ExcelData")
	@Severity(SeverityLevel.CRITICAL)
	@Description("user login")
	public void userCanLogin(String email, String password) {
		myAccObject = new MyAccountPage(driver);
		myAccObject.userlogin(email, password);
		registerObject =new RegistrationPage(driver);
		Assert.assertTrue(registerObject.welcomeMSG.getText().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
	}
	@Test(priority = 2)
	public void userReturnHome() {
		myAccObject = new MyAccountPage(driver);
		myAccObject.returnHome();


	}

}
