package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	//registration e-mail
	@FindBy(id = "email_create")
	WebElement emailCreate;
	
	// create account Button 
	@FindBy(id = "SubmitCreate")
	WebElement submitBTN;
	
	// AUTHENTICATION presented 
	@FindBy(xpath = "//*[@id=\"columns\"]/div[1]")
	public WebElement authenticationMsg;
	
	//login email box 
	@FindBy(id = "email")
	WebElement loginBox;
	
	//password box 
	@FindBy(id = "passwd")
	WebElement passwordBox;
	
	// submit login 
	@FindBy(id = "SubmitLogin")
	WebElement submitLog;
	
	// return home button
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a/span")
	WebElement homeBTN;
	
	public void createEmail(String email) {
		setTextElementText(emailCreate, email);
		clickButton(submitBTN);
		
	}
	
	public void userlogin(String Lemail, String password) {
		
		setTextElementText(loginBox, Lemail);
		setTextElementText(passwordBox, password);
		clickButton(submitLog);
		
	}
	public void returnHome() {
		clickButton(homeBTN);
		
		
	}

}
