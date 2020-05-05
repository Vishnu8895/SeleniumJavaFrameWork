package Day04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopupAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");

		WebDriver driver=new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all cookies
		
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\document\\cbse answer key.xps");
		//To upload a file in browser
	}
}
 