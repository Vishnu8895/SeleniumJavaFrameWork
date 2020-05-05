package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/home/"); //URL
		
		driver.findElement(By.name("email")).sendKeys("ambilpure.vishnu4@gmail.com"); //Login ID
		driver.findElement(By.name("password")).sendKeys("Vishnu@123");  //Password
		Thread.sleep(2000); //Time break
		
		driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click(); //Login Button click
		
		driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span")).click(); //click on contacts button
		
		
		//CONTACT LIST
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]
		
		String before_xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath ="]/td[2]";
		
		for(int i=1;i<=4;i++){
			String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
