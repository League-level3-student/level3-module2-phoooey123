package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	Random r1 = new Random();
	Random r2 = new Random();
	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		for (; true; ) {
			boolean sorted = isSorted(array);
			if (!sorted) {

				int r3 = r1.nextInt(array.length);
				int r4 = r2.nextInt(array.length);

				int a = array[r3];
				int b = array[r4];

				array[r4] = a;
				array[r3] = b;

				display.updateDisplay();
			}
			else {
				break;
			}
		}

	}

	boolean isSorted(int[] array) {
		boolean isSorted = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (i > i + 1) {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}
}
