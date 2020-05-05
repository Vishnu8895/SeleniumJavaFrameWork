package Day35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//Tests in multiBrowser using TestNg
//Tests in multiBrowser in parallel using TestNg

public class TestNG_using_MultiBrowser {
	
	WebDriver driver = null;
	
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName){
		System.out.println("Browser name is : "+browserName);
		
		if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    	
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "D:\\selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		
	}
	
	@Test
	public void test() throws Exception{
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void teardowm(){
		driver.close();
		System.out.println("Test completed sucessfully");
	}
}
