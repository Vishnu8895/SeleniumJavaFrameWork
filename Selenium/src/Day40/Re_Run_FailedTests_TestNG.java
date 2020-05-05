package Day40;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/*
 * Re Run Failed test cases
 * WE use ReRun failed test case bcz when we are automating a 100 test case at a time it will take 5 to 6 hrs to run 
   in the middle of test running some test cases failed due to some enivormental issues like server down , network is slow or application is slow
   these failed test cases are not declared as a fail these are bug
 * So to check the bug test cases we will re run the tests 
 * when a test is failed in TestNg it will create an testng failed.xml file
 * Sometimes, you might want TestNG to automatically retry a test whenever it fails. In those situations, you can use a retry analyzer.
 * When you bind a retry analyzer to a test, TestNG automatically invokes the retry analyzer to determine if TestNG can retry a test case again in an attempt to see if the test that just fails now passes. 
 *  */
public class Re_Run_FailedTests_TestNG {

	@Test
	public void test1(){
		System.out.println("im inside test1");
	}

	
	@Test
	public void test2(){
		System.out.println("im inside test 2");
		//int i=1/0;
	}
	
	
	@Test(retryAnalyzer = Day40.Retry_Analyzer.class)
	public void test3(){
		System.out.println("im inside test 3");
		Assert.assertTrue(false);
	}
	
}
