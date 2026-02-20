package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadpage extends BaseClass{
	
   public ViewLeadpage(ChromeDriver driver) {
	   this.driver=driver;
   }
      public void verifyLead() {
		System.out.println("Lead is created");

	}
}
