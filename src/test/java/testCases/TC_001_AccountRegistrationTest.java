package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {

	@Test(groups= {"Regression","Master"})
	public void test_account_Registration() { 
		
		logger.info("test sratrted");
		
		try 
		
		{
		
		HomePage hp= new HomePage(driver);
		
		hp.clickMyAccount();
		
		logger.info("test sratrted with account");
		
		hp.clickRegister();
		
		logger.info("test sratrted with register");
		
		//logger.info("clicked on register");
		
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		
		logger.info("providing customer data");
		
		regpage.setFirstname(randomeString().toUpperCase());
		
		regpage.setLastname(randomeString().toUpperCase());
		
		regpage.setEmail(randomeString()+"@gmail.com");
		
		regpage.setTelephone(randomeNumber());
		
		//String password= randomAlphaNumeric();
		
		regpage.setPassword("qwe@123");
		
		regpage.setConfirmPassword("qwe@123");
		
		regpage.setPrivacyPolicy();
		
		regpage.clickContinue();
		
		logger.info("varification step");
		
		String confmsg=regpage.getConfirmationMsg();
		
		System.out.println(confmsg);
		
		Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		
		}
		
		catch(Exception e) {
		
			logger.error("test finished");
			
		Assert.fail();

    }
		
		logger.info("///// test finished\\\\\\");
	
}
	}

	
	

		
		

	
	
	
	 
	

	
	
	

