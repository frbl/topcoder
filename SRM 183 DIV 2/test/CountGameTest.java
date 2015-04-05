import org.junit.Test;
import static org.junit.Assert.*;

public class CountGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		int maxAdd = 3;
		int goal = 20;
		int next = 10;
		assertEquals(3, new CountGame().howMany(maxAdd, goal, next));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int maxAdd = 5;
		int goal = 20;
		int next = 10;
		assertEquals(5, new CountGame().howMany(maxAdd, goal, next));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int maxAdd = 5;
		int goal = 20;
		int next = 9;
		assertEquals(-1, new CountGame().howMany(maxAdd, goal, next));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int maxAdd = 4;
		int goal = 50;
		int next = 50;
		assertEquals(1, new CountGame().howMany(maxAdd, goal, next));
	}
}
