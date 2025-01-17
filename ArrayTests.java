import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2, 3, 4, 5, 6, 7, 7}; // test 8 integers
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{7, 7, 6, 5, 4, 3, 2, 1}, input2);

    int[] input3 = {1, 3, 5};
    ArrayExamples.reverseInPlace(input3); // test 3 integers
    assertArrayEquals(new int[]{5, 3, 1}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1, 2, 3, 4, 5, 6}; // test 6 integers
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input2));

    int[] input3 = {1, 2, 3}; // test 3 integers
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input3));
  }


  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1.0, 2.0, 3.0}; // test 3 values
    double expected1 = 2.5;
    assertEquals(expected1, ArrayExamples.averageWithoutLowest(input1), 0);

    double[] input2 = {1.0, 2.0, 3.0, 7.0}; // test 4 values
    double expected2 = 4.0;
    assertEquals(expected2, ArrayExamples.averageWithoutLowest(input2), 0);    
    
    double[] input3 = {}; // test empty array
    double expected3 = 0.0;
    assertEquals(expected3, ArrayExamples.averageWithoutLowest(input3), 0);
  }
}
