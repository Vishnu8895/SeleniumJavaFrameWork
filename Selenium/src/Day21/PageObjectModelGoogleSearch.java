package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageObjectModelGoogleSearch {
	WebDriver driver = null;
	
	By textbox_googleSearch = By.name("q");
	
	By button_googleSearch = By.name("btnK");
	
	//consructor
	
	public PageObjectModelGoogleSearch(WebDriver driver ) {
		this.driver = driver;
		
	}

	//test cases for textbox  and search button 
	
	public void setTextBox(String text){
		driver.findElement(textbox_googleSearch).sendKeys(Keys.RETURN);
	}
	
	public void clickSearchButton(){
		driver.findElement(button_googleSearch).sendKeys(Keys.RETURN);
	}
}
/* Benefits of Page Object Model
 * Test Objects and Functions are separated by easy maintenance and keeping the code clean
 * Objects are kept separated from test scripts and can be used multiple times in tests 
 * Every unique object locator is created only once
 * Easy maintenance and less rework
 * 
*/
