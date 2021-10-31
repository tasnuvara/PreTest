package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.JoinNowPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Steps {


	public WebDriver driver;
	public JoinNowPage Jp;
	
	@Given("User Launch Chrome Brower")
	public void user_launch_chrome_brower() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		Jp=new JoinNowPage(driver);
	
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
	driver.get("url");    
	}

	@Then("User Click on Join Now Link")
	public void user_click_on_join_now_link() {
	    Jp.Click_JoinNow();
	    
	}

	@Then("User Select Title Value from the dropdown")
	public void user_select_title_value_from_the_dropdown(WebElement DropDown) {
	    Select select =new Select(DropDown);
	    select.deselectByVisibleText("Mrs");
	    
	}

	@Then("User Enter First Name as {string} and Surname as {string}")
	public void user_enter_first_name_as_and_surname_as(String fstname, String sname) {
	    Jp.EnterFirstName(fstname);
	    Jp.EnterSurName(sname);
	}

	@Then("User Click the Tickbox with Text {string}")
	public void user_click_the_tickbox_with_text(String string) {
	    Jp.ClickCheckBox();
	}

	@When("User Click Join Now Link")
	public void user_click_join_now_link() {
	    Jp.Click_JoinNow();
	}

	@Then("Page message Should be {string} under Date of Birth Box")
	public void page_message_should_be_under_date_of_birth_box(String string) {
	   if (driver.getPageSource().contains("This field is required")) {
		   driver.close();
		   Assert.assertTrue(false);}
		   
		   else {
		Assert.assertEquals("title", driver.getTitle());
		}
		   
	}

	@Then("Close Brower")
	public void close_brower() {
		
		driver.quit();
		
	    
	}


	
	
	
	
}
