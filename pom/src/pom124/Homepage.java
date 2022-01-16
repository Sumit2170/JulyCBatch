package pom124;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	private WebDriver driver;
	private WebDriverWait wait;

	  @FindBy(xpath="//span[text()='login / register']")
	  private WebElement login ajit;
	  
	  @FindBy(xpath="(//div[@class='tile-img-tag'])[1]")
	  private WebElement mobileIcon sumit ;
	  
	  public Homepage (WebDriver driver) {
		  this.driver = driver;
		  wait = new WebDriverWait (driver,20);
		  PageFactory.initElements(driver,this);
	  }
	  
	  public void clickOnLogin ramesh() {
		  wait.until(ExpectedConditions.visibilityOf( login));
		  login.click();
	     //mobileIcon.click();
	  }
	  
	  public void mobile() {
		  mobileIcon.click();
	  }

	public void clickOnreportButton() {
	        
	}
	
	public void logoutFromSumitBhosale () {
		
	}
	  
}
