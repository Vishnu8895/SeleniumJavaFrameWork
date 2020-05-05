package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://ui.cogmento.com/");
			
			driver.findElement(By.name("email")).sendKeys("ambilpure.vishnu4@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Vishnu@123");
			driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
			
			driver.switchTo().frame(0);			
			driver.findElement(By.xpath("//a[contains(item-text(),'Contacts')]")).click();
}
}

