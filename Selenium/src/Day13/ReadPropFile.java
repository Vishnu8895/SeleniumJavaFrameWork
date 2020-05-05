
package Day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		
		Properties prop=new Properties(); //to read properties file
		
		FileInputStream ip=new FileInputStream("C:\\Users\\Vishnu\\workspace\\Selenium\\src\\Day13\\config.properties"); //copy the file location 
		
		prop.load(ip); //to load file 
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url=prop.getProperty("URL");
		System.out.println(url);
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

		if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		}else if(browserName.equals("IE")){
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
		}
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("FirstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("LastName"));
		

}
}
/*Config Properties
it will store data in key and value format
it is used to defined data and it an be used also for enivorment
*/