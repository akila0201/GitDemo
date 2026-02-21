package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	@And("Enter the username as {string}")
	public LoginPage enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;

	}
	@And("Enter the password as {string}")
	public LoginPage enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}
	@When("Click on the Login button")
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	

	
}
