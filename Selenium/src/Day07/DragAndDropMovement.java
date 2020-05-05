package Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMovement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);// if frame is available use switch otherwise don't use
		
		Actions action=new Actions(driver);  //Action class is used for drag and drop movement 
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		
		
		

	}

}
