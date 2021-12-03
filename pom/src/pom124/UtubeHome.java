package pom124;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtubeHome {

	
		
		private WebDriver driver;
		private WebDriverWait wait;
		
		  @FindBy(xpath="(//a[@id='endpoint'])[1]")
		  private WebElement HomeIcon;
		  
		  public UtubeHome  (WebDriver driver) {
			  this.driver = driver;
			  wait = new WebDriverWait (driver,10);
			  
			  PageFactory.initElements(driver,this);
			  
		  }
		  
		  public void ClickOnHomeIcon () {
			  HomeIcon.click();
			  
		  }

	}


