package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/*Headless Browser Example
 */
public class htmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		//WebDriver driver=new ChromeDriver();
		
		/*htmlUnitDriver is not available in selenium 3.0
		 *htmlUnitDriver to use this concept we have to download htmlUnitDriver jar file
			Advantages of htmlUnitDriver
		 *testing is happening behind the scenes.....no browser is launch
		 *very fast....execution of test cases...very fast performance of script
		 *not suitable for action class.......User actions...movement,doubleclick,drag and drop
		 *ghost rider...headless driver 
		 *  htmlUnit driver ....for java(headless driver
		 *  phantonjs ....for javascript 
		*/
		
		WebDriver driver=new HtmlUnitDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Before login title is:   "+driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("vishnu1060@rediffmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("ambilpure007");
		
		driver.findElement(By.id("u_0_b")).click();
		
		System.out.println("After login title is :  "+ driver.getTitle());
	}

}
