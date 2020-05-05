package Day15;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("vishnu1060@rediffmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("ambilpure007");
		
		//driver.findElement(By.id("u_0_b")).click();
		WebElement loginbtn = driver.findElement(By.id("u_0_b")); //login button
		
		//Highlight the element(login button)
				flash(loginbtn, driver);
		
		//Highlight the border of login button
		   		drawBorder(loginbtn, driver);
		
		//TAKE SCREENSHOT AND STORE AS A FILE
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(src, new File("C:\\Users\\Vishnu\\workspace\\Selenium\\src\\Day15/highlight.png"));
		
		//TO GANARATE ALERT
				generateAlert(driver,"There is an isuue with login button");
	}
		
	//ExecuteScript ....is used to execute javaScript code
		public static void flash(WebElement element , WebDriver driver){
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			String bgcolor =element.getCssValue("backgroundColor");
				for(int i=0;i<30;i++){
					changeColor1("rgb(0,200,0)",element,driver);//1
					changeColor1(bgcolor , element , driver);//2
					
				}
		}
		//Highlight the element(login button)
		public static void changeColor1(String color, WebElement element, WebDriver driver){
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor = '"+color+"'" , element);
				 
			 try{
				 Thread.sleep(20);
			 } catch(InterruptedException e){
				 
			 }
			 }
		//Highlight the border of login button
			 public static void drawBorder(WebElement element, WebDriver driver){
					JavascriptExecutor js= ((JavascriptExecutor) driver);
					js.executeScript("arguments[0].style.border='3px solid red '", element);
		}
			 public static void generateAlert(WebDriver driver, String message){
				 JavascriptExecutor js= ((JavascriptExecutor) driver);
				 js.executeScript("alert('"+message+"')");
				 
			 }
			 
}

			 
			
			