package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo {
	WebDriver driver =null;

	//Setup for test it will run before the test 
	@BeforeTest
	public void TestNG_Setup(){
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	
	}
	//Actual test of google search function
	@Test
	public  void googleSearch(){
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("test");
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		
		
	}
	public void tearDownTest(){
		driver.close();
		driver.quit();
		System.out.println("Test Completed Sucessfully");
	}
}
/*Advantages of TestNG
*Makes test creation execution and reporting efficient
*Helps in grouping of tests
*Helps in Prioritizing of tests
*parallel execution
*Reporting
*/