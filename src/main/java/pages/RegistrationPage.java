package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	// gender Button
	@FindBy(id = "uniform-id_gender1")
	WebElement genderType;
	
	//first name box
	@FindBy(id = "customer_firstname")
	WebElement firstNameBox;
	
	//last name box 
	@FindBy(id = "customer_lastname")
	WebElement lastNameBox;
	
	//password box 
	@FindBy(id = "passwd")
	WebElement passwordBox;
	
	//address box 
	@FindBy(id = "address1")
	WebElement addressBox;
	
	//city box 
	@FindBy(id = "city")
	WebElement cityBox;
	
	// state sort 
	@FindBy(id = "id_state")
	WebElement stateSelect;
	
	// post code 
	@FindBy(id = "postcode")
	WebElement postcodeBox;
	
	//country sort 
	@FindBy(id = "id_country")
	WebElement countrySelect;
	
	//phone number box 
	@FindBy(id = "phone_mobile")
	WebElement phoneBox;
	
	//submit button
	@FindBy(id = "submitAccount")
	WebElement submitBtn;
	
	// welcome massage 
	@FindBy(xpath = "//*[@id=\"center_column\"]/p")
	public WebElement welcomeMSG;
	
	// sign out 
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]")
	WebElement signout;
	
	public void userRegistration(String fNmae, String lName , String password, String address ,String city, String statseValue, String postCode , String phoneNumber) {
		
		clickButton(genderType);
		setTextElementText(firstNameBox, fNmae);
		setTextElementText(lastNameBox, lName);
		setTextElementText(passwordBox, password);
		setTextElementText(addressBox, address);
		setTextElementText(cityBox, city);
		selectByvalue(statseValue, stateSelect);
		setTextElementText(postcodeBox, postCode);
		setTextElementText(phoneBox, phoneNumber);
		clickButton(submitBtn);
		
	}
	
	public void userSignout() {
		clickButton(signout);
		
	}
	

}
