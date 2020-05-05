package classLecture;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignInApplication {

	public static WebDriver driver;
	public String baseUrl="http://automationpractice.com/index.php";
	
	
	@Test
	public void Tc_10() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(baseUrl);
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
	}
	
	@Test
	public void Tc_11() {
		d+river.findElement(By.id("email"))
	}
}
