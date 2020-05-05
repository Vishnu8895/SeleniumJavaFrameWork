 package Day08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Implicit Wait
 * The elements load time on a web page can vary
 * not all the elements are loaded at the same time
 * In application developed using Ajax , Javascript  etc objects on web page may load at different time
 * To handle this ,we need to use waits in selenium
 * with the help of waits we can enables the script to wait for sometime before throwing No such elements exception
 * Implicit wait is used to defined a time period until when webdriver should wait before throwing No such element exception
 */

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		//DYNAMIC WAIT
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//page load timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //implicit wait time is applicable for are the elements available on page
		
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/a/h3")).click();
		
		
			
	}
}
