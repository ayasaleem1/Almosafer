package project_aya2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Parameter {
	WebDriver driver = new ChromeDriver();
	SoftAssert my_assert= new SoftAssert();
	@BeforeTest 
	public void my_setup() {
		
		
	}
	

}
