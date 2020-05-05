package Day34;

import org.testng.annotations.Test;
/*
 * if test have an priority it will run by sequence(numeric,alphabetic)
 * if test have a same priority then it will run by class name with alphabetical order
 * some test have priority and some test don't have a priority then without priority test will run after that priority test will run
 * 
 */
public class TestNG_Priority {
	
	@Test(priority = 1) 
	public void one() {
		System.out.println("im inside test 1");
	}
	
	@Test(priority = 1)
	public void two() {
		System.out.println("im inside test 2");
	}
	
	@Test(priority = 1)
	public void three() {
		System.out.println("im inside test 3");

	}

}
 