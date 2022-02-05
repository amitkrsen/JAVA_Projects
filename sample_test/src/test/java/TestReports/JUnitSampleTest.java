package TestReports;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class JUnitSampleTest extends JunitTestReporter {
	
	@Test
	public void sampleTest0() {
		assertTrue(1 < 2);
	}

	@Test
	public void sampleTest1() {
		assertTrue(1 > 2);
	}

	@Test
	public void sampleTest2() {
		assertTrue(1 < 2);
	}

	@Test
	public void sampleTest4() {
		assertTrue(1 > 2);
	}

}
