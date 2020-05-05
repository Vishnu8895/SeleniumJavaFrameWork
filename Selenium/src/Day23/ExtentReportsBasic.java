package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasic {
  static WebDriver driver = null;
 /*
 * Extent Report is a HTML reporting library
 * Extent Report is an open source reporting API for Java and .NET it creates interactive HTML report of your test session
 * Extent Report also has a commercial versions(pro)
 */
	
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search One Test" , ("This is atest for google search functionality"));
        
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	// log(Status, details)
        //test.log(Status.INFO, "This step shows usage of log(status, details)");
    	test1.log(Status.INFO,"Starting test case");
    	
    	driver.get("http://www.google.com/");
    	test1.pass("Navigate to google");
    	
    	driver.findElement(By.name("q")).sendKeys("testing shastra");
    	test1.pass("Enter text in searhbox");
    	
    	driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
    	test1.pass("Pressed keyboard enter key");
    	
    	driver.close();
    	driver.quit();
    	test1.pass("closed the browser");
    	
    	// info(details)
        //test.info("This step shows usage of info(details)");
        test1.info("Test Completed ");
    	
        // calling flush writes everything to the log file
        extent.flush();
    	
}
}