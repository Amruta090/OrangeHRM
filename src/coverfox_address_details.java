import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverfox_address_details {
	@FindBy (className="mp-input-text") private WebElement  Pincode;
	@FindBy (id="want-expert") private WebElement  MobileNumber;
	@FindBy (className="next-btn") private WebElement continuebutton;
	
	public coverfox_address_details(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}
	public void pincode(String pin) {
		Pincode.sendKeys(pin);
	}
	public void mobNum(String mob) {
		MobileNumber.sendKeys(mob);
}
	public void ContinueButton() {
		
		continuebutton.click();
}
	}