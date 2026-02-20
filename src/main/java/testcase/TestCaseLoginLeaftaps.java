package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TestCaseLoginLeaftaps extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		filename="POMLogin";
	}
    @Test(dataProvider="fetchData")
	public void Login(String username, String pass) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username).enterPassword(pass).clickLoginButton();
	}
	
	
	
	
}
