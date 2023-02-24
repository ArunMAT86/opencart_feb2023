package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver){
		
		super (driver);
	}
	
	@FindBy(name="firstname")
	
	WebElement txtFirstName;
	
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	
	@FindBy(name= "telephone")
	WebElement txtTelephone;
	
	@FindBy(name= "password")
	WebElement txtPassword;
	
	
	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	

	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstname(String fname){
		 
		txtFirstName.sendKeys(fname);
		
	}
		public void setLastname(String lname){
			
			txtLastName.sendKeys(lname);
		
	}
		
		public void setEmail(String email){
			
			txtEmail.sendKeys(email);

}
		public void setTelephone(String tel){
			
			txtTelephone.sendKeys(tel);
			
		}
		
		
		public void setPassword(String pwd){
			
			txtPassword.sendKeys(pwd);
				
		}
		
		public void setConfirmPassword(String pwd){
			
			txtConfirmPassword.sendKeys(pwd);
		}
		
		public void setPrivacyPolicy(){
			
			chkdPolicy.click();
		}
		
                 public void clickContinue(){
			
                	 btnContinue.click();
                	  
}
		
		public String getConfirmationMsg() {
			
			try {
			
			return(msgConfirmation.getText());
		}
			catch(Exception e) {
				
				return (e.getMessage());
			}
			
}

}


