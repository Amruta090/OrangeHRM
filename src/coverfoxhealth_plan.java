import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverfoxhealth_plan {
	@FindBy (className="next-btn") private WebElement clicknextbutton;
	//driver.findElement(By.className("next-btn")).click();
	
	public coverfoxhealth_plan(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 
	 }
	public void clickonnexta() {
		clicknextbutton.click();
	}
	}

