package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Day20.PageObjectModel;

public class GoogleSearch_Test1 {
		private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
		
	}
	public static void googleSearch() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		//goto google.com
		driver.get("https://www.google.com/"); //URL
		
		//enter text in search text box
		
		PageObjectModel.textbox_search(driver).sendKeys("testing");
	
		
		Thread.sleep(2000);
		
		//click on search button
		
		PageObjectModel.button_search(driver).sendKeys(Keys.RETURN);
		
		
		System.out.println("Test completed Sucessfully");
		
		
	}
}
