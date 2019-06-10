package _01_Searching_Algorithms;

public class _00_LinearSearch {
	// When finding the location of a certain element in an array,
	// there are many algorithms that can do so. The simplest is the
	// linear search. This is best for short unsorted lists of data.
	public static int linearSearch(String[] words, String value) {
		// 1. Complete the method using a for loop to find the value
		// in the array. Return the location in the array
		// where the value was found.
		// If the value is not found in the array, return -1.
		int length = words.length;
		int rt = 0;
		for (int i = 0; i < length; i++) {
			if (words[i] == value) {
				rt = i;
				break;
			} else {
				rt = -1;
			}
		}
		return rt;
	}
}
