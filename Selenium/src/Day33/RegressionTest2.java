package Day33;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners
public class RegressionTest2 {
@Test
public void m6() {
System.out.println("six test case");
}

@Test
public void m7() {
	System.out.println("Seven test case");
}

@Test
public void m8() {
	System.out.println("eight test case");
}

@Test
public void m9() {
	System.out.println("nine test case");
	throw new SkipException("this test is skipped");
}
@Test
public void m10() {
	System.out.println("tenth test case");
	Assert.assertEquals(10,10);
}
}

