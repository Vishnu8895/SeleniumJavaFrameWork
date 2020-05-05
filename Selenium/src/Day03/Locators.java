package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//1.FIRST LOCATOR ID
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		                        //or
		//WebElement uname=driver.findElement(By.id("txtUsername"));
		//uname.sendKeys("Admin");
		
		//2.LOCATOR NAME
		driver.findElement(By.name("txtPassword")).sendKeys("Admin1234");
		
		//3.LOCATOR CLASS
		driver.findElement(By.className("textInputContainer")).click();
		
		//4.XPATH
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		//5.CSS
		driver.findElement(By.cssSelector("#txtPassword")).click();
		
		
	
}
}