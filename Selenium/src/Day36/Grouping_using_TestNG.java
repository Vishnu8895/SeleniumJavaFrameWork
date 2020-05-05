package Day36;

import org.testng.annotations.Test;

/*
 * GROUPING IN TESTNG
 * Grouping is a feature in TestNG where we can assign tests or classes to one or more groups
 * During execution we an define what groups to include or exclude
 * This makes test management and execution very easy and efficient
 * we can define a group at class level also
 * 
 */

@Test(groups="All tests")
public class Grouping_using_TestNG {

	@Test(groups={"sanity"})
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test(groups={"sanity","smoke"})
	public void test2() {
		System.out.println("This is test 2");
	}

	@Test(groups={"regression"})
	public void test3() {
		System.out.println("This is test 3");
	}

	@Test
	public void test4() {
		System.out.println("This is test 4");
	}
}
