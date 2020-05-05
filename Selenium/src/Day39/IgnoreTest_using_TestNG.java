package Day39;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


/*
 * @Ignore annotation
 * @Ignore annotation is used at @Test level to ignore the particular method
 * If we want to ignore all the test then use @ignore annotation at class level
 * Also we can use @ignore annotation at package level...that all class as well as methods will be ignored 
 */

public class IgnoreTest_using_TestNG {
	
	@Test
	@Ignore
	public void test1(){
		System.out.println("im inside test1");
	}

	
	@Test
	public void test2(){
		System.out.println("im inside test 2");
	}
	
	
	@Test
	@Ignore
	public void test3(){
		System.out.println("im inside test 3");
	}
}
