import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverfox_Homepage {
@FindBy (xpath="//div[text()='Female']") private WebElement clickfemalebutton;


 public coverfox_Homepage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 
 }
public void clickfemale() {
	clickfemalebutton.click();
}
}
