package Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTestScript {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
			
		WebDriver driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
			
			driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Vishnu");
			
			
	}
}
