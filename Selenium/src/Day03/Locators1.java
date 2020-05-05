package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//6.LINKEDTEXT
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//7.PARTIAL LINK TEXT
		driver.findElement(By.partialLinkText("Forgot your")).click();

		//8.TAGNAME
		driver.findElement(By.tagName("img"));
		System.out.println(driver.findElement(By.tagName("img")).getSize());
		
		
		
		
		
		
		
		
		
		
		
		
}
}