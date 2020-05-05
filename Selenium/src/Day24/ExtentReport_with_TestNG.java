package Day24;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport_with_TestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver =null;
	
	
	@BeforeSuite
	public void setup(){
		
		
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
	
		
	}
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
    	driver=new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException{
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        driver.get("https://www.google.com/");
		test.pass("navigate to google");
		
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test1() throws IOException{
	
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	
	}
	@AfterTest
	public void tearDownTest(){
		driver.close();
		driver.quit();
		System.out.println("Test Completed Suessfully");
		
	}
        @AfterSuite
	public void teardown(){
	
		extent.flush();
	}
	
}
