package Day33;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class RegressionTest {
@Test
public void m1() {
System.out.println("First test case");
Assert.assertEquals(1, 1);
}
@Test
public void m2() {
	System.out.println("Second test case");
	Assert.assertEquals(2, 2);
}
@Test
public void m3() {
	System.out.println("Third test case");
	Assert.assertEquals(2, 3);
}
@Test
public void m4() {
	System.out.println("Fourth test case");
	Assert.assertEquals(4, 4);
	throw new SkipException("this test is skipped");
}
@Test
public void m5() {
	System.out.println("Fifth test case");
	Assert.assertEquals(5, 5);
}
}

