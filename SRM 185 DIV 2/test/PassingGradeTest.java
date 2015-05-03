import org.junit.Test;
import static org.junit.Assert.*;

public class PassingGradeTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] pointsEarned = new int[] {55,77,82,60};
		int[] pointsPossible = new int[] {100,100,100,100};
		int finalExam = 300;
		assertEquals(181, new PassingGrade().pointsNeeded(pointsEarned, pointsPossible, finalExam));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] pointsEarned = new int[] { 1, 2, 3, 4 };
		int[] pointsPossible = new int[] { 2, 3, 4, 5 };
		int finalExam = 7;
		assertEquals(4, new PassingGrade().pointsNeeded(pointsEarned, pointsPossible, finalExam));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] pointsEarned = new int[] { 1, 2, 2, 1 };
		int[] pointsPossible = new int[] { 9, 9, 9, 9 };
		int finalExam = 9;
		assertEquals(-1, new PassingGrade().pointsNeeded(pointsEarned, pointsPossible, finalExam));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] pointsEarned = new int[] { 7, 8, 7, 6 };
		int[] pointsPossible = new int[] { 8, 8, 8, 8 };
		int finalExam = 9;
		assertEquals(0, new PassingGrade().pointsNeeded(pointsEarned, pointsPossible, finalExam));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] pointsEarned = new int[] { 17, 23, 50, 200, 19, 56, 83, 91, 77, 9, 0 };
		int[] pointsPossible = new int[] { 20, 30, 50, 250, 20, 70, 100, 100, 100, 10, 10 };
		int finalExam = 400;
		assertEquals(129, new PassingGrade().pointsNeeded(pointsEarned, pointsPossible, finalExam));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] pointsEarned = new int[] {600,600,600,600,600,600,600,600,600,600,
 600,600,600,600,600,600,600,600,600,600};
		int[] pointsPossible = new int[] {1000,1000,1000,1000,1000,1000,1000,1000,
 1000,1000,1000,1000,1000,1000,1000,1000,
 1000,1000,1000,901};
		int finalExam = 3000;
		assertEquals(2886, new PassingGrade().pointsNeeded(pointsEarned, pointsPossible, finalExam));
	}
}
