package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPomTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
		
	}
	
	public static void googleSearchTest(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
	
		 PageObjectModelGoogleSearch searchPage = new PageObjectModelGoogleSearch(driver);
		 
		 driver.get("http://google.com");
		 
		 searchPage.setTextBox("A B C D");
		 
		 searchPage.clickSearchButton();
		 
		 driver.close();
		 
	}

}
