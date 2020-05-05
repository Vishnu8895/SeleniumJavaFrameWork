package Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[15]/ul/li[6]/a")).click();
		
	}
	}


