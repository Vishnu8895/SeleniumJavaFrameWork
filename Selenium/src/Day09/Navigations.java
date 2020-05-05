package Day09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//get will launch the url
		
		driver.navigate().to("https://www.amazon.com");	//navigate.to is used to launch url  as well as move from one url to another 
		
		//BACK AND FORWARD SIMULATION
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
	}

}
