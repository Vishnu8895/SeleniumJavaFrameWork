package Day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/"); //URL
		
		driver.findElement(By.name("q")).sendKeys("testing"); //give input on google search
		
		List<WebElement> list = driver.findElements(By.xpath("//input"));
		
		int count =list.size();
		System.out.println("count of input elements :  "+count); //count the searched content 
		
		Thread.sleep(2000);
		
		
		
	}
}
