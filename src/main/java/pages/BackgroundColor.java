package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColor {

	WebDriver driver;

	public BackgroundColor(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "button[onclick = 'myFunctionSky()']")
	WebElement SKYBLUE_BTN;
	@FindBy(how = How.CSS, using = "button[onclick = 'myFunctionWhite()']")
	WebElement WHITE_BTN;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement SKYBLUE_BTNTXT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement WHITE_BTNTXT;
	@FindBy(how = How.CSS, using = "#label-first > b")
	WebElement HOMEPAGE_HEADER;
	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']")
	WebElement PAGE_IS_SKYBLUE;
	@FindBy(how = How.CSS, using = "body[style='background-color: white;']")
	WebElement PAGE_IS_WHITE;
//	@FindBy(how = How.XPATH,using ="/html/body")
//	WebElement WHITE_BCKGRND_CLR;
//	@FindBy(how = How.XPATH,using ="/html/body") 
//	WebElement SKY_BL_BCKGRND_CLR;

	public void clickSkyButton() {
		SKYBLUE_BTN.click();
	}

	public void clickWhiteButton() {
		WHITE_BTN.click();
	}

	public String checkSkyBlue() {
		return SKYBLUE_BTNTXT.getText();
	}

	public String checkWhite() {
		return WHITE_BTNTXT.getText();
	}

	public String checkHomePage() {
		return HOMEPAGE_HEADER.getText();

	}

	public String skybluePage() {
		return PAGE_IS_SKYBLUE.getText();

	}

	public String whitePage() {
		return PAGE_IS_WHITE.getText();
	}

}
