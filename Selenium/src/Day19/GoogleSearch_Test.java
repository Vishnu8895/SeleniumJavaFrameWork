package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_Test {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
		
	}
	public static void googleSearch() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//goto google.com
		driver.get("https://www.google.com/"); //URL
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("testing");
		
		Thread.sleep(2000);
		
		//click on search button
		
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);//to click on search button
		
		
		
		System.out.println("Test completed Sucessfully");
		
		
	}
}
