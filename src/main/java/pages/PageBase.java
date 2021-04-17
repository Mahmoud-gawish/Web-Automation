package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {

	protected WebDriver driver;
	public Select select ; 
	public Actions action ; 


	//create constructor
	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);

	} 

	protected static void clickButton(WebElement button) {

		button.click();


	}

	protected static void setTextElementText(WebElement textElement , String value) {

		textElement.clear();
		textElement.sendKeys(value);


	}
	
	protected  void selectByIndex(int index, WebElement elem) {
	      Select drop = new Select(elem);
	      drop.selectByIndex(index);  
	}
	
	protected  void selectByvalue(String index, WebElement elem) {
	      Select drop = new Select(elem);
	      drop.selectByValue(index);  
	}

	
	protected  void selectByName(String index, WebElement elem) {
	      Select drop = new Select(elem);
	      drop.selectByVisibleText(index);  
	}


}
