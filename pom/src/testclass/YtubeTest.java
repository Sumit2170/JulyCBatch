package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom124.ExplorerPage;
import pom124.Homepage;
import pom124.Loginpage;
import pom124.UtubeHome;

public class YtubeTest {

	private WebDriver driver;
	Loginpage loginpage; // globally declare
	Homepage homepage;
	

	   @BeforeClass // annotation start with capital letter Then add TestNG, lib then import BeforeClass from TestNG lib.
	          public void launchbrowser ()  {
		      System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		      driver = new ChromeDriver ();
		      
	
	         driver.get("https://www.youtube.com/");
	}
	    
               	@BeforeMethod
                     public void ClickOnHomeIcon() {
   	                 System.out.println("HomeIcon");
   	                 UtubeHome homepage = new UtubeHome (driver);
   	                   homepage.ClickOnHomeIcon();
    }
               	@Test
               	public void ClickOnExplorer () {
               		ExplorerPage explrorerpage = new ExplorerPage (driver);
               		explrorerpage.ClickOnexplorer();
               		explrorerpage.ClickOntrending();
               		
               		
               	}
	
	
	
	 
//	    loginpage.sendUsername();
//	    loginpage.sendPassword();
//	    loginpage.clickonLogin();
//	    
//	   
	}
//	
//	@Test  (priority=2)
//	public void testA () {    
//		System.out.println("Test1");
//		 
//		  homepage.clickOnReportButton();
//	}
//	
//	@Test  (priority=1)
//	public void testB ()  {
//		System.out.println("Test6");
//	    homepage.clickOnTaskButton();
//	    String url = driver.getCurrentUrl();
//	    if(url.equals("url")) {
//	    	System.out.println("pass");
//	    }
//	    else {
//	    	System.out.println("fail");
//	    }
//	}
//			
//
//	
//	@Test (dependsOnMethods= {"testB","testA"})
//	public void testC () {
//		System.out.println("TestA");
//		homepage.clickOnUserButton();
//	}
//	
//}
