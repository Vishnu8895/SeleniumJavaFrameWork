package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_xml_Function {
	WebDriver driver = null;
	/*
	 * TestNg.XMl is a configuration file in testNG 
	 * it is used to provide test execution settings 
	 * e.g include test ,class , package
	 * exclude tests , class , package
	 * set test dependency
	 * set test properties
	 * pass parameters to test methods
	 * run in parallel
	 * used to control execution of TestNG tests
	 *  */
	
	@BeforeTest
	public void TestNG_Setup(){
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	
	}
	//Actual test of google search function
	@Test
	public  void googleSearch2(){
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
