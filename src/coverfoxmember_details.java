import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class coverfoxmember_details {
	@FindBy (xpath="//select[@name='You']") private WebElement  agedropdown;
	@FindBy (className="next-btn") private WebElement clicknextbutton;
	
	
	public coverfoxmember_details(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 
	 }
	public void agedropdown() {
		Select sc = new Select(agedropdown);
		sc.selectByValue("26y");
		
		}
	public void clickonnextb() {
		
		clicknextbutton.click();
	}
	}



