package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class WelcomePage extends BaseClass {
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	@Then("It should navigate to home screen")
	public void navigateshomepage() {
		System.out.println("successfully navigates to home screen");

	}
	
	public MyHomePage clickCrmsfaLink() {
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 return new MyHomePage(driver);
	}

}
