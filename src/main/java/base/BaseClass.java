package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class BaseClass {
	 public String filename;
     public ChromeDriver driver;
     @BeforeMethod	
     public void preconditions() {
     	ChromeOptions option = new ChromeOptions();
         option.addArguments("guest");
     	driver=new ChromeDriver(option);
     	driver.manage().window().maximize();
     	driver.get("http://leaftaps.com/opentaps/");
     
     }

     @AfterMethod
     public void postconditions() {
     	driver.close();
     }
     

     @DataProvider(name="fetchData")
    public String[][] sendData() throws IOException {
    	return ReadExcel.ReadData(filename);
    }
}
