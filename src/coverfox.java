import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class coverfox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		// page1
		driver.findElement(By.xpath("//div[text()='Female']")).click();
		// page2
		Thread.sleep(2000);
		driver.findElement(By.className("next-btn")).click();
		// page3
		Thread.sleep(2000);
		WebElement agedropdown = driver.findElement(By.xpath("//select[@name='You']"));
		Select sc = new Select(agedropdown);
		sc.selectByValue("26y");
		driver.findElement(By.className("next-btn")).click();
		// page4
		Thread.sleep(2000);
		driver.findElement(By.className("mp-input-text")).sendKeys("416113");
		driver.findElement(By.id("want-expert")).sendKeys("8888888888");
		driver.findElement(By.className("next-btn")).click();
		//page5
		//Validation
		Thread.sleep(2000);
		String upperresult = driver.findElement(By.xpath("//div[contains(text(),'matching Health Insurance Plans')]")).getText();
		System.out.println(upperresult);
		String result = upperresult.substring(0, 2);
		System.out.println(result);
		int result1 = Integer.parseInt(result);//TC1
		int result2= driver.findElements(By.className("pcc-main")).size();
		System.out.println(result2);
		driver.quit();
		if(result1==result2) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		
	}

}
