package Day37;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 * @Parameters annotation can be placed on any method that already has following annotations like..@Test , @Before/After , @Factory etc...
 * @Parameters annotation can also be placed class constructor
 * In testing.xml you can put parameters under <suite> or <test> tag
 * If two parameters have the same name its the one defined in <test> that has precedence
 * This is convenient if you need to specify a parameters applicable to all your tests and override its value only for certain tests
 * Also we can use @optional option in parameters    
 */
public class Parameters_TestNG {

	@Test
	@Parameters({"My Name"})
	public void test(String name) {

		System.out.println("my name is :"+name);
	}
}
