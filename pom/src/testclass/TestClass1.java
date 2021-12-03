package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom124.Homepage;
import pom124.Loginpage;

public class TestClass1 {

    public static void main(String[] args) {
    	
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver ();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     driver.get("https://www.freecharge.in/");
	     {   
	     Homepage homepage = new Homepage(driver); // import Homepage from pom124
	     homepage.clickOnLogin();
	      // homepage.mobile();
	     }
    
	     {     Loginpage EnterNo = new Loginpage(driver); // import Loginpage from pom124
               EnterNo.SendMobileNO();
	     }
	 
    }
}


