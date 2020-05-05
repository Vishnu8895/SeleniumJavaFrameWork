package Day25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesFunction {
/*
 * A class in Selenium Library
 * Describes a series of key/value pairs
 * Used to set properties of browser like BrowserName , Platform , versions
 */

	public static void main(String[] args) {
		WebDriver driver= null;
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
				
		System.setProperty("webdriver.ie.driver","D:\\selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		driver.get("http://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		
	}

}
