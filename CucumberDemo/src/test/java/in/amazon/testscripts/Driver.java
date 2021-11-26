package in.amazon.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.Mobiles;
import in.amazon.pages.Signin;

public class Driver extends Tools {
	protected static  LandingPage landingPage;
	protected static  Signin signIn; 
	protected static  Mobiles mobiles;
	protected static ApplePhones applePhones;
	protected static BuyPhone buyPhone;
	
public static void init() {
	
	driver =new ChromeDriver();
	landingPage = new LandingPage (driver);
	signIn=new Signin(driver);
	mobiles = new Mobiles (driver);
	applePhones = new ApplePhones (driver);
	buyPhone = new BuyPhone(driver);
}
	
	

}
