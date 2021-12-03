package pom124;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplorerPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="(//a[@id='endpoint'])[2]")
	private WebElement explorerButton;
	
	@FindBy(xpath="(//a[@id='destination-content-root'])[1]")
	private WebElement trendingtrending;
	
	
	 public ExplorerPage (WebDriver driver) {
		 this.driver=driver;
		 wait = new WebDriverWait (driver,10);
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	  
	  public void ClickOnexplorer() {
		  explorerButton.click();
		  
	  }
	  
	  public void ClickOntrending() {
		  trendingtrending.click();
		  
	  }



}
