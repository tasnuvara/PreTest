package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinNowPage {

	public WebDriver ldriver;
	
	public JoinNowPage(WebDriver rdriver) {
		
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="newUser green")
	WebElement lnkJoinNow;
	
	@FindBy(id="title")
	WebElement DropDown;
	
	@FindBy(id="forename")
	WebElement FirstName;
	
	@FindBy(name="map(lastName)")
	WebElement SurName;
	
	@FindBy(id="checkbox")
	WebElement ChkBox;
	
	
	public void Click_JoinNow() {
		
		lnkJoinNow.click();}
		
		
	public void Select_DropDown() {
			
			DropDown.click();
		}
	public void EnterFirstName(String fstname) {
		
	FirstName.clear();
	FirstName.sendKeys(fstname);
		}

	public void EnterSurName(String sname) {
		
		SurName.clear();
		SurName.sendKeys(sname);
		}
	public void ClickCheckBox() {
		
		ChkBox.click();
	}
}
