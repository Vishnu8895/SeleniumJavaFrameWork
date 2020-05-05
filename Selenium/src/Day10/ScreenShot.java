package Day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//TAKE SCREENSHOT AND STORE AS A FILE
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		
		//NOW COPY THE SCREENSHOT TO DESIRED LOCATION USING COPY FILE METHOD
		FileUtils.copyFile(src, new File("C:\\Users\\Vishnu\\workspace\\Selenium\\src\\Day10/google.png"));
	}

}
