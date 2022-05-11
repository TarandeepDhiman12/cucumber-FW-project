package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BackgroundColor;
import pages.TestBase;

public class StepDefinitions extends TestBase {
 
	BackgroundColor backgroundcolor;
	
	@Before
	public void beforeRun() {
		initDriver();
		backgroundcolor = PageFactory.initElements(driver, BackgroundColor.class);
	
	}
	@Given("^user is on techfios test page$")
	public void user_is_on_techfios_test_page()   {
	  Assert.assertEquals("NSS-TODO List v 1.1", backgroundcolor.checkHomePage());
	  takeScreenshot(driver);
	}
	@When("^button Set SkyBlue Background exists$")
	public void button_Set_SkyBlue_Background_exists() {
	   Assert.assertEquals("Set SkyBlue Background", backgroundcolor.checkSkyBlue()); 
	   takeScreenshot(driver);
	}
	    
	@When("^user clicks on blue button$")
	public void user_clicks_on_blue_button() {
		backgroundcolor.clickSkyButton();
		 
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		 
		takeScreenshot(driver);
	}
	@When("^button Set SkyWhite Background exists$")
	public void button_Set_SkyWhite_Background_exists() {
		Assert.assertEquals("Set White Background", backgroundcolor.checkWhite()); 
	    takeScreenshot(driver);
	}

	@When("^user clicks on white button$")
	public void user_clicks_on_white_button() {
		backgroundcolor.clickWhiteButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		 
		takeScreenshot(driver);
	}
	@After
	public void afterRun() throws InterruptedException {
		tearDown();
	}


}

