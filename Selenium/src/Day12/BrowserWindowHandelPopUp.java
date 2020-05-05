package Day12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandelPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Thread.sleep(3000);
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it=handler.iterator();
	
		String ParentWindowId=it.next();

		System.out.println("parent window id :"+ ParentWindowId);  //it will give first value
		
		String ChildWindowId=it.next();

		System.out.println("child window id :"+ ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
		
		System.out.println("child window popup title "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("Parent window popup title "+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
	}

}
