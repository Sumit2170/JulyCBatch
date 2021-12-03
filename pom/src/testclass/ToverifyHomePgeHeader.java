package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.pack.Base;
import pom124.Homepage;
import pom124.Loginpage;

public class ToverifyHomePgeHeader extends Base{
	
	WebDriver driver;
	Loginpage loginpage; // globally declare
	Homepage homepage;
	SoftAssert softAssert; // import from TestNg
	@BeforeClass
	@Parameters ("browser")//import from TestNg annotation
	
	public void launchBrowser (String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = openChromeBrowser() ;  // This method from Base class in that object of chrome
	     }
	
	   if (browser.equals("Firefox"))
	   {
		        driver = openFirefoxBrowser();
	   }
	}
//	         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        // driver.manage().window().maximize();
	


	          //@BeforeClass // annotation start with capital letter Then add TestNG, lib then import BeforeClass from TestNG lib.
	               public void launchApplication () {
	               System.out.println("Before class");
	       {
		          driver.get("https://www.freecharge.in/");
		          softAssert = new SoftAssert();
		          loginpage = new Loginpage(driver);  // 
		          homepage  = new Homepage (driver);    
	        }
	          }
	}
	
//	@BeforeMethod
//	public void loginToActitime() {
//		System.out.println("Before Method");
//	    
//	    loginpage.sendUsername();
//	    loginpage.sendPassword();
//	    loginpage.clickonLogin();
//	    
//	   
//	}
//	
//	@Test  (priority=1)
//	public void verifyreportButton () {
//		
//		string action = Util.exceldata(2,3);
//		
//		System.out.println("Test1");
//		 
//     	  String url = driver.getCurrentUrl(); //actual result
//		  softAssert.assertEquals(url,"https://www.freecharge.in/");  //here if else code convrted into one line
//		  
//		  System.out.println("Next step");
//		  homepage.clickOnreportButton();
//		  
//		  url = driver.getCurrentUrl();
//		  Assert.assertEquals(url,"https://www.freecharge.in/");
//		  
//		  String tital = driver.getTitle();
//		  Assert.assertEquals(tital,"xyz");
//		  
//		  softAssert.assertAll();
//	}
//	
//	    @Test  (priority=2)
//	    public void verifyTaskButton1 ()  {
//		System.out.println("Test2");
//		
//		  String url = driver.getCurrentUrl(); //actual result
//		  softAssert.assertEquals(url,"https://www.freecharge.in/");  //here if else code convrted into one line
//		  
//		  System.out.println("Next step");
//		  homepage.clickOnTaskButtonButton(); // here we have create methd on pom class
//		  
//		  url = driver.getCurrentUrl();
//		  Assert.assertEquals(url,"https://www.freecharge.in/");
//		  
//		  String tital = driver.getTitle();
//		  Assert.assertEquals(tital,"xyz");
//		  
//		  softAssert.assertAll();
//	    }
//	    
//	    @AfterMethod
//	    public void closedbrowser();{
//	     driver.quit();
//	    }
//			
//
//	
//	@Test (priority=4)
//	public void verifyUserButton () {
//		System.out.println("TestA");
//	//	homepage.clickOnUserButton();
//	}
//	
//	@Test (priority=3)
//         public void testB()
//	{
//		System.out.println("TestB");
//	}
//
//	
//	@Test (priority=0)
//	public void testE () {
//		System.out.println("Test7");
//	}
//	
//	@AfterMethod
//	public void logoutFromActitime () {
//		System.out.println("aftermethod");
//		homepage.clickonlogout();
//	}
//	
//	@AfterClass
//	public void cleanObject () {
//		  softAssert = null;
//	      loginpage = null; // 
//	      homepage  = null;;
//	}
//	
//	@AfterTest
//	public void closedBrowser() {
//		driver.close();
//		 //or
//		driver.quit();
//		driver = null;
//		System.gc();// garbage collector
//	}
//		   
//		 
//	}
//	
//
//} 
