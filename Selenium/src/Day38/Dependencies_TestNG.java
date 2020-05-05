package Day38;

import org.testng.annotations.Test;
/*
 * Dependencies are set at @Test method
 * To create a dependencies within @Test annotation we need to create a parameter 
 *  Two types of dependencies parameter 1.dependsOnGroups 2.dependsOnmethods
 *  When we set  dependencies  and priority  to the @test annotation dependencies preference will be first after that  priority
 *  also we can run dependencies as testng.xml file 
 */

public class Dependencies_TestNG {

	@Test(dependsOnGroups = "sanity2")
	public void test1() {
		System.out.println("im inside test 1");
	}


	@Test(groups = "sanity2")
	public void test2() {
		System.out.println("im inside test 2");
	}


	@Test(groups = "sanity3")
	public void test3() {
		System.out.println("im inside test 3");
	}

}
