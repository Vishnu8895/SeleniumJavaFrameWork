package Day33;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("******Test Started "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Robot robo = new Robot();
			Rectangle rect = new Rectangle();
			rect.setRect(0, 0, 1600, 720);
			String projectpath = System.getProperty("user.dir");

			BufferedImage img = robo.createScreenCapture(rect);
			ImageIO.write(img, "png", new java.io.File(projectpath+"ClassLecture"));
			//ImageIO.write(img, "png", new java.io.File (projectPath+"ClassLecture"));
			
			//error in screenshot
			} catch (AWTException | IOException e) {
			e.printStackTrace();
			System.out.println(e);
			}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)  {
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
