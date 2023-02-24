package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void test_login() 
	{
		
		
		try {
		
		logger.info("====test started======");
		
		HomePage hp= new HomePage(driver);
		
		hp.clickMyAccount();
		
		logger.info("clicked on my account");
		
		hp.clickLogin();
		
		logger.info("clicked on login button");
		
		LoginPage lp=  new LoginPage(driver);
		
		lp.setEmail(rb.getString("email"));
		
		lp.setPassword(rb.getString("password"));
		
		lp.clickLogin();
		
		MyAccountPage macc= new MyAccountPage(driver);
		
		boolean targetpage= macc.isMyAccountPageExists();
		
		Assert.assertEquals(targetpage, true);
		
		}
		
		catch(Exception e) {
			
			Assert.fail();
		}
		
		logger.info("====test finished======");
	
	}
}
		
		
		
	


