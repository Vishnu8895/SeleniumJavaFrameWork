package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugTest {
	WebDriver driver=null;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://learn-automation.com/");
		
		String title=driver.getTitle();
		boolean value=title.contains("Selenium");
		System.out.println("Status value is " +value);

	}
	public void test() {
		driver.quit();
	}
}