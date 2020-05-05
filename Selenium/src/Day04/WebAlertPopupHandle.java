package Day04;
//JAVA SCRIPT WEB POPUP ALERTS
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver (2).exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);//for wait some time
		
		driver.switchTo().alert();  //switching the screen
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals(" Please enter a valid user name" )){
			System.out.println("Correct alert massage");
		}else{
			System.out.println("Incorrect alert massage");
		}
		
		alert.accept();  //click ok button
		//  alert.dismiss(); click ok to dismiss
		
		
		

	}

}
