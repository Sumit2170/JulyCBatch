package pom124;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {                                // This is pom class(Loginpage)
	
	private WebDriver driver;      //global variable
	private WebDriverWait wait;    // Ref declare globally
	
	@FindBy (xpath="//input[@id='mobile']")
	private WebElement MobileNo;
	

		
	public Loginpage (WebDriver driver)
	{
		  this.driver = driver;                            // global variable = local variable
		  wait = new WebDriverWait (driver,10);
		  PageFactory.initElements(driver,this);         // driver=driver123  ('this' arg for this class)
	}      
	
	public void SendMobileNO()
	    {
		wait.until(ExpectedConditions.visibilityOf(MobileNo)); 
		MobileNo.sendKeys("8668985477");
		}
}
