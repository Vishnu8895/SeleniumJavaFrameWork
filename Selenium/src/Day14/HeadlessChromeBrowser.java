package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * Headless Browser
 * Headless browser are web browsers without a head or GUI (Graphical user interface)
 * i.e. you cannot see anything on screen,programs runs at backend
 * Headless browsers are software programs that access the web pages but do not show them to the user
 * eg. PhantomJs,Html unit browser , trifileJs , zombie.js
 */
/*
 * Headless Browsers are used for 
 * Running your test on a headless system like linux os without gui.
 * When you want to simulate multiple browser behavior on a single machine
 * to use minimum resources(bcz there is n gui)
 * need to run your test just for creation
 *   
 */
/*
 * headless Browser should not be used
 * if you need to visually observe your test on the browser
 * it does not give you exact feedback of what your customer will actually experience on your website
 * headless browser sometimes may throw error that is not observed or real browser
 */
public class HeadlessChromeBrowser {
	public static void main(String[] args) {
		test();
	}
	public static void test(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}

}
