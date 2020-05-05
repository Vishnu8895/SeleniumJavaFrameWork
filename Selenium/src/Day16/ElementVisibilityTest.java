package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.freecrm.com/register/");
		
		//1.isDisplayed() Method is applicable for all elements		
		boolean b1=driver.findElement(By.name("action")).isDisplayed();
		
		System.out.println(b1); //true
		
		//2.isEnabled() Method
		boolean b2=driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2); //true
		
		//select I agree checkbox
		driver.findElement(By.id("terms")).click(); //submit button is enabled
		boolean b3=driver.findElement(By.name("action")).isEnabled();
		System.out.println(b3);//true
		
		
		//3.isSeleted() method is only applicable for checkbox , dropdown , radiobutton 
		boolean b4 =driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);//true
		
		//de-select the checkbox
		boolean b5 =driver.findElement(By.name("terms")).isSelected();
		System.out.println(b5);//false
		
		
	}

}
