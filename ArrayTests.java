import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2, 3, 4, 5, 6, 7, 7};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{7, 7, 6, 5, 4, 3, 2, 1}, input2);

    int[] input3 = {1, 3, 5};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{5, 3, 1}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input2));

    int[] input3 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1.0, 2.0, 3.0};
    double expected = 3.0;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input1));
  }
}
