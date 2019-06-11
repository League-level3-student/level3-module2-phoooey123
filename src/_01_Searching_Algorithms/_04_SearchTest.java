package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] check = {"apple", "carrot", "rug", "quiz"};
		assertEquals(1, _00_LinearSearch.linearSearch(check, "carrot"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] check = {1,2,3,4,7,9};
		assertEquals(4, _01_BinarySearch.binarySearch(check, 0, 5, 7));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] check = {100,200,300,400,500,600};
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(check, 200));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] check = {4, 7, 8, 12, 18, 22, 28, 30};
		assertEquals(6, _03_ExponentialSearch.exponentialSearch(check, 28));
	}
}
